
//添加
function add(){
	openWindow('添加链接分类','templetLinkEdit.do?templetid='+$("#templetid").val(),500,380,'false');
}
//表单验证
function formCheck(){
	if($.trim($("#name").val())==""){
		$("#nameHelp").html("必须填写");
		$("#nameDiv").addClass("error");
		$("#name").focus();
		return false;
	}else{
		$("#nameHelp").html("");
		$("#nameDiv").removeClass("error");
	}
	return true;
}
//编辑
function edit(){
	if(isCheckOne()){
		openWindow('编辑敏感词','templetLinkEdit.do?id='+getCheckOneValue()+'&templetid='+$("#templetid").val(),500,380,'false');
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
				location.href="templetLinkDel.do?pageFuncId="+$("#pageFuncId").val()+"&ids="+getCheckValue()+"&templetid="+$("#templetid").val();
			}
		});
		confirm.show();
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择数据"); 
	}
}
//从站点导入
function importSite(){
	if($("#templetid").val()!=""){
		openWindow('从站点导入','siteSelect.do?siteClick=importSiteLink&templetid='+$("#templetid").val(),500,0,'true');
	}
}