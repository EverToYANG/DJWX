function btnSubmit(){
	parent.closeWindow();
	
}

function selectTempletDo(id,name){
	var siteId = $("#siteId").val();
	if($("#templetName",parent.document).length>0){
		$("#templetName",parent.document).val(name);
	}
	if($("#templet",parent.document).length>0){
		
		$("#templet",parent.document).val(id);
		//同步资源
		var confirm = $.scojs_confirm({
			content: "确认此操作么?",
			action: function() {
				$.post("siteSyncRes.do","siteId="+siteId+"&templetId="+id,function(data){
						parent.closeWindow();
					},"text");
				}
			});
		
		confirm.show();
	}
}
function syncResComplete(data){
	$("#templetHelp").html(data);
}