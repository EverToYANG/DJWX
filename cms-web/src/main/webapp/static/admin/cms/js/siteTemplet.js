//模板管理页面选择站点
function templetSelectSite(id,name){
	$("#templetFrame").attr("src","templetList.do?pageFuncId="+$("#pageFuncId").val()+"&siteId="+id);
	$("#templetFrame").load(function(){
		$(this).height($(this).contents().find("body").height()+60); 
	}); 
}


function add(){
	if(isCheckOne()){
		location.href="templetSiteAdd.do?pageFuncId="+$("#pageFuncId").val()+"&siteId="+$("#siteId").val()+"&templetId="+getCheckOneValue();
		/*var confirm = $.scojs_confirm({
		content: "确定添加操作么?",
		action: function() {
				location.href="templetSiteAdd.do?pageFuncId="+$("#pageFuncId").val()+"&siteId="+$("#siteId").val()+"&templetId="+getCheckOneValue();
			}
		});
		confirm.show();
		$("#errorDiv").fadeOut("slow"); */
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
	//openWindow('添加模板','templetSiteToAdd.do?siteId='+$("#siteId").val(),800,0,'false');
}
//表单验证
function formCheck(){
	var isCheck=true;
	if($.trim($("#name").val())==""){
		$("#nameHelp").html("必须填写");
		$("#nameDiv").addClass("error");
		$("#name").focus();
		isCheck=false;
	}else{
		$("#nameHelp").html("");
		$("#nameDiv").removeClass("error");
	}
	return isCheck;
}
function siteSelect(){
	openWindow('选择可使用的站点','siteCheck.do?selectSiteIds='+$("#siteids").val(),500,0,'false');
}
function clearSite(){
	$("#sitenames").val("");
	$("#siteids").val("");
}

//编辑
function edit(){
	if(isCheckOne()){
		openWindow('编辑模板','templetEdit.do?id='+getCheckOneValue(),500,0,'false');
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
}



function del(){
	if(isCheckOne()){
		var confirm = $.scojs_confirm({
		content: "确定删除操作么?此操作无法回退",
		action: function() {
				location.href="templetSiteDel.do?pageFuncId="+$("#pageFuncId").val()+"&siteId="+$("#siteId").val()+"&templetid="+getCheckOneValue();
			}
		});
		confirm.show();
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
}

//文件管理
function fileManage(){
	if(isCheckOne()){
		location.href="templetSiteFileManage.do?id="+getCheckOneValue()+"&siteId="+$("#siteId").val();
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
}
//初始化数据
function data(){
	if(isCheckOne()){
		location.href="templetChannel.do?id="+getCheckOneValue()+"&pageFuncId="+$("#pageFuncId").val();
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
}

//导出
function exportZip(){
	if(isCheckOne()){
		$("#errorInfo").html("正在导出中，请稍候...");
		location.href="templetExport.do?id="+getCheckOneValue();
		$("#errorDiv").fadeIn("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
}