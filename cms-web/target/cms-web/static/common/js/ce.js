
function btnSubmit(){
				var teps=document.getElementsByName("ids");
				var j=0;
				var tempsId="";
				if(teps!=null && teps.length>0){
					for(var i=0;i<teps.length;i++){
						if(teps[i].checked){
						tempsId=teps[i].value;
						j++;
						}
					}
				}
				if( j ==1 ){
					
				//location.href="templetSiteAdd.do?templetId="+templetId;
					//$.post("templetSiteAdd.do","templetId="+templetId,saveComplete,"text");
					var confirm = $.scojs_confirm({
						content: "此操作将把模板资源文件复制并覆盖到此站点,确认此操作么?",
						action: function() {
							$.post("templetSiteAdd.do","templetI="+templetId,function(data){
									alert(data);
								},"text");
							}
						});
						confirm.show();
					//$.post("templetSiteAdd.do","templetId="+templetId,saveComplete,"text");
					//parent.closeWindow();
				}else if(j >1){
					alert("只能选择一条1");
				}else{
					alert("请选择模板1d");
				}
				
				
			}
			
			function saveComplete(data){
			$("#indextempletHelp").html(data);
			}