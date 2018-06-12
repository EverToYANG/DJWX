jQuery.fn.center = function () {
	this.css("position","absolute");
	var t = ($(window).height() - this.height() - 150) / 2;
	if (t <= 0) t = 10;
	var top = t + $(window).scrollTop();
	if (top < 0) top = $(window).height() >= this.height() ? 10 : 0;
	if($.browser.msie && $(window).height()<500){
    this.css("top", $(window).height()-50+"px");
    }
	var left = ($(window).width() - this.width()) / 2+$(window).scrollLeft();
	if ($(window).width() <= this.width() + 20) left = 0;
	this.css("margin-left", "0");
	this.css("left", left + "px");
    return this;
}
function openWindow(title, url, width, height, isCloseOnly){
	if (width == '0') width = $(window).width() - 100;
	if (height == '0') height = $(window).height() - 60;
	if (!width) width = 450;
	if (!height) height = 350;
	$('#openWindowModal h3').html(title);
	$('#openWindowBtn').show();
	if (isCloseOnly == 'true') $('#openWindowBtn').hide();
	$('#openWindowIFrame').attr('src', url);
	$('#openWindowModal').width(width);
	$('#openWindowModal .modal-body').css('max-height', '9999px');
	$('#openWindowModal').height(height);
	$('#openWindowModal .modal-body').height(height - 115);
	$('#openWindowIFrame').height(height - 125);
	$('#openWindowModal').center();
	//$("body").eq(0).css("overflow","hidden");
	$('#openWindowModal').modal({keyboard:true});
}

function openTempWindow(title, url, width, height, isCloseOnly){
	if (width == '0') width = $(window).width() - 100;
	if (height == '0') height = $(window).height() - 60;
	if (!width) width = 450;
	if (!height) height = 350;
	$('#openWindowModal h3').html(title+"hhhhhhhhh");
	//$('#openWindowBtn').show();
	if (isCloseOnly == 'true') $('#openWindowBtn').hide();
	$('#openWindowIFrame').attr('src', url);
	$('#openWindowModal').width(width);
	$('#openWindowModal .modal-body').css('max-height', '9999px');
	$('#openWindowModal').height(height);
	$('#openWindowModal .modal-body').height(height - 115);
	$('#openWindowIFrame').height(height - 125);
	$('#openWindowModal').center();
	//$("body").eq(0).css("overflow","hidden");
	$('#openWindowModal').modal({keyboard:true});
}

function closeWindow(){
	$('#openWindowModal').modal('hide');
}
$(document).ready(function(){
	$('#openWindowBtn').click(function(e) {
		//$('#openWindowBtn').button('loading');
		if ($('#openWindowIFrame').contents().find("#btnSubmit").length > 0){
			$('#openWindowIFrame').contents().find("#btnSubmit").click();
		}else{
        	$('#openWindowIFrame').contents().find("form").submit();
		}
    });
	$('#openWindowModal').bind('hidden', function () {
	  //$("body").eq(0).css("overflow","scroll");
	  $('#openWindowIFrame').attr('src', '');
	  //$('#openWindowBtn').button('reset');
	});
});