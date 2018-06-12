//表单验证
function formCheck(){
	var isCheck=true;
	if($.trim($("#name").val())==""){
		$("#nameHelp").html("必须填写");
		$("#nameDiv").addClass("error");
		$("#name").focus();
		isCheck=false;
	}else{
		$("#nameHelp").html("");
		$("#nameDiv").removeClass("error");
	}
	/**
	if($.trim($("#sourcepath").val())==""){
		$("#sourcepathHelp").html("必须填写");
		$("#sourcepathDiv").addClass("error");
		$("#sourcepath").focus();
		isCheck=false;
	}else{
		$("#sourcepathHelp").html("");
		$("#sourcepathDiv").removeClass("error");
	}
	**/
	return isCheck;
}
function delLogo(){
	$("#oldLogoSpan").fadeOut("slow"); 
	$("#oldLogo").val("");
}
//编辑
function edit(){
	if(isCheckOne()){
		openWindow('编辑站点','siteEdit.do?id='+getCheckOneValue(),600,0,'false');
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
}
//预览
function preview(){
	if(isCheckOne()){
		window.open("../sitePreview.htm?id="+getCheckOneValue());
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
}

//选择模板
function selectTemplet(id){
	openWindow('选择模板','templetSelect.do?siteid='+id,600,0,'false');
}

function htmlquartzTypeChange(obj){
	if(""==obj.value){
		$("#exetimeTd").fadeOut("slow"); 
		$("#intervalTd").fadeOut("slow"); 
	}else if("0"==obj.value){
		$("#exetimeTd").fadeIn("slow"); 
		$("#intervalTd").fadeOut("slow"); 
	}else if("1"==obj.value){
		$("#exetimeTd").fadeOut("slow"); 
		$("#intervalTd").fadeIn("slow"); 
	}
}
function intervalTypeChange(obj){
	if(""==obj.value){
		$("#intervalhourTd").fadeOut("slow"); 
		$("#intervalminTd").fadeOut("slow"); 
	}else if("0"==obj.value){
		$("#intervalhourTd").fadeIn("slow"); 
		$("#intervalminTd").fadeOut("slow"); 
	}else if("1"==obj.value){
		$("#intervalhourTd").fadeOut("slow"); 
		$("#intervalminTd").fadeIn("slow"); 
	}
}
function addOne(){
	openWindow('添加根站点','siteEdit.do',600,0,'false');
}
//添加下级
function addSon(){
	if(isCheckOne()){
		openWindow('添加下级站点','siteEdit.do?pid='+getCheckOneValue(),600,0,'false');
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
}
//转移
function parButton(){
	if(isCheckOne()){
		openWindow('转移','siteTree.do?pageFuncId='+$("#pageFuncId").val()+'&siteClick=pardo&id='+getCheckOneValue(),500,500,'true');
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
		content: "确定删除操作么?此操作将同时删除子站点并且无法回退!",
		action: function() {
				location.href="siteDel.do?pageFuncId="+$("#pageFuncId").val()+"&ids="+getCheckValue();
			}
		});
		confirm.show();
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择数据"); 
	}
}
//同步资源
function syncRes(){
	if($("#indextemplet").val()==""){
		selectTemplet($("#siteId").val());
		return false;
	}
	$("#indextempletHelp").html("");
	var confirm = $.scojs_confirm({
	content: "此操作将把模板资源文件复制并覆盖到此站点,确认此操作么?",
	action: function() {
		$.post("siteSyncRes.do","id="+$("#siteId").val()+"&templet="+$("#templet").val(),syncResComplete,"text");
		}
	});
	confirm.show();
}
function syncResComplete(data){
	$("#indextempletHelp").html(data);
}