//表单验证
function formCheck(){
	var isCheck=true;
	if($.trim($("#code").val())==""){
		$("#codeHelp").html("必须填写");
		$("#codeDiv").addClass("error");
		$("#code").focus();
		isCheck=false;
	}else{
		$("#codeHelp").html("");
		$("#codeDiv").removeClass("error");
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
	return isCheck;
}


//添加
function add(){
	openWindow('添加积分规则','creditruleEdit.do',500,530,'false');
}
//编辑
function edit(){
	if(isCheckOne()){
		openWindow('编辑积分规则','creditruleEdit.do?id='+getCheckOneValue(),500,530,'false');
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
				location.href="creditruleDel.do?pageFuncId="+$("#pageFuncId").val()+"&ids="+getCheckValue();
			}
		});
		confirm.show();
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择数据"); 
	}
}

function cycletypeChange(type){
	if(2==type.value){
		$("#cycletimeDiv").fadeIn("slow"); 
	}else{
		$("#cycletimeDiv").fadeOut("slow"); 
	}
}