create database baby


create table parent (
   parentID             varchar(30)     primary key     not null,
   pwd                  varchar(100)    not null,
   name                 varchar(50)          null,
   sex                  char(4)    check (sex='��'or sex='Ů')       not   null,
   birth                datetime             null,
   role                 char(10)             null,
   address              varchar(100)         null,
   phone                char(11)             null,
   status               bit     default 1       not null,
)
go


create table kid (
   kidID              int     primary key   identity(1,1)     not null,
   parentID            varchar(30)       foreign key references      parent(parentID)             null,
   kidName            varchar(50)          null,
   kidsex             char(4)    check (kidSex='��'or kidSex='Ů')          not   null,
   kidBirth           datetime             null,
   kidSocialStatus    bit      default 0       null,
   kidStatus          bit        default 1     null,
)
go


create table appoint (
   appointID            int  primary key   identity(1,1)     not null,
   parentID            varchar(30)    foreign key references      parent(parentID)      null,
   par_parentID        varchar(30)    foreign key references      parent(parentID)      null,
   appointPlace         varchar(100)         null,
   appointTime          datetime             null,
   appointCreateTime    datetime   default getDate()          null,
   appointLevel         char(4)              null,
   appointComment       varchar(200)         null,
   appointStatus        bit                  null,
)
go


create table articleType (
   articleTypeID        int    primary key   identity(1,1)    not null,
   articleTypeName      varchar(50)          null,
   articleTypeCreateTime datetime      default getDate()           null,
   articleTypeStatus    bit      default 1      null,
)
go


create table article (
   articleID            int     primary key   identity(1,1)    not null,
   articleTypeID        int   foreign key references  articleType(articleTypeID )      null,
   articleTitle         varchar(50)          null,
   articleContent       varchar(200)         null,
   articleCreateTime    datetime      default getDate()           null,
   articleStatus        bit      default 1       null,
)
go




create table articleCollect (
   articleCollectID     int      primary key   identity(1,1)       not null,
   parentID            varchar(30)          foreign key references      parent(parentID)      null,
   articleID            int         foreign key references  article(articleID)         null,
   articleCollectTime   datetime     default getDate()      null,
)
go


create table articleComment (
   articleCommentID     int              primary key      identity(1,1)     not null,
   articleID            int               foreign key references  article(articleID)            null,
   parentID             varchar(30)                         foreign key references      parent(parentID)            null,
   articleCommentContent varchar(200)         null,
   articleCommentTime   datetime    default getDate()          null,
   articleCommentStatus bit      default 1       null,
)
go

create table diaryType(
   diaryTypeID              int    primary key   identity(1,1)     not null,
   parentID             varchar(30)      foreign key references      parent(parentID)            null,
   diaryTypeName           varchar(30)          null,
   createTime           datetime   default getDate()     null,
   diaryTypeStatus          bit     default 1       null,
)

create table diary (
   diaryID              int    primary key   identity(1,1)     not null,
   parentID             varchar(30)      foreign key references      parent(parentID)            null,
   diaryTypeID              int    foreign key references      diaryType(diaryTypeID)    not null,
   dairyTitle           varchar(30)          null,
   diaryContent         nvarchar(4000)                 null,
   createTime           datetime   default getDate()     null,
   diaryStatus          bit     default 1       null,
)



go

create table diaryComment (
   diaryCommentID        int primary key identity(1,1) NOT NULL ,--����id,
  parentID              varchar(30) foreign key references   parent(parentID) NOT NULL ,--������userID
  diaryID           int          foreign key references     diary(diaryID)    not null,--����ID
  parentDiaryCommentID     int                      null,--������id
  parentDiaryCommentParentID   varchar(30) foreign key references   parent(parentID) null,--�����۵��û�userID
  replyDiaryCommentID      int                      null,--���ظ�������id,
  replyDiaryCommentParentID    varchar(30) foreign key references   parent(parentID) null ,--���ظ��������û�userID
  commentLevel        bit            default 1  not null, --1 һ������ Ĭ�� ��2 ��������
  diaryCommentContent       nvarchar(200)            NOT NULL, --����
  diaryCommentTime          datetime       default  getDate()     NOT NULL , -- ����ʱ��
  diaryCommentStatus   bit      default 1     null,
)
go



create table recommendPlan (
   recommendPlanID      int     primary key   identity(1,1)      not null,
   parentID             varchar(30)      foreign key references      parent(parentID)           null,
   recommendPlanTitle   varchar(50)          null,
   recommendPlanContent varchar(200)         null,
   recommendPlanRemindTime datetime             null,
   recommendPlanStatus  bit     default 1      null,
)
go

create table schedule (
   scheduleID           int     primary key   identity(1,1)     not null,
   parentID             varchar(30)       foreign key references      parent(parentID)          null,
   scheduleTitle        varchar(50)          null,
   scheduleContent      varchar(200)         null,
   scheduleCreateTime   datetime    default getDate()          null,
   scheduleRemindTime   datetime             null,
   location              varchar(100)           null,
   scheduleStatus       bit      default 1    null,    --1  ��Ч   0  ��Ч��ɾ���ȵȣ����ǹ��ڣ�
)
go



create view parentShow
as

select a.parentID,pwd,name,sex,birth,role,address,phone,status,count(b.kidID) as kidNum
from parent a left join kid b
on a.parentID=b.parentID
group by a.parentID,pwd,name,sex,birth,role,address,phone,status
go


create view diaryShow
as

select diary.diaryID,diary.parentID,diary.diaryTypeID,b.diaryTypeName,dairyTitle,diaryContent,diary.createTime,diaryStatus,
count(diaryComment.diaryCommentID) as CommentNum
from diary left join diaryComment on diary.diaryID =diaryComment.diaryID
join diaryType b on diary.diaryTypeID=b.diaryTypeID 

group by diary.diaryID,diary.parentID,diary.diaryTypeID,b.diaryTypeName,dairyTitle,diaryContent,diary.createTime,diaryStatus

go



