//添加根栏目
function addRoot(){
	location.href="channelEdit.do?pageFuncId="+$("#pageFuncId").val();
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
	return isCheck;
}
//编辑
function edit(){
	if(isCheckOne()){
		location.href='channelEdit.do?id='+getCheckOneValue()+"&pageFuncId="+$("#pageFuncId").val();
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
}

function delImg(){
	$("#oldImgSpan").fadeOut("slow"); 
	$("#oldImg").val("");
}
//添加下级
function addSon(){
	if(isCheckOne()){
		location.href='channelEdit.do?pid='+getCheckOneValue()+"&pageFuncId="+$("#pageFuncId").val();
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
}
//转移
function par(){
	if(isCheckOne()){
		openWindow('转移','channelTree.do?pageFuncId='+$("#pageFuncId").val()+'&isroot=1&channelClick=pardo&id='+getCheckOneValue(),500,500,'true');
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
		content: "确定删除操作么?此操作将同时删除子栏目并且无法回退!",
		action: function() {
				location.href="channelDel.do?pageFuncId="+$("#pageFuncId").val()+"&ids="+getCheckValue();
			}
		});
		confirm.show();
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择数据"); 
	}
}


function selectTempletFile(templetid,inputid){
	if(templetid==""){
		$("#"+inputid+"Help").html("请先选择此站点使用的模板");
		$("#"+inputid+"Div").addClass("error");
	}else{
		$("#"+inputid+"Help").html("");
		$("#"+inputid+"Div").removeClass("error");
		openWindow('选择模板文件','templetSiteSelectFile.do?inputid='+inputid+'&id='+templetid,0,0,'true');
	}
}