	// 百度地图API功能
	var map = new BMap.Map("allmap");
	var point = new BMap.Point(116.404, 39.955);
	map.centerAndZoom(point, 15);
	// 编写自定义函数,创建标注
	function addMarker(point) {
		var marker = new BMap.Marker(point);
		map.addOverlay(marker);
	}


	map.addControl(new BMap.NavigationControl());
	map.addControl(new BMap.ScaleControl());
	map.addControl(new BMap.OverviewMapControl());
	// map.addControl(new BMap.MapTypeControl());


	//随机向地图添加10个标注
	var bounds = map.getBounds();
	var sw = bounds.getSouthWest();
	var ne = bounds.getNorthEast();
	var lngSpan = Math.abs(sw.lng - ne.lng);
	var latSpan = Math.abs(ne.lat - sw.lat);
	for (var i = 0; i < 10; i++) {
		var point = new BMap.Point(sw.lng + lngSpan * (Math.random() * 0.7), ne.lat - latSpan * (Math.random() * 0.7));
		addMarker(point);
	}



	// 定位
	// var point = new BMap.Point(116.331398, 39.897445);
	// map.centerAndZoom(point, 12);

	// var geolocation = new BMap.Geolocation();
	// geolocation.getCurrentPosition(function (r) {
	// 	if (this.getStatus() == BMAP_STATUS_SUCCESS) {
	// 		var mk = new BMap.Marker(r.point);
	// 		map.addOverlay(mk);
	// 		map.panTo(r.point);
	// 		alert('您的位置：' + r.point.lng + ',' + r.point.lat);
	// 	} else {
	// 		//alert('failed' + this.getStatus());
	// 	}
	// });


	