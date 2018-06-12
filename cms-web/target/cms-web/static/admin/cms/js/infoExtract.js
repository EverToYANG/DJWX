//选择站点
function selectSite(){
	openWindow('选择站点','siteSelect.do?siteClick=selectSite',500,500,'false');
}
//选择栏目
function selectChannel(){
	if($("#siteid").val()!=""){
		openWindow('选择栏目','channelTree.do?siteid='+$("#siteid").val()+'&channelClick=selectChannel',500,500,'false');
	}else{
		selectSite();
	}
}
//提取到栏目
function extract(){
	if(isCheck()){
		openWindow('提取到栏目','channelTree.do?channelClick=infoExtract',500,500,'false');
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择数据"); 
	}
}