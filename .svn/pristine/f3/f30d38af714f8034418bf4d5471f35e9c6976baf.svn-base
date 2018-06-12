//添加
function add(){
	location.href="templetAdd.do?pageFuncId="+$("#pageFuncId").val();
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
	if(isCheck()){
		var confirm = $.scojs_confirm({
		content: "确定删除操作么?此操作无法回退!",
		action: function() {
				location.href="templetDel.do?pageFuncId="+$("#pageFuncId").val()+"&ids="+getCheckValue();
			}
		});
		confirm.show();
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择数据"); 
	}
}

//文件管理
function fileManage(){
	if(isCheckOne()){
		location.href="templetFileManage.do?id="+getCheckOneValue()+"&pageFuncId="+$("#pageFuncId").val();
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

function delImg(){
	$("#oldImgSpan").fadeOut("slow"); 
	$("#oldImg").val("");
}