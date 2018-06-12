//添加
function add(){
	location.href="form.do?pageFuncId="+$("#pageFuncId").val();
}

//编辑
function edit(){
	if(isCheckOne()){
		location.href="form.do?id="+getCheckOneValue()+"&pageFuncId="+$("#pageFuncId").val();
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
}

//添加学习资料
function addArticle(id){
	
	openWindow('学习资料','articleAdd.do?id='+id,500,310,'false');
}

function del(){
	if(isCheck()){
		var confirm = $.scojs_confirm({
		content: "确定删除操作么?此操作无法回退!",
		action: function() {
				location.href="del.do?pageFuncId="+$("#pageFuncId").val()+"&ids="+getCheckValue();
			}
		});
		confirm.show();
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择数据"); 
	}
}
//表单验证
function formCheck(){
	isCheck=true;
	if($.trim($("#name").val())==""){
		$("#nameHelp").html("必须填写");
		$("#nameDiv").addClass("error");
		$("#name").focus();
		isCheck=false;
	}else{
		$("#nameHelp").html("");
		$("#nameDiv").removeClass("error");
	}
	return isCheck;
}

function articleFormCheck(){
	isCheck=true;
	if($.trim($("#articleid").val())==""){
		$("#articleidHelp").html("必须填写");
		$("#articleidDiv").addClass("error");
		$("#articleid").focus();
		isCheck=false;
	}else{
		$("#articleidHelp").html("");
		$("#articleidDiv").removeClass("error");
	}
	return isCheck;
}



function delArticle(id){
	var confirm = $.scojs_confirm({
		content: "确定删除操作么?此操作无法回退!",
		action: function() {
			location.href="articleDelDo.do?id="+id;
		}
	});
	confirm.show();
}