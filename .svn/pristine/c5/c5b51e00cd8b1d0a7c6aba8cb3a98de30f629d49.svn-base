
            if(GetCookie("CMS_M_NAME")!=null&&GetCookie("CMS_M_NAME")!=""){
            	document.getElementById("RememberMe").checked=true;
            }
            if(GetCookie("CMS_M_NAME")!=null)document.getElementById("username").value=GetCookie("CMS_M_NAME");
            function RememberMeClick(){
            	if(document.getElementById("RememberMe").checked==false){
            		//删除cookie
            		DelCookie("CMS_M_NAME");
            	}
            }
            function formSubmit(){
            	submitForm();
            	return false;
            }
            function submitForm(){
				$("#errorDiv").fadeOut("slow"); 
				$("#successDiv").fadeOut("slow"); 
            	var isSubmit=true;
				if($.trim($("#username").val())==""){
					$("#usernameHelp").html("请输入用户名!");
					$("#usernameDiv").addClass("error");
					isSubmit = false;
				}else{
					$("#usernameHelp").html("");
					$("#usernameDiv").removeClass("error");
				}
				if($.trim($("#password").val())==""){
					$("#passwordHelp").html("请输入密码!");
					$("#passwordDiv").addClass("error");
					isSubmit = false;
				}else{
					$("#passwordHelp").html("");
					$("#passwordDiv").removeClass("error");
				}
				if($.trim($("#ValidateCode").val())==""){
					$("#ValidateCodeHelp").html("请输入验证码!");
					$("#ValidateCodeDiv").addClass("error");
					isSubmit = false;
				}else{
					$("#ValidateCodeHelp").html("");
					$("#ValidateCodeDiv").removeClass("error");
				}
            	if(document.getElementById("RememberMe").checked==true){
            		//设置cookie
            		SetCookie("CMS_M_NAME",document.getElementById("username").value,60*60*24*365);
            	}
            	if(isSubmit){
					var data="loginname="+$("#username").val()+"&pwd="+$("#password").val()
					+"&ValidateCode="+$("#ValidateCode").val()+"&RememberMe="+$("#RememberMe").is(':checked');
					$.post("mlogin.do",data,loginComplete,"text");
            	}
            }
            $("#username").focus();
         
			function loginComplete(data){
				if(""==data){
					$("#successDiv").fadeIn("slow"); 
					$("#successInfo").html("登录成功,正在跳转到会员中心..."); 
					location.href="member/index.do";
				}else{
					$("#errorDiv").fadeIn("slow"); 
					$("#errorInfo").html(data); 
				}
			}