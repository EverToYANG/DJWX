//办理
function add(){
	location.href="add.do?"
}
//办理
function edit(){
	if(isCheckOne()){
		location.href="edit.do?"
		+"id="+getCheckOneValue()+"&pageFuncId="+$("#pageFuncId").val();
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
}
//表单验证
function formCheck(){
	if($.trim($("#recontent").val())==""){
		$("#recontentHelp").html("必须填写");
		$("#recontentDiv").addClass("error");
		$("#recontent").focus();
		return false;
	}else if($.trim($("#recontent").val()).length>500){
		$("#recontentHelp").html("不能超过500个字符");
		$("#recontentDiv").addClass("error");
		$("#recontent").focus();
		return false;
	}else{
		$("#recontentHelp").html("");
		$("#recontentDiv").removeClass("error");
	}
	return true;
}


function del(){
	if(isCheck()){
		var confirm = $.scojs_confirm({
		content: "确定删除操作么?此操作无法回退!",
		action: function() {
				location.href="applyopenDel.do?pageFuncId="+$("#pageFuncId").val()+"&ids="+getCheckValue();
			}
		});
		confirm.show();
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择数据"); 
	}
}