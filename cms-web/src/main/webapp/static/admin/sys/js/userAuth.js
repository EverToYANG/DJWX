
//用户授权
function userAuthSubmit(){
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
	$("#rolenames").val(rolenames);
	return true;
}