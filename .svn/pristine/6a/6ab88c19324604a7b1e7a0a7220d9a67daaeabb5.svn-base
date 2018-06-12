//添加
function add(){
	location.href="add.do?pageFuncId="+$("#pageFuncId").val();
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


function isok(s){
	var names="";
	var objs=document.getElementsByName("ids");
	if(objs!=null && objs.length>0){
		for(var i=0;i<objs.length;i++){
			if(objs[i].checked){
				names+=$("#"+objs[i].id).attr("show")+";";
			}
		}
	}
	if(isCheck()){
		location.href="memberIsok.do?ids="+getCheckValue()+"&isok="+s+"&names="+names+"&pageFuncId="+$("#pageFuncId").val();
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择数据"); 
	}
}

function del(){
	if(isCheck()){
		var confirm = $.scojs_confirm({
		content: "确定删除操作么?此操作无法回退!",
		action: function() {
				location.href="del.do?pageFuncId="+$("#pageFuncId").val()+"&ids="+getCheckValue();
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
	isCheck=true;
	/*if($.trim($("#loginname").val())==""){
		$("#loginnameHelp").html("必须填写");
		$("#loginnameDiv").addClass("error");
		$("#loginname").focus();
		isCheck=false;
	}else{
		$("#loginnameHelp").html("");
		$("#loginnameDiv").removeClass("error");
	}*/
	if($.trim($("#name").val())==""){
		$("#nameHelp").html("必须填写");
		$("#nameDiv").addClass("error");
		$("#name").focus();
		isCheck=false;
	}else{
		$("#nameHelp").html("");
		$("#nameDiv").removeClass("error");
	}
	
	/*if($("#id").val()=="" || ($("#id").val()!="" && $("#editpwd").attr("checked")))
	{
		if($.trim($("#pwd").val())==""){
			$("#pwdHelp").html("必须填写");
			$("#pwdDiv").addClass("error");
			$("#pwd").focus();
			isCheck=false;
		}else{
			$("#pwdHelp").html("");
			$("#pwdDiv").removeClass("error");
		}
		if($.trim($("#repwd").val())==""){
			$("#repwdHelp").html("必须填写");
			$("#repwdDiv").addClass("error");
			$("#repwd").focus();
			isCheck=false;
		}else{
			$("#repwdHelp").html("");
			$("#repwdDiv").removeClass("error");
		}
		if($("#repwd").val()!=$("#pwd").val()){
			$("#repwdHelp").html("与登录密码不一致，请重新输入");
			$("#repwdDiv").addClass("error");
			$("#repwd").focus();
			isCheck=false;
		}else{
			$("#repwdHelp").html("");
			$("#repwdDiv").removeClass("error");
		}
	}
	if($.trim($("#email").val())!="" 
		&& !isEmail($("#email").val())){
		$("#emailHelp").html("请输入正确的电子邮箱");
		$("#emailDiv").addClass("error");
		$("#email").focus();
		isCheck=false;
	}else{
		$("#emailHelp").html("");
		$("#emailDiv").removeClass("error");
	}
	if($.trim($("#intro").val()).length>200){
		$("#introHelp").html("最多200个字符");
		$("#introDiv").addClass("error");
		$("#intro").focus();
		isCheck=false;
	}else{
		$("#introHelp").html("");
		$("#introDiv").removeClass("error");
	}*/
	return isCheck;
}

//选取党员
function partyChoice(){
	$('button[name="partyNames"]').remove();
	
var partyids = new Array();
var partyNames=new Array();
$('input[name="partyName"]:checked').each(function() {
	partyids.push($(this).val());//向数组中添加元素  
	partyNames.push($(this).attr("data-member"));
	$("#openids").after("<button type='button' class='btn btn-info' name='partyNames' >"+$(this).attr("data-member")+"</button>");
});
var openids_=partyids.join(';');//将数组元素连接起来以构建一个字符串  
$("#openids").val(openids_);
$('#partyMember').modal('hide')
}