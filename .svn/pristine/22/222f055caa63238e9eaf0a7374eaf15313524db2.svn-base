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
	openWindow('添加角色','roleEdit.do',500,230,'false');
}
//编辑
function edit(){
	if(isCheckOne()){
		openWindow('编辑角色','roleEdit.do?id='+getCheckOneValue(),500,230,'false');
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
}
//删除
function del(){
	if(isCheck()){
		var ids = getCheckValue();
		if(ids.indexOf("admin")>0 || ids.indexOf("siteAdmin")>0
				){
			$("#errorDiv").fadeIn("slow"); 
			$("#errorInfo").html("管理员角色不允许删除!");
			return;
		}
		var confirm = $.scojs_confirm({
		content: "确定删除操作么?此操作无法回退!",
		action: function() {
				location.href="roleDel.do?pageFuncId="+$("#pageFuncId").val()+"&ids="+getCheckValue();
			}
		});
		confirm.show();
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择数据"); 
	}
}
//授权
function auth(){
	if(isCheckOne()){
		openWindow('角色授权','roleAuth.do?id='+getCheckOneValue(),800,0,'false');
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
}
//站点授权
function siteAuth(){
	if(isCheckOne()){
		openWindow('站点栏目授权','roleSiteAuth.do?id='+getCheckOneValue(),0,0,'false');
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
}