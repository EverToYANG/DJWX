function addRoot(){
	openWindow('添加根菜单','funcEdit.do',500,370,'false');
}

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
//编辑
function edit(){
	if(isCheckOne()){
		openWindow('编辑菜单','funcEdit.do?id='+getCheckOneValue(),500,370,'false');
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
}
//添加下级
function addSon(){
	if(isCheckOne()){
		openWindow('添加下级菜单','funcEdit.do?pid='+getCheckOneValue(),500,370,'false');
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
		content: "确定删除操作么?此操作将同时删除子菜单并且无法回退!",
		action: function() {
				location.href="funcDel.do?pageFuncId="+$("#pageFuncId").val()+"&ids="+getCheckValue();
			}
		});
		confirm.show();
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择数据"); 
	}
}
//转移
function par(){
	if(isCheckOne()){
		openWindow('转移','funcTree.do?pageFuncId='+$("#pageFuncId").val()+'&funcClick=pardo&id='+getCheckOneValue(),500,500,'true');
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
}
//操作按钮
function operbutton(){
	if(isCheckOne()){
		openWindow('操作按钮','operbutton.do?pageFuncId='+$("#pageFuncId").val()+'&funcid='+getCheckOneValue(),0,0,'false');
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
}
