//表单验证
function formCheck(){
	var ischeck=true;
	if($.trim($("#loginname").val())==""){
		$("#loginnameHelp").html("必须填写");
		$("#loginnameDiv").addClass("error");
		$("#loginname").focus();
		ischeck=false;
	}else{
		$("#loginnameHelp").html("");
		$("#loginnameDiv").removeClass("error");
	}
	if($("#id").val()==""){
		if($("#pwd").val()==""){
			$("#pwdHelp").html("必须填写");
			$("#pwdDiv").addClass("error");
			$("#pwd").focus();
			ischeck=false;
		}else{
			$("#pwdHelp").html("");
			$("#pwdDiv").removeClass("error");
		}
		if($("#repwd").val()==""){
			$("#repwdHelp").html("必须填写");
			$("#repwdDiv").addClass("error");
			$("#repwd").focus();
			ischeck=false;
		}else{
			if($("#repwd").val()!=$("#pwd").val()){
				$("#repwdHelp").html("必须与登录密码相同");
				$("#repwdDiv").addClass("error");
				$("#repwd").focus();
				ischeck=false;
			}else{
				$("#repwdHelp").html("");
				$("#repwdDiv").removeClass("error");
			}
		}
	}
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
	return ischeck;
}
//添加
function add(){
	location.href="userEdit.do?pageFuncId="+$("#pageFuncId").val();
}

//编辑
function edit(){
	if(isCheckOne()){
		location.href="userEdit.do?id="+getCheckOneValue()+"&pageFuncId="+$("#pageFuncId").val();
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
}
//授权
function auth(){
	if(isCheckOne()){
		openWindow('用户授权',"userAuth.do?id="+getCheckOneValue()+"&pageFuncId="+$("#pageFuncId").val(),400,0,'false');
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
}
function unitSelect(){
	openWindow('选择所属部门','unitSelect.do?selectUnitIds='+$("#unitids").val(),300,0,false);
}
function clearUnit(){
	$("#unitnames").val("");
	$("#unitids").val("");
}
function roleSelect(){
	openWindow('选择角色','roleSelect.do?selectRoleIds='+$("#roleids").val(),300,0,false);
}
function clearRole(){
	$("#rolenames").val("");
	$("#roleids").val("");
}
//更新角色名
function updateRolenames(id,rolenames){
	$("#rolenames"+id).html(rolenames);
}
//启用/禁用
var stateval="1";
function state(s){
	stateval=s;
	var names="";
	var checkValue="";
	var objs=document.getElementsByName("ids");
	if(objs!=null && objs.length>0){
		for(var i=0;i<objs.length;i++){
			if(objs[i].checked){
				checkValue+=objs[i].value+";";
				names+=$("#"+objs[i].id).attr("show")+";";
			}
		}
	}
	if(checkValue!=""){
		$.post("userState.do","ids="+checkValue+"&state="+stateval+"&names="+names,stateComplete,"text");
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择数据"); 
	}
}
function stateComplete(data){
	if(data=="1"){
		var ids=getCheckValueArr();
		if(ids!=null && ids.length>0){
			for(var i=0;i<ids.length;i++){
				if(ids[i]!=""){
					$("#state"+ids[i]).html(stateval=="1"?"是":"否");
				}
			}
		}
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("操作成功!"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html(data); 
	}
}
//重置密码
function resetPwd(){
	var checkValue="";
	var names="";
	var objs=document.getElementsByName("ids");
	if(objs!=null && objs.length>0){
		for(var i=0;i<objs.length;i++){
			if(objs[i].checked){
				checkValue+=objs[i].value+";";
				names+=$("#"+objs[i].id).attr("show")+";";
			}
		}
	}
	if(checkValue!=""){
		openWindow('重置密码','userResetPwd.do?ids='+checkValue+'&names='+names,500,230,'false');
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择数据"); 
	}
}
//表单验证
function resetPwdFormCheck(){
	if($.trim($("#newpwd").val())==""){
		$("#newpwdHelp").html("必须填写");
		$("#newpwdDiv").addClass("error");
		$("#newpwd").focus();
		return false;
	}
	return true;
}
function del(){
	var checkValue="";
	var names="";
	var objs=document.getElementsByName("ids");
	if(objs!=null && objs.length>0){
		for(var i=0;i<objs.length;i++){
			if(objs[i].checked){
				checkValue+=objs[i].value+";";
				names+=$("#"+objs[i].id).attr("show")+";";
			}
		}
	}
	if(checkValue!=""){
		var confirm = $.scojs_confirm({
		content: "确定删除操作么?此操作无法回退!",
		action: function() {
				location.href="userDel.do?pageFuncId="+$("#pageFuncId").val()+"&ids="+checkValue+"&names="+names;
			}
		});
		confirm.show();
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择数据"); 
	}
}