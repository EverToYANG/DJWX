//表单验证
function formCheck(){
	var ischeck=true;
	if($.trim($("#name").val())==""){
		$("#nameHelp").html("必须填写");
		$("#nameDiv").addClass("error");
		$("#name").focus();
		ischeck=false;
	}else{
		$("#nameHelp").html("");
		$("#nameDiv").removeClass("error");
	}
	if($.trim($("#email").val())!="" 
		&& !isEmail($("#email").val())){
		$("#emailHelp").html("格式不正确");
		$("#emailDiv").addClass("error");
		$("#email").focus();
		ischeck=false;
	}else{
		$("#emailHelp").html("");
		$("#emailDiv").removeClass("error");
	}
	return ischeck;
}