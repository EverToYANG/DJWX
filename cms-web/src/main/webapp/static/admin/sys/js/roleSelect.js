function btnSubmit(){
	var roles=document.getElementsByName("ids");
	var roleids="";
	var rolenames="";
	if(roles!=null && roles.length>0){
		for(var i=0;i<roles.length;i++){
			if(roles[i].checked){
				rolenames=rolenames+$("#"+roles[i].id).attr("rolename")+";";
				roleids=roleids+roles[i].value+";";
			}
		}
	}
	if($("#roleids",parent.document).length>0){
		$("#roleids",parent.document).val(roleids);
	}
	if($("#rolenames",parent.document).length>0){
		$("#rolenames",parent.document).val(rolenames);
	}
	parent.closeWindow();
	
}