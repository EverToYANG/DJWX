//表单验证
function formCheck(){
	if($.trim($("#sensitiveword").val())==""){
		$("#sensitivewordHelp").html("必须填写");
		$("#sensitivewordDiv").addClass("error");
		$("#sensitiveword").focus();
		return false;
	}else{
		$("#sensitivewordHelp").html("");
		$("#sensitivewordDiv").removeClass("error");
	}
	return true;
}
//添加
function add(){
	openWindow('添加敏感词','sensitiveEdit.do',500,230,'false');
}
//编辑
function edit(){
	if(isCheckOne()){
		openWindow('编辑敏感词','sensitiveEdit.do?id='+getCheckOneValue(),500,230,'false');
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
				location.href="sensitiveDel.do?pageFuncId="+$("#pageFuncId").val()+"&ids="+getCheckValue();
			}
		});
		confirm.show();
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择数据"); 
	}
}