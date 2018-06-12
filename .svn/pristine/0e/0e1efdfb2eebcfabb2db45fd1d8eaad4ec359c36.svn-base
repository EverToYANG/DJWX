function getType(){
	var type=document.getElementById("type").value;
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
function delImg(){
	$("#oldImgSpan").fadeOut("slow"); 
	$("#oldImg").val("");
}//表单验证
function formCheck(){
	var ischeck=true;
	if($.trim($("#name").val())==""){
		$("#nameHelp").html("必须填写");
		$("#nameDiv").addClass("error");
		$("#name").focus();
		ischeck = false;
	}else{
		$("#nameHelp").html("");
		$("#nameDiv").removeClass("error");
	}
	if($.trim($("#linkSelect").val())==""){
		$("#classHelp").html("必须选择");
		$("#classDiv").addClass("error");
		$("#linkSelect").focus();
		ischeck = false;
	}else{
		$("#classHelp").html("");
		$("#classDiv").removeClass("error");
	}
	if($("#type").val()=="2" && $("#img").val()==""  && $("#oldImg").val()==""){
		$("#imgHelp").html("必须选择");
		$("#imgDiv").addClass("error");
		$("#img").focus();
		ischeck = false;
	}else{
		$("#imgHelp").html("");
		$("#imgDiv").removeClass("error");
	}
	if($.trim($("#url").val())==""){
		$("#urlHelp").html("必须填写");
		$("#urlDiv").addClass("error");
		$("#url").focus();
		ischeck = false;
	}else{
		$("#urlHelp").html("");
		$("#urlDiv").removeClass("error");
	}
	return ischeck;
}
//添加
function add(){
	openWindow('添加'+getType()+'链接','linkEdit.do?type='+$("#type").val(),500,500,'false');
}
//编辑
function edit(){
	if(isCheckOne()){
		openWindow('编辑'+getType()+'链接','linkEdit.do?id='+getCheckOneValue()+'&type='+$("#type").val(),500,500,'false');
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
				location.href="linkDel.do?pageFuncId="+$("#pageFuncId").val()+"&ids="+getCheckValue();
			}
		});
		confirm.show();
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择数据"); 
	}
}