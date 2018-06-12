//表单验证
function formCheck(){
	var isCheck=true;
	
	if($.trim($("#code").val())==""){
		$("#codeHelp").html("必须选择");
		$("#codeDiv").addClass("error");
		$("#code").focus();
		isCheck=false;
	}else{
		$("#codeHelp").html("");
		$("#codeDiv").removeClass("error");
	}
	if($.trim($("#name").val())==""){
		$("#nameHelp").html("必须选择");
		$("#nameDiv").addClass("error");
		$("#name").focus();
		isCheck=false;
	}else{
		$("#nameHelp").html("");
		$("#nameDiv").removeClass("error");
	}
	return isCheck;
}
//添加
function add(){
	openWindow('添加会员权限','memberauthEdit.do',500,340,'false');
}
//编辑
function edit(){
	if(isCheckOne()){
		openWindow('编辑会员权限','memberauthEdit.do?id='+getCheckOneValue(),500,340,'false');
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
}
//删除
function del(){
	if(isCheck()){
		var confirm = $.scojs_confirm({
		content: "确定删除操作么?此操作无法回退!",
		action: function() {
				location.href="memberauthDel.do?pageFuncId="+$("#pageFuncId").val()+"&ids="+getCheckValue();
			}
		});
		confirm.show();
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择数据"); 
	}
}
