var basePath="";
var ajaxUrl="";
var ajaxPara="";
function isNull(obj){
	if (typeof(obj) == "undefined")
	  return true;
	  
	if (obj == undefined)
	  return true;
	  
	if (obj == null)
	  return true;
	 
	return false;
}

function getTrElement(element){
	if (isNull(element)) return;
	for (element = element.parentNode;;){
		if (element != null && element.tagName == 'TR'){
			break;
		}else{
			element = element.parentNode;
		} 
	}
	return element;
}
function getTreeLevel(e) {
	var length = 0;
	if (!isNull(e)){
		if (e.tagName == 'TR') {
			length = parseInt(e.getAttribute('treeItemLevel'));
		}
	}
	return length;
}
 
 
function getImgClickableElementByTr(element){
	if (isNull(element) || element.tagName != 'TR') return;
	var img = null;
	if (!isNull(element.childNodes)){
		var imgCol = element.getElementsByTagName('IMG');
		if (!isNull(imgCol)){
			for (x=0;x<imgCol.length;x++){
				if (!isNull(imgCol.item(x).getAttribute('isOpen'))){
					img = imgCol.item(x);
					break;
				}
			}
		}
	}
	return img;
}
 
var weightedLink = null;
 
function fontWeightLink(element){
    if (weightedLink != null)
    {
        weightedLink.style.fontWeight = 'normal';
    }
    element.style.fontWeight = 'bold';
    weightedLink = element;
}

var completedNodeID = null;
function displayChildren(img){
	if (isNull(img)) return;

	var tr = getTrElement(img);
  
    var isToOpen = img.getAttribute('isOpen') == 'false';
    var isByAjax = img.getAttribute('isAjax') == 'true';
    var nodeID = img.getAttribute('id');
    
	if (!isNull(img) && img.getAttribute('isOpen') != null){
		if (img.getAttribute('isOpen') == 'false'){
			img.setAttribute('isOpen', 'true');
            img.setAttribute('src', basePath+'/static/tree/image/minus.gif');
		}else{
            img.setAttribute('isOpen', 'false');
            img.setAttribute('src', basePath+'/static/tree/image/plus.gif');
		}
	}
  
    if (isToOpen && isByAjax)
    {
        var div = document.createElement('div');
        div.innerHTML = "<img align='absmiddle' border='0' src='"+basePath+"/static/tree/image/loading.gif' /> 数据加载中，请稍候...";
        img.parentNode.appendChild(div);
        $(div).addClass('loading');
        loadingChannels(tr, img, div, nodeID);
    }
    else
    {
        var level = getTreeLevel(tr);
    	
	    var collection = new Array();
	    var index = 0;
 
	    for ( var e = tr.nextSibling; !isNull(e) ; e = e.nextSibling) {
		    if (!isNull(e) && !isNull(e.tagName) && e.tagName == 'TR'){
		        var currentLevel = getTreeLevel(e);
		        if (currentLevel <= level) break;
		        if(e.style.display == '') {
			        e.style.display = 'none';
		        }else{
			        if (currentLevel != level + 1) continue;
			        e.style.display = '';
			        var imgClickable = getImgClickableElementByTr(e);
			        if (!isNull(imgClickable)){
				        if (!isNull(imgClickable.getAttribute('isOpen')) && imgClickable.getAttribute('isOpen') =='true'){
					        imgClickable.setAttribute('isOpen', 'false');
                            imgClickable.setAttribute('src', basePath+'/static/tree/image/plus.gif');
					        collection[index] = imgClickable;
					        index++;
				        }
			        }
		        }
            }
	    }
    	
	    if (index > 0){
		    for (i=0;i<=index;i++){
			    displayChildren(collection[i]);
		    }
	    }
    }
}

function loadingChannels(tr, img, div, nodeID){
    var url = ajaxUrl;
    var pars = ajaxPara+(ajaxPara!=""?"&":"")+'pid=' + nodeID+'&plevel='+getTreeLevel(tr);
    jQuery.post(url, pars, function(data, textStatus)
    {
        $($.parseHTML(data)).insertAfter($(tr));
        img.setAttribute('isAjax', 'false');
        img.parentNode.removeChild(div);
        $('input[uniform=true]').uniform()
	      $('a[rel=tooltip]').tooltip({});
	      $(".popover").show();
    });
    completedNodeID = nodeID;
}
 
function loadingChannelsOnLoad(paths){
    if (paths && paths.length > 0){
        var nodeIDs = paths.split(',');
        var nodeID = nodeIDs[0];
        var img = $('#' + nodeID);
        if (img.attr('isOpen') == 'false'){
            displayChildren(img[0]);
            if (completedNodeID && completedNodeID == nodeID){
                if (paths.indexOf(',') != -1){
paths = paths.substring(paths.indexOf(',') + 1);
                    setTimeout("loadingChannelsOnLoad('" + paths + "')", 1000);
                }
            } 
        }
    }
}
function treeIdCheck(idpath){
	var obj=$("#"+idpath);
	//选中
	if("checked"==obj.attr("checked")){
		//选中所有父节点
		var ids=idpath.split("_");
		if(ids!=null && ids.length>0){
			for(var i=0;i<ids.length;i++){
				$("#"+ids[i]).attr("checked",true);
				$.uniform.update($("#"+ids[i]));
			}
		}
		//选中所有子节点
		$("input[id^='"+idpath+"']").attr("checked",true);
		$.uniform.update($("input[id^='"+idpath+"']"));
	}else{
		//取消选中所有子节点
		$("input[id^='"+idpath+"']").attr("checked",false);
		$.uniform.update($("input[id^='"+idpath+"']"));
	}
}
