//办理
function pro(){
	if(isCheckOne()){
		location.href="pro.do?"
		+"id="+getCheckOneValue()+"&pageFuncId="+$("#pageFuncId").val();
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
}


//办理提交
function proDo(){
	$.ajax({
		url:"proDo.do",
		type:"POST",
		data:{
			id:$("id_").val(),
			content:$("content_").val(),
			name:$("name_").val()
		},
		dataType:"JSON",
		success:function (data){
			location.href="list.do";
		}
	});
}
//查看详情
function check(){
	if(isCheckOne()){
		location.href="check.do?"
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
				location.href="guestbookDel.do?pageFuncId="+$("#pageFuncId").val()+"&ids="+getCheckValue();
			}
		});
		confirm.show();
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择数据"); 
	}
}