<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/default.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath }/js/ztree/zTreeStyle.css" type="text/css">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/ztree/jquery.ztree.all-3.5.js"></script>
<title>角色添加</title>
<script type="text/javascript">
	$(function(){
		// 授权树初始化
		var setting = {
			data : {
				key : {
					title : "t"
				},
				simpleData : {
					enable : true
				}
			},
			check : {
				enable : true//使用ztree的勾选效果
			}
		};
		var treeNode=[];
		$.ajax({
			url : '${pageContext.request.contextPath}/FunctionAction_findByRole.action',
			type : 'POST',
			data:{"role_id":"<s:property value="#role.role_id"/>"},
			async:false,
			dataType : 'json',
			success : function(shuju) {
				treeNode=shuju;
			},
			error : function(msg) {
				alert('根据角色查询权限失败！');
			}
		});
		
		$.ajax({
			url : '${pageContext.request.contextPath}/FunctionAction_listajax.action',
			type : 'POST',
			dataType : 'json',
			success : function(data) {
				$.fn.zTree.init($("#functionTree"), setting, data);
				if(treeNode.length>0){
					 var treeObj = $.fn.zTree.getZTreeObj("functionTree");
					 for(var i=0;i<treeNode.length;i++){
						 var nodes = treeObj.getNodesByParam("id", treeNode[i].id, null);
						 treeObj.checkNode(nodes[0],true,true);
					 }
				}
			},
			error : function(msg) {
				alert('树加载异常!');
			}
		});
		// 点击保存
		$('#edit').click(function(){
			//表单校验
			var v = $("#roleForm").form("validate");
			if(v){
				//根据ztree的id获取ztree对象
				var treeObj = $.fn.zTree.getZTreeObj("functionTree");
				//获取ztree上选中的节点，返回数组对象
				var nodes = treeObj.getCheckedNodes(true);
				var array = new Array();
				for(var i=0;i<nodes.length;i++){
					var id = nodes[i].id;
					array.push(id);
				}
				var functionIds = array.join(",");
				//为隐藏域赋值（权限的id拼接成的字符串）
				$("input[name=functionIds]").val(functionIds);
				$("#roleForm").submit();
			}
		});
	});
</script>	
</head>
<body class="easyui-layout">
		<div region="north" style="height:31px;overflow:hidden;" split="false" border="false" >
			<div class="datagrid-toolbar">
				<a id="edit" icon="icon-save" href="#" class="easyui-linkbutton" plain="true" >保存</a>
			</div>
		</div>
		<div region="center" style="overflow:auto;padding:5px;" border="false">
			<form id="roleForm" method="post" action="RoleAction_update.action">
			    <input type="hidden" name="role_id" value='<s:property value="#role.role_id"/>'>
				<input type="hidden" name="functionIds">
				<table class="table-edit" width="80%" align="center">
					<tr class="title">
						<td colspan="2" align="center" style="font-size: 18px">修改角色信息</td>
					</tr>
					<tr>
						<td width="200">关键字</td>
						<td>
							<input type="text" name="role_code" class="easyui-validatebox" data-options="required:true" value="<s:property value="#role.role_code"/>"/>						
						</td>
					</tr>
					<tr>
						<td>名称</td>
						<td><input type="text" name="role_name" class="easyui-validatebox" data-options="required:true" value="<s:property value="#role.role_name"/>"/></td>
					</tr>
					<tr>
						<td>描述</td>
						<td>
							<textarea name="role_desc" rows="4" cols="60"><s:property value="#role.role_desc"/></textarea>
						</td>
					</tr>
					<tr>
						<td>授权</td>
						<td>
							<ul id="functionTree" class="ztree"></ul>
						</td>
					</tr>
					</table>
			</form>
		</div>
</body>
</html>