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
					
				location.href="templetSiteAdd.do?templetId="+templetId;
					//$.post("templetSiteAdd.do","templetId="+templetId,saveComplete,"text");
				
					//$.post("templetSiteAdd.do","templetId="+templetId,saveComplete,"text");
					parent.closeWindow();
				}else if(j >1){
					alert("只能选择一条");
				}else{
					alert("请选择模板");
				}
				
				
			}
			
			function saveComplete(data){
			$("#indextempletHelp").html(data);
			}