function btnSubmit(){
	var units=document.getElementsByName("ids");
	var unitids="";
	var unitnames="";
	if(units!=null && units.length>0){
		for(var i=0;i<units.length;i++){
			if(units[i].checked){
				unitnames=unitnames+$("#"+units[i].id).attr("unit")+";";
				unitids=unitids+units[i].value+";";
			}
		}
	}
	if($("#unitids",parent.document).length>0){
		$("#unitids",parent.document).val(unitids);
	}
	if($("#unitnames",parent.document).length>0){
		$("#unitnames",parent.document).val(unitnames);
	}
	parent.closeWindow();
	
}