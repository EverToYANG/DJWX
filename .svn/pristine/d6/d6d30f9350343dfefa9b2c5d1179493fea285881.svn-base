//添加
function add(){
	location.href="edit.do?pageFuncId="+$("#pageFuncId").val();
}

//编辑
function edit(){
	if(isCheckOne()){
		location.href="edit.do?id="+getCheckOneValue()+"&pageFuncId="+$("#pageFuncId").val();
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
				location.href="partym/del.do?pageFuncId="+$("#pageFuncId").val()+"&ids="+getCheckValue();
			}
		});
		confirm.show();
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择数据"); 
	}
}
//表单验证
function formCheck(){
	alert("dddd");
	isCheck=true;
	if($.trim($("#idcode").val())==""){
		$("#idcodeHelp").html("必须填写");
		$("#idcodeDiv").addClass("error");
		$("#idcode").focus();
		isCheck=false;
	}else{
		$("#idcodeHelp").html("");
		$("#idcodeDiv").removeClass("error");
	}
	if($.trim($("#name").val())==""){
		$("#nameHelp").html("必须填写");
		$("#nameDiv").addClass("error");
		$("#name").focus();
		isCheck=false;
	}else{
		$("#nameHelp").html("");
		$("#nameDiv").removeClass("error");
	}
	
	if($.trim($("#intro").val()).length>200){
		$("#introHelp").html("最多200个字符");
		$("#introDiv").addClass("error");
		$("#intro").focus();
		isCheck=false;
	}else{
		$("#introHelp").html("");
		$("#introDiv").removeClass("error");
	}
	
	alert(isCheck);
	return isCheck;
}