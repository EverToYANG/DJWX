			function submitForm(){
				$("#errorDiv").fadeOut("slow"); 
				$("#successDiv").fadeOut("slow"); 
            	var isSubmit=true;
				if($.trim($("#username").val())==""){
					$("#usernameHelp").html("请输入会员名!");
					$("#usernameDiv").addClass("error");
					isSubmit = false;
				}else{
					$("#usernameHelp").html("");
					$("#usernameDiv").removeClass("error");
				}
				if($.trim($("#username").val()).length<5){
					$("#usernameHelp").html("会员名最少5位!");
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
				if($.trim($("#password").val()).length<6){
					$("#passwordHelp").html("密码最少6位!");
					$("#passwordDiv").addClass("error");
					isSubmit = false;
				}else{
					$("#passwordHelp").html("");
					$("#passwordDiv").removeClass("error");
				}
				if($("#repassword").val()==""){
					$("#repasswordHelp").html("请输入确认密码!");
					$("#repasswordDiv").addClass("error");
					isSubmit = false;
				}else{
					$("#repasswordHelp").html("");
					$("#repasswordDiv").removeClass("error");
				}
				if($("#repassword").val()!=$("#password").val()){
					$("#repasswordHelp").html("确认密码与密码不一致，请重新输入!");
					$("#repasswordDiv").addClass("error");
					isSubmit = false;
				}else{
					$("#repasswordHelp").html("");
					$("#repasswordDiv").removeClass("error");
				}
				if($.trim($("#email").val())==""  
					|| !isEmail($("#email").val())){
					$("#emailHelp").html("请输入正确的电子邮箱!");
					$("#emailDiv").addClass("error");
					isSubmit = false;
				}else{
					$("#emailHelp").html("");
					$("#emailDiv").removeClass("error");
				}
				if($.trim($("#ValidateCode").val())==""){
					$("#ValidateCodeHelp").html("请输入验证码!");
					$("#ValidateCodeDiv").addClass("error");
					isSubmit = false;
				}else{
					$("#ValidateCodeHelp").html("");
					$("#ValidateCodeDiv").removeClass("error");
				}
            	return isSubmit;
            }
            //检查登录名是否重复
            function checkSameLoginname(){
				if($.trim($("#username").val())!=""){
					$.post("memberCheckLoginname.do","loginname="+$("#username").val(),checkSameLoginnameComplete,"text");
				}        		
            }
            function checkSameLoginnameComplete(data){
            	if(data!=""){
					$("#errorDiv").fadeIn("slow"); 
					$("#errorInfo").html(data); 
            		$("#username").focus();
            	}else{
					$("#errorDiv").fadeOut("slow"); 
					$("#errorInfo").html(data); 
            	}
            }
            $("#username").focus();