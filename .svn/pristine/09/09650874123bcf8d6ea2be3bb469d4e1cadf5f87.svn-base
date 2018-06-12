
function delImg(){
	$("#oldImgSpan").fadeOut("slow"); 
	$("#oldImg").val("");
}
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
	if($.trim($("#intro").val()).length>200){
		$("#introHelp").html("最多200个字符");
		$("#introDiv").addClass("error");
		$("#intro").focus();
		ischeck=false;
	}else{
		$("#introHelp").html("");
		$("#introDiv").removeClass("error");
	}
	return ischeck;
}