
  function checkform(){
  	var ischeck=true;
	if($("#tomembernames").val()==""){
		$("#tomembernamesHelp").html("必须填写");
		$("#tomembernamesDiv").addClass("error");
		$("#tomembernames").focus();
		ischeck=false;
	}else{
		$("#tomembernamesHelp").html("");
		$("#tomembernamesDiv").removeClass("error");
	}
	if($.trim($("#title").val())==""){
		$("#titleHelp").html("必须填写");
		$("#titleDiv").addClass("error");
		$("#title").focus();
		ischeck=false;
	}else{
		$("#titleHelp").html("");
		$("#titleDiv").removeClass("error");
	}
	if($.trim($("#description").val())==""){
		$("#descriptionHelp").html("必须填写");
		$("#descriptionDiv").addClass("error");
		$("#description").focus();
		ischeck=false;
	}else{
		$("#descriptionHelp").html("");
		$("#descriptionDiv").removeClass("error");
	}
	if($.trim($("#description").val()).length>500){
		$("#descriptionHelp").html("最多500个字符");
		$("#descriptionDiv").addClass("error");
		$("#description").focus();
		ischeck=false;
	}else{
		$("#descriptionHelp").html("");
		$("#descriptionDiv").removeClass("error");
	}
	return ischeck;
}

function del(forwardUrl){
	if(isCheck()){
		var confirm = $.scojs_confirm({
		content: "确定删除操作么?此操作无法回退!",
		action: function() {
				location.href="msgDel.do?ids="+getCheckValue()+"&forwardUrl="+forwardUrl;
			}
		});
		confirm.show();
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择数据"); 
	}
}
