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
	if(document.getElementById("type0").checked && $.trim($("#beginexperience").val())==""){
		$("#beginexperienceHelp").html("必须填写");
		$("#beginexperienceDiv").addClass("error");
		$("#beginexperience").focus();
		isCheck=false;
	}else{
		$("#beginexperienceHelp").html("");
		$("#beginexperienceDiv").removeClass("error");
	}
	return isCheck;
}
//添加
function add(){
	openWindow('添加会员组','membergroupEdit.do',500,0,'false');
}

//编辑
function edit(){
	if(isCheckOne()){
		openWindow('编辑会员组','membergroupEdit.do?id='+getCheckOneValue(),500,0,'false');
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
}

//授权
function auth(){
	if(isCheckOne()){
		var groupid=getCheckOneValue();
		openWindow('会员组授权','membergroupAuth.do?id='+groupid,400,0,'false');
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
}

//授权处理
function formCheck1(){
		var auths=document.getElementsByName("ids");
		var names="";
		if(auths!=null && auths.length>0){
			for(var i=0;i<auths.length;i++){
				if(auths[i].checked){
			names+=auths[i].auth+";";
			}
		}
				}
	$("#names").val(names);
return true;
}

//删除
function del(){
	if(isCheck()){
		var confirm = $.scojs_confirm({
		content: "确定删除操作么?此操作无法回退!",
		action: function() {
				location.href="membergroupDel.do?pageFuncId="+$("#pageFuncId").val()+"&ids="+getCheckValue();
			}
		});
		confirm.show();
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择数据"); 
	}
}

//删除图片
function delImg(){
	$("#oldImgSpan").fadeOut("slow"); 
	$("#oldImg").val("");
}
function typeChange(type){
	if(1==type){
		$("#beginexperienceDiv").fadeOut("slow"); 
	}else{
		$("#beginexperienceDiv").fadeIn("slow"); 
	}
}
