//表单验证
function formCheck(){
	var ischeck=true;
	if($("#oldpwd").val()==""){
		$("#oldpwdHelp").html("必须填写");
		$("#oldpwdDiv").addClass("error");
		$("#oldpwd").focus();
		ischeck=false;
	}else{
		$("#oldpwdHelp").html("");
		$("#oldpwdDiv").removeClass("error");
	}
	if($("#pwd").val()==""){
		$("#pwdHelp").html("必须填写");
		$("#pwdDiv").addClass("error");
		$("#pwd").focus();
		ischeck=false;
	}else{
		$("#pwdHelp").html("");
		$("#pwdDiv").removeClass("error");
	}
	if($.trim($("#pwd").val()).length<6){
		$("#pwdHelp").html("密码最少6位!");
		$("#pwdDiv").addClass("error");
		isSubmit = false;
	}else{
		$("#pwdHelp").html("");
		$("#pwdDiv").removeClass("error");
	}
	if($("#repwd").val()==""){
		$("#repwdHelp").html("必须填写");
		$("#repwdDiv").addClass("error");
		$("#repwd").focus();
		ischeck=false;
	}else{
		if($("#pwd").val()!=$("#repwd").val()){
			$("#repwdHelp").html("与新密码不一致");
			$("#repwdDiv").addClass("error");
			$("#repwd").focus();
			ischeck=false;
		}else{
			$("#repwdHelp").html("");
			$("#repwdDiv").removeClass("error");
		}
	}
	return ischeck;
}