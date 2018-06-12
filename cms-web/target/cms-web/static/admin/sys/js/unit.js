//表单验证
function formCheck(){
	if($.trim($("#name").val())==""){
		$("#nameHelp").html("必须填写");
		$("#nameDiv").addClass("error");
		$("#name").focus();
		return false;
	}else{
		$("#nameHelp").html("");
		$("#nameDiv").removeClass("error");
	}
	return true;
}


//添加根单位
function addOne(){
	openWindow('添加根单位','unitEdit.do',500,310,'false');
}


//添加下级
function addSon(){
	if(isCheckOne()){
		openWindow('添加下级单位','unitEdit.do?pid='+getCheckOneValue(),500,310,'false');
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
}
//编辑
function edit(){
	if(isCheckOne()){
		openWindow('编辑单位','unitEdit.do?id='+getCheckOneValue(),500,310,'false');
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
}
//转移
function parButton(){
	if(isCheckOne()){
		openWindow('转移','unitTree.do?pageFuncId='+$("#pageFuncId").val()+'&unitClick=pardo&id='+getCheckOneValue(),500,500,'true');
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
				location.href="unitDel.do?pageFuncId="+$("#pageFuncId").val()+"&ids="+getCheckValue();
			}
		});
		confirm.show();
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择数据"); 
	}
}