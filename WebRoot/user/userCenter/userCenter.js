$(function(){
    $(".userinfo").css("display","none");
    $(".collect-list").css("display","none");
    $(".addkid").css("display","none");

    $(".da").click(function(){
        $(".userinfo").css("display","none");
        $(".collect-list").css("display","none");
        $(".addkid").css("display","none");
        $(".dairy").css("display","block");
    });
    $(".inf").click(function(){
        $(".userinfo").css("display","block");
        $(".collect-list").css("display","none");
        $(".addkid").css("display","none");
        $(".dairy").css("display","none");
    });
    $(".colle").click(function(){
        $(".userinfo").css("display","none");
        $(".collect-list").css("display","block");
        $(".addkid").css("display","none");
        $(".dairy").css("display","none");
    });
    $(".add").click(function(){
        $(".userinfo").css("display","none");
        $(".collect-list").css("display","none");
        $(".addkid").css("display","block");
        $(".dairy").css("display","none");
    });


});