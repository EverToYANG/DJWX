
function addOperbutton(funcid){
	if($.trim($("#name").val())==""){
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请输入按钮名称!"); 
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
	var data="func="+funcid+"&name="+$.trim(replaceAll($("#name").val(),"&","<参数>"))
	+"&code="+$.trim(replaceAll($("#code").val(),"&","<参数>"))
	+"&ordernum="+$.trim($("#order").val())+"&isok="+isok+"&css="+$("#css  option:selected").val();
	$.post("operbuttonAdd.do",data,saveOperbuttonComplete,"text");
}
function saveOperbuttonComplete(data){
	var msg=data.substr(1,data.length-1);
	if(startsWith(data,"1")){
		//成功则添加一行
		var attr=msg.split("<属性>");
		if(attr!=null && attr.length>1){
			var str="<tr id=\"tr"+attr[1]+"\">"
		      +"<td >"
		     +"<input type=\"text\" value=\""+$("#name").val()+"\" style=\"width:90%\" id=\"name"+attr[1]+"\" name=\"name"+attr[1]+"\" MAXLENGTH=\"50\" >"
		      +"</td>"
		      +"<td >"
		     +"<select id=\"css"+attr[1]+"\" name=\"css"+attr[1]+"\">"
			+"									<option value=\"\">默认:带渐变的标准灰色按钮</option>"
			+"									<option value=\"btn-primary\" "+("btn-primary"==$("#css  option:selected").val()?"selected":"")+">主要:提供额外的视觉感, 可在一系列的按钮中指出主要操作</option>"
			+"									<option value=\"btn-info\" "+("btn-info"==$("#css  option:selected").val()?"selected":"")+">信息:默认样式的替代样式</option>"
			+"									<option value=\"btn-success\" "+("btn-success"==$("#css  option:selected").val()?"selected":"")+">成功:表示成功或积极的动作</option>"
			+"									<option value=\"btn-warning\" "+("btn-warning"==$("#css  option:selected").val()?"selected":"")+">警告:提醒应该谨慎采取这个动作</option>"
			+"									<option value=\"btn-danger\"> "+("btn-danger"==$("#css  option:selected").val()?"selected":"")+"危险:表示这个动作危险或存在危险</option>"
			+"									<option value=\"btn-inverse\" "+("btn-inverse"==$("#css  option:selected").val()?"selected":"")+">反向:备用的暗灰色按钮</option>"
			+"									<option value=\"btn-link\" "+("btn-link"==$("#css  option:selected").val()?"selected":"")+">链接:简化一个按钮, 使它看起来像一个链接，同时保持按钮的行为</option>"
			+"								</select>"
		      +"</td>"
		      +"<td >"
		     +"<label style=\"float:left\"><input uniform='true' type=\"radio\" id=\"isok"+attr[1]+"1\" name=\"isok"+attr[1]+"\" value=\"1\" checked=\"checked\"/>是</label>"
		     +"<label style=\"float:left\"><input uniform='true' type=\"radio\" id=\"isok"+attr[1]+"0\" name=\"isok"+attr[1]+"\" value=\"1\" "+($("#isok0").attr("checked")=="checked"?"checked":"")+"/>否</label>"
		    +"  </td>"
		    +"  <td >"
		   +"<input type=\"text\" style=\"width:80%\" oninput=if(!isInt(value))value=''   onpropertychange=if(!isInt(value))execCommand('undo') onkeyup=if(!isInt(value))execCommand('undo') onafterpaste=if(!isInt(value))execCommand('undo')  value=\""+$.trim($("#order").val())+"\" id=\"order"+attr[1]+"\" name=\"order"+attr[1]+"\" MAXLENGTH=\"4\" size=\"2\" >"
		    +"  </td>"
		   +"   <td >"
		   +" <input type=\"text\" style=\"width:96%\" value=\""+$("#code").val()+"\" id=\"code"+attr[1]+"\" name=\"code"+attr[1]+"\" MAXLENGTH=\"500\" >"
		   +"   </td>"
		   +"   <td >"
		   +" <input type=\"button\" value=\"修改\" onclick=\"updateOperbutton('"+attr[1]+"')\" class=\"btn\">"
		   +" <input type=\"button\" value=\"删除\" onclick=\"delOperbutton('"+attr[1]+"')\" class=\"btn\">"
		  +"    </td>"
		  +"  </tr>";
		  $("#rows").append(str);
		}
		msg=attr[0];
		//清空添加那一行
		$("#name").val("");
		//$("#isok1").attr("checked","checked");
		//$("#isok1").uniform();
		//$("#isok0").uniform();
		$("#order").val("");
		$("#code").val("");
	}
	$("#state").fadeOut("slow"); 
	$("#errorDiv").fadeIn("slow"); 
	$("#errorInfo").html(msg); 
	$('input[uniform=true]').uniform()
}

function updateOperbutton(id){
	if($.trim($("#name"+id).val())==""){
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请输入按钮名称!"); 
		$("#name"+id).focus();
		return false;
	}else{
		$("#nameHelp").html("");
		$("#nameDiv").removeClass("error");
	}
	$("#state").fadeIn("slow"); 
	var isok="1";
	if($("#isok"+id+"0").attr("checked")=="checked"){isok="0";}
	var data="pageContentNoFilter=1&id="+id+"&name="+$.trim(replaceAll($("#name"+id).val(),"&","<参数>"))
	+"&code="+$.trim(replaceAll($("#code"+id).val(),"&","<参数>"))
	+"&ordernum="+$.trim($("#order"+id).val())+"&isok="+isok+"&css="+$("#css"+id+"  option:selected").val();
	$.post("operbuttonUpdate.do",data,updateOperbuttonComplete,"text");
}

function updateOperbuttonComplete(data){
	var msg=data.substr(1,data.length-1);
	$("#state").fadeOut("slow"); 
	$("#errorDiv").fadeIn("slow"); 
	$("#errorInfo").html(msg); 
}


function delOperbutton(id){
	var confirm = $.scojs_confirm({
	content: "确定删除操作么?此操作无法回退!",
	action: function() {
		$("#state").fadeIn("slow"); 
		var data="pageContentNoFilter=1&id="+id+"&name="+$.trim(replaceAll($("#name"+id).val(),"&","<参数>"));
		$.post("operbuttonDel.do",data,delOperbuttonComplete,"text");
		this.destroy();
		}
	});
	confirm.show();
	$("#errorDiv").fadeOut("slow"); 
}

function delOperbuttonComplete(data){
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