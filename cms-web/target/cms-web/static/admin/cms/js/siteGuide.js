//选择站点
function selectSite(){
	openWindow('选择父站点','siteSelect.do?siteClick=selectSite',500,500,'false');
}
//保存站点
function saveSite(){
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
	if($.trim($("#sourcepath").val())==""){
		$("#sourcepathHelp").html("必须填写");
		$("#sourcepathDiv").addClass("error");
		$("#sourcepath").focus();
		isCheck=false;
	}else{
		$("#sourcepathHelp").html("");
		$("#sourcepathDiv").removeClass("error");
	}
	if(isCheck){
		$("#form").submit();
	}
}

function radioClick(v){
	if("1"==v){
		$("#selectDiv").fadeOut("slow");
		$("#newDiv").fadeIn("slow");
	}else{
		$("#selectDiv").fadeIn("slow");
		$("#newDiv").fadeOut("slow");
	}
}

//选择模板
function selectTemplet(id){
	openWindow('选择模板','templetSelect.do?siteid='+id,280,370,'false');
}


//保存模板
function saveTemplet(){
	var isCheck=true;
	if(document.getElementById("type0").checked){
			//选择模板
		if($.trim($("#indextemplet").val())==""){
			$("#selectHelp").html("必须选择");
			$("#selectDiv").addClass("error");
			isCheck=false;
		}
	}else{
		//创建新模板
		if($.trim($("#name").val())==""){
			$("#newHelp").html("必须填写");
			$("#newDiv").addClass("error");
			$("#name").focus();
			isCheck=false;
		}
	}
	if(isCheck){
		$("#form").submit();
	}
}
//预览站点
function preview(siteid){
	window.open("../../sitePreview.htm?id="+siteid);
}