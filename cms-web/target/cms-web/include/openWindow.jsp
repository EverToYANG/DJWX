<%@ page language="java"  pageEncoding="UTF-8"%>
<div id="openWindowModal" class="modal hide fade form-horizontal">   
    <div class="modal-header" style="height:30px;">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3 style="font-size:14px"></h3>  
    </div>
    <div class="modal-body" style="width:100%; height:100%; padding:5px 0; margin:0;">
        <iframe id="openWindowIFrame" style="width:100%;height:100%;background-color:#ffffff;" scrolling="auto" frameborder="0" width="100%" height="100%"></iframe>
    </div>
    <div class="modal-footer">
        <button id="openWindowBtn" class="btn btn-primary" data-loading-text="提交中...">确 定</button>
        <button class="btn" data-dismiss="modal" aria-hidden="true">取 消</button>
    </div>
</div>
<script src="${pageContext.request.contextPath}/static/common/js/openWindow.js"></script>