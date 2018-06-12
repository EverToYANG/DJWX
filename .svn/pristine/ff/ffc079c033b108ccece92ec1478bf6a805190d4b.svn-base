function save(){
	var isCheck=true;
	if($.trim($("#name").val())==""){
		$("#nameHelp").html("必须填写");
		$("#nameDiv").addClass("error");
		$("#name").focus();
		isCheck=false;
		return null;
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
		return null;
	}else{
		$("#sourcepathHelp").html("");
		$("#sourcepathDiv").removeClass("error");
	}**/
	if(isCheck){
	$("#form").submit();
	}
}
function delLogo(){
	$("#oldLogoSpan").fadeOut("slow"); 
	$("#oldLogo").val("");
}
//选择模板
function selectTemplet(id){
	openWindow('选择模板','templetSelect.do?siteid='+id,350,370,'false');
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
//预览站点
function preview(){
	//window.open("../../sitePreview.htm?id="+$("#siteId").val());
	window.open("../sitePreview.htm?id="+$("#siteId").val());
}
//同步资源
function syncRes(){
	if($("#templet").val()==""){
		selectTemplet($("#siteId").val());
		return false;
	}
	$("#templetHelp").html("");
	var confirm = $.scojs_confirm({
	content: "此操作将把模板资源文件复制并覆盖到此站点,确认此操作么?",
	action: function() {
		$.post("siteSyncRes.do","siteId="+$("#siteId").val()+"&templetId="+$("#templet").val(),syncResComplete,"text");
		}
	});
	confirm.show();
}
function syncResComplete(data){
	$("#templetHelp").html(data);
}