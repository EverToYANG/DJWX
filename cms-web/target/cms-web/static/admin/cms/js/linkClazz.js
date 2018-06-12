function getType(){
	var type=$("#type").val();
	if("1"==type){
		return "下拉";
	}
	else if("2"==type){
		return "图片";
	}
	else if("3"==type){
		return "文字";
	}
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
//添加
function add(){
	openWindow('添加'+getType()+'链接分类','linkClazzEdit.do?type='+$("#type").val(),500,330,'false');
}
//编辑
function edit(){
	if(isCheckOne()){
		openWindow('编辑'+getType()+'链接分类','linkClazzEdit.do?id='+getCheckOneValue(),500,330,'false');
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
				location.href="linkClazzDel.do?pageFuncId="+$("#pageFuncId").val()+"&ids="+getCheckValue();
			}
		});
		confirm.show();
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择数据"); 
	}
}