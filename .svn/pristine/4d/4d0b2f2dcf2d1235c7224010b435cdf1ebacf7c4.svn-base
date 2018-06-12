//添加
function add(){
	openWindow('添加站点文件','templetSiteFileEdit.do?currFolder='+encodeURI($("#root").val()),0,0,'false');
}
//编辑
function edit(){
	if(isCheckOne()){
		openWindow('编辑文件','templetSiteFileEdit.do?filePaths='+getCheckOneValue()+'&currFolder='+encodeURI($("#root").val()),0,0,'false');
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
}
//编辑文件表单验证
function fileEditForm(){
	var isCheck=true;
	if($.trim($("#fileName").val())==""){
		$("#fileNameHelp").html("必须填写");
		$("#fileNameDiv").addClass("error");
		$("#fileName").focus();
		isCheck=false;
	}else{
		$("#fileNameHelp").html("");
		$("#fileNameDiv").removeClass("error");
	}
	return isCheck;
}
//删除
function del(){
	if(isCheck()){
		var confirm = $.scojs_confirm({
		content: "确定删除操作么?此操作无法回退!",
		action: function() {
				location.href="templetSiteFileDel.do?pageFuncId="+$("#pageFuncId").val()+"&filePaths="+getCheckValue()+"&currFolder="+$("#root").val();
			}
		});
		confirm.show();
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择数据"); 
	}
}
function delComplete(data){
	if(data!=""){
		var datas=data.split(";");
		if(datas!=null && datas.length>0){
			for(var i=0;i<datas.length;i++){
				if(datas[i]!="" && document.getElementById("tr"+datas[i])!=null){
					document.getElementById("tr"+datas[i]).parentNode.removeChild(document.getElementById("tr"+datas[i]));
				}
			}
		}
	}
}
//创建文件夹
function createFolder(){
	openWindow('创建文件夹','templetSiteFolderEdit.do?currFolder='+encodeURI($("#root").val()),500,250,'false');
}
//文件夹编辑表单验证
function folderEditForm(){
	var isCheck=true;
	if($.trim($("#fileName").val())==""){
		$("#fileNameHelp").html("必须填写");
		$("#fileNameDiv").addClass("error");
		$("#fileName").focus();
		isCheck=false;
	}else{
		$("#fileNameHelp").html("");
		$("#fileNameDiv").removeClass("error");
	}
	return isCheck;
}
//重命名文件夹
function renameFolder(){
	openWindow('重命名文件夹','templetSiteFolderEdit.do?filePaths='+encodeURI($("#root").val()),500,250,'false');
}
//刷新文件夹
function flushFolder(){
	location.href=location.href;
}
//删除文件夹
function delFolder(){
	var confirm = $.scojs_confirm({
	content: "确定删除操作么?此操作无法回退!",
	action: function() {
			location.href="templetSiteFolderDel.do?pageFuncId="+$("#pageFuncId").val()+"&filePaths="+$("#root").val();
		}
	});
	confirm.show();
}
function delFolderComplete(data){
	if(data=="succ"){
		alert("操作成功");
		parent.location.reload();
	}else{
		alert(data);
	}
}
//上传文件
function uploadFile(){
	openWindow('上传文件','templetSiteUploadFile.do?root='+$("#root").val(),500,250,'false');
}
//上传文件表单验证
function uploadFileForm(){
	var isCheck=true;
	if($.trim($("#uploadFile").val())==""){
		$("#uploadFileHelp").html("必须选择");
		$("#uploadFileDiv").addClass("error");
		$("#uploadFile").focus();
		isCheck=false;
	}else{
		$("#uploadFileHelp").html("");
		$("#uploadFileDiv").removeClass("error");
	}
	return isCheck;
}