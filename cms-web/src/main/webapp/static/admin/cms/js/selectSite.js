//选择站点
function selectSite(contextPath){
	openWindow('切换站点',contextPath+'/cms/siteSelect.do',500,0,'false');
}


function querySite(title){
	var siteTreeHtml = "<tr treeItemLevel=\"1\"> ";
	$.ajax({
		type: "post",
		url: basePath+"/cms/siteQuery.json?title="+title,
		success: function(data, textStatus){
			var obj = eval("("+data+")");
			for (var i=0;i<obj.length;i++){
				siteTreeHtml = "<td style=\"width: 100%\"> <a href=\"${pageContext.request.contextPath}/cms/siteSwitch.do?id="+obj[i].id+"\">"+obj[i].name+"</a></td>"
			}
			siteTreeHtml = siteTreeHtml+"</tr>";
			$("#siteTree").empty();
			$("#siteTree").html(siteTreeHtml);
		},
		complete: function(XMLHttpRequest, textStatus){
			//HideLoading();
		},
		error: function(){
			//请求出错处理
		}
	});
}