
function add(topicid){
	if($.trim($("#name").val())==""){
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请输入名称!"); 
		$("#name").focus();
		return false;
	}else{
		$("#nameHelp").html("");
		$("#nameDiv").removeClass("error");
	}
	$("#errorDiv").fadeOut("slow"); 
	$("#state").fadeIn("slow"); 
	var isok="1";
	if($("#isok0").attr("checked")=="checked"){isok="0";}
	var isselect="1";
	if($("#isselect0").attr("checked")=="checked"){isselect="0";}
	var data="topicid="+topicid+"&name="+$.trim(replaceAll($("#name").val(),"&","<参数>"))
	+"&ordernum="+$.trim($("#order").val())+"&isok="+isok+"&isselect="+isselect;
	$.post("itemAdd.do",data,saveComplete,"text");
}
function saveComplete(data){
	var msg=data.substr(1,data.length-1);
	if(startsWith(data,"1")){
		//成功则添加一行
		var attr=msg.split("<属性>");
		if(attr!=null && attr.length>1){
			var str='<tr id="tr'+attr[1]+'">'
			      +'<td >'
			    +'<input type="text" style="width:90%" value="'+$("#name").val()+'" size="8" id="name${bean.id}" name="name'+attr[1]+'" MAXLENGTH="50" >'
			    +'  </td><td >'
			    +' <label style="float:left"><input uniform="true" type="radio"  id="isok'+attr[1]+'1" name="isok'+attr[1]+'" value="1" checked="checked"/>是</label>'
			    +' <label style="float:left"><input uniform="true" type="radio" id="isok'+attr[1]+'0" name="isok'+attr[1]+'"  value="0" '+($("#isok0").attr("checked")=="checked"?"checked":"")+'/>否</label>'
		      +'</td>'
			  +'    <td >'
			  +'   <label style="float:left"><input uniform="true" type="radio"  id="isselect'+attr[1]+'1" name="isselect'+attr[1]+'" value="1" checked="checked"/>是</label>'
			  +'   <label style="float:left"><input uniform="true" type="radio" id="isselect'+attr[1]+'0" name="isselect'+attr[1]+'"  value="0" '+($("#isselect0").attr("checked")=="checked"?"checked":"")+'/>否</label>'
			 +'     </td>'
			 +'     <td >'
			  +'  <input type="text" style="width:80%" onkeyup=if(!isInt(value))execCommand(\'undo\') onafterpaste=if(!isInt(value))execCommand(\'undo\')  value="'+$("#order").val()+'" id="order'+attr[1]+'" name="order'+attr[1]+'" MAXLENGTH="4" size="1" >'
			 +'     </td>'
			 +'     <td >'
			 +'     </td>'
			 +'     <td >'
			  +'  <input type="button" value="修改" onclick="update(\''+attr[1]+'\')" class="btn">'
			  +'  <input type="button" value="删除" onclick="del(\''+attr[1]+'\')" class="btn">'
			  +'    </td>'
			 +'   </tr>';
		  $("#rows").append(str);
		}
		msg=attr[0];
		//清空添加那一行
		$("#name").val("");
		$("#order").val("");
	}
	$("#state").fadeOut("slow"); 
	$("#errorDiv").fadeIn("slow"); 
	$("#errorInfo").html(msg); 
	$('input[uniform=true]').uniform()
}

function update(id){
	if($.trim($("#name"+id).val())==""){
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请输入名称!"); 
		$("#name"+id).focus();
		return false;
	}else{
		$("#nameHelp").html("");
		$("#nameDiv").removeClass("error");
	}
	$("#state").fadeIn("slow"); 
	
	var isok="1";
	if($("#isok"+id+"0").attr("checked")=="checked"){isok="0";}
	var isselect="1";
	if($("#isselect"+id+"0").attr("checked")=="checked"){isselect="0";}
	var data="id="+id+"&name="+$.trim(replaceAll($("#name"+id+"").val(),"&","<参数>"))
	+"&ordernum="+$.trim($("#order"+id+"").val())+"&isok="+isok+"&isselect="+isselect;
	$.post("itemEdit.do",data,updateComplete,"text");
}

function updateComplete(data){
	var msg=data.substr(1,data.length-1);
	$("#state").fadeOut("slow"); 
	$("#errorDiv").fadeIn("slow"); 
	$("#errorInfo").html(msg); 
}


function del(id){
	var confirm = $.scojs_confirm({
	content: "确定删除操作么?此操作无法回退!",
	action: function() {
		$("#state").fadeIn("slow"); 
		var data="id="+id;
		$.post("itemDel.do",data,delComplete,"text");
		this.destroy();
		}
	});
	confirm.show();
	$("#errorDiv").fadeOut("slow"); 
}

function delComplete(data){
	var msg=data.substr(1,data.length-1);
	if(startsWith(data,"1")){
		//成功则删除一行
		var attr=msg.split("<属性>");
		if(attr!=null && attr.length>1){
		  $("#tr"+attr[1]).remove();
		}
		msg=attr[0];
	}
	$("#state").fadeOut("slow"); 
	$("#errorDiv").fadeIn("slow"); 
	$("#errorInfo").html(msg); 
}