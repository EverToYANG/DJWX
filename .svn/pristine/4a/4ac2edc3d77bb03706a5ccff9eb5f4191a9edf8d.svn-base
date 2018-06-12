
            if(GetCookie("CMS_SYS_ACCOUNT")!=null&&GetCookie("CMS_SYS_ACCOUNT")!=""){
            	document.getElementById("RememberMe").checked=true;
            }
            if(GetCookie("CMS_SYS_ACCOUNT")!=null){
            	document.getElementById("username").value=GetCookie("CMS_SYS_ACCOUNT");
            }
            	
            function RememberMeClick(){
            	if(document.getElementById("RememberMe").checked==false){
            		//删除cookie
            		DelCookie("CMS_SYS_ACCOUNT");
            	}
            }
           
            function submitForm(){
            	var isSubmit=true;
				if($.trim($("#username").val())==""){
					$("#err_area").removeClass("dn");
					$("#err_tips").html("请输入用户名!"); 
					isSubmit = false;
				}else{
					$("#err_area").addClass("dn");
					$("#err_tips").html("");
				}
				if($.trim($("#password").val())==""){
					$("#err_area").removeClass("dn");
					$("#err_tips").html("请输入密码!"); 
					isSubmit = false;
				}else{
					$("#err_area").addClass("dn");
					$("#err_tips").html("");
				}
				if($.trim($("#captcha").val())==""){
					$("#err_area").removeClass("dn");
					$("#err_tips").html("请输入验证码!"); 
					isSubmit = false;
				}else{
					$("#err_area").addClass("dn");
					$("#err_tips").html("");
				}
            	if(document.getElementById("RememberMe").checked==true){
            		//设置cookie
            		SetCookie("CMS_SYS_ACCOUNT",document.getElementById("username").value,60*60*24*365);
            	}
            	
            	if(isSubmit){
            		console.log("isSubmit",isSubmit);
            	}
            	return isSubmit;
            }
            $("#username").focus();
            
			function loginComplete(data){
				alert(data);
				console.log("data",data);
				var json = eval ("(" + data + ")"); 
				if(json.success){
					$("#successDiv").fadeIn("slow"); 
					$("#successInfo").html("登录成功,正在跳转到管理中心..."); 
					location.href="index.jsp";
				}else{
					$("#err_area").removeClass("dn");
					$("#err_tips").html(json.message); 
				}
			}