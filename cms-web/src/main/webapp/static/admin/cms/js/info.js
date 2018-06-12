function add(){
	location.href="infoEdit.do?pageFuncId="+$("#pageFuncId").val()+"&isShowHead=0&channelid="+$("#channel").val();
}


function edit(){
	if(isCheckOne()){
		location.href="infoEdit.do?pageFuncId="+$("#pageFuncId").val()+"&isShowHead=0&id="+getCheckOneValue();
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
}


//删除图片
function delOldImg(){
	$("#oldImgSpan").empty();
	$("#imgDelBtn").fadeOut("slow"); 
	$("#img").val("");
}
function issignClick(issign){
	if(1==issign){
		$("#signDiv").fadeIn("slow"); 
	}else{
		$("#signDiv").fadeOut("slow"); 
	}
}
function checkallsign(checked){
	var objs=document.getElementsByName("signusers");
	if(objs!=null && objs.length>0){
		for(var i=0;i<objs.length;i++){
			objs[i].checked=checked;
			if (checked) {
				$("#"+objs[i].id).closest('.checker > span').addClass('checked');
			}else{
				$("#"+objs[i].id).closest('.checker > span').removeClass('checked');
			}
		}
	}
}


//提交验证
function formCheck(){
	var isCheck=true;
	if($.trim($("#channelId").val())==""){
		$("#channelHelp").html("必须选择");
		$("#channelDiv").addClass("error");
		$("#channelId").focus();
		isCheck=false;
	}else{
		$("#channelHelp").html("");
		$("#channelDiv").removeClass("error");
	}
	if($.trim($("#title").val())==""){
		$("#titleHelp").html("必须填写");
		$("#titleDiv").addClass("error");
		$("#title").focus();
		isCheck=false;
	}else{
		$("#titleHelp").html("");
		$("#titleDiv").removeClass("error");
	}
	return isCheck;
}

//提交验证
function formCheck(){
	var isCheck=true;
	if($.trim($("#channelId").val())==""){
		$("#channelHelp").html("必须选择");
		$("#channelDiv").addClass("error");
		$("#channelId").focus();
		isCheck=false;
	}else{
		$("#channelHelp").html("");
		$("#channelDiv").removeClass("error");
	}
	return isCheck;
}

//选择栏目
function selectChannel(){
		openWindow('选择栏目','channelTree.do?channelClick=selectChannel',500,500,'false');
}
//增加附件
function addAttch(){
	var id = Math.uuidFast(); 
	var str="";  
	str+="<tr id='attchtr"+id+"'>";  
	str+="<td>";  
	str+="<input id='attchs"+id+"' uniform='true' type='checkbox' name='attchs' value='"+id+"'/>";  
	str+="</td>";  
	str+="<td>";  
	str+="<INPUT id='attch"+id+"' uniform='true' type=file name=attch >";  
	str+="</td>";    
	str+="</tr>";  
	$("#attchTbody").append(str); 
	$('input[uniform=true]').uniform()
}
//删除附件
function delAttch(){
	var objs=document.getElementsByName("attchs");
	var ids=new Array();
	if(objs!=null && objs.length>0){
		for(var i=0;i<objs.length;i++){
			if(objs[i].checked){
				ids[ids.length]=objs[i].value;
			}
		}
	}
	if(ids.length>0){
		for(var i=0;i<ids.length;i++){
			$("#attchtr"+ids[i]).remove();
		}
	}
}
//增加图片
function addImg(){
	var id = Math.uuidFast(); 
	var str="";  
	str+="<tr id='imgtr"+id+"'>";  
	str+="<td>";  
	str+="<input id='imgs"+id+"' uniform='true' type='checkbox' name='imgs' value='"+id+"'/>";  
	str+="</td>";  
	str+="<td>";  
	str+="<INPUT id='img"+id+"' uniform='true' type=file name=imgsfile"+id+" >";  
	str+="</td>";    
	str+="<td>";    
	str+="<INPUT   type=text name=imgstitle"+id+" >";    
	str+="</td>";    
	str+="<td>";    
	str+="<textarea name=imgscontent"+id+" ></textarea>";    
	str+="</td>";    
	str+="<td>";  
	str+="<input type='text' name='imgsordernum"+id+"' style='width:60px' oninput=if(!isInt(value))value=''   onpropertychange=if(!isInt(value))execCommand('undo') onkeyup=if(!isInt(value))execCommand('undo') onafterpaste=if(!isInt(value))execCommand('undo') />";  
	str+="</td>";    
	str+="</tr>";  
	$("#imgTbody").append(str); 
	$('input[uniform=true]').uniform()
}
//删除图片
function delImg(){
	var objs=document.getElementsByName("imgs");
	var ids=new Array();
	if(objs!=null && objs.length>0){
		for(var i=0;i<objs.length;i++){
			if(objs[i].checked){
				ids[ids.length]=objs[i].value;
			}
		}
	}
	if(ids.length>0){
		for(var i=0;i<ids.length;i++){
			$("#imgtr"+ids[i]).remove();
			$("#delOldimgs").val($("#delOldimgs").val()+ids[i]+";");
		}
	}
}

//信息管理页面选择栏目
function infoSelectChannel(id,name){
	$("#infoFrame").attr("src","infoList.do?pageFuncId="+$("#pageFuncId").val()+"&channel="+id);
	$("#infoFrame").load(function(){
		$(this).height($(this).contents().find("body").height()+60); 
	}); 
}
function infosign(infoid){
	openWindow('信息签收','../../infoSign.do?cansign=false&id='+infoid+'&date='+new Date(),0,0,'false');
}
function copy(){
	if(isCheck()){
		openWindow('复制到栏目','channelTree.do?channelClick=infoCopy',500,500,'false');
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择数据"); 
	}
}
function move(){
	if(isCheck()){
		openWindow('移动到栏目','channelTree.do?channelClick=infoMove',500,500,'false');
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
				location.href="infoDel.do?pageFuncId="+$("#pageFuncId").val()+"&ids="+getCheckValue()+"&channel="+$("#channel").val();
			}
		});
		confirm.show();
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择数据"); 
	}
}
function html(){
	if(isCheck()){
		location.href="infoHtml.do?pageFuncId="+$("#pageFuncId").val()+"&ids="+getCheckValue()+"&channel="+$("#channel").val();
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


//编辑
function audit(){
	if(isCheckOne()){
		openWindow('审核信息','infoAudit.do?id='+getCheckOneValue(),500,500,'false');
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
}