/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-04-06 16:00:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.admin.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<link id=\"easyuiTheme\" rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/themes/default/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/themes/icon.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.8.3.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/locale/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/ztree/zTreeStyle.css\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/ztree/jquery.ztree.all-3.5.js\"></script>\r\n");
      out.write("<title>后台管理界面</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t//提示框\r\n");
      out.write("\t\t$.messager.show({\r\n");
      out.write("\t\t\ttitle:'系统提示',\r\n");
      out.write("\t\t\tmsg:'欢迎您管理员【");
      if (_jspx_meth_s_005fproperty_005f0(_jspx_page_context))
        return;
      out.write("】',\r\n");
      out.write("\t\t\ttimeout:5000,\r\n");
      out.write("\t\t\tshowType:'slide'\r\n");
      out.write("\t\t})\r\n");
      out.write("\t})\r\n");
      out.write("\t//动态添加选项卡\r\n");
      out.write("\tfunction zTreeOnClick(event,treeId,treeNode,clickFlag){\r\n");
      out.write("\t\t\tif(treeNode.page!=undefined&&treeNode.page!=null&&treeNode.page!=''){\r\n");
      out.write("\t\t\t\tvar content='<iframe frameborder=\"0\" height=\"100%\" width=\"100%\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/'+treeNode.page+'\"></iframe>';\r\n");
      out.write("\t\t\t\tif($(\"#tt\").tabs(\"exists\",treeNode.name)){\r\n");
      out.write("\t\t\t\t\t$(\"#tt\").tabs(\"select\",treeNode.name);\r\n");
      out.write("\t\t\t\t\tvar tab = $('#tt').tabs('getSelected'); \r\n");
      out.write("\t\t\t\t\t$('#tt').tabs('update', {\r\n");
      out.write("\t\t\t\t\t    tab: tab,\r\n");
      out.write("\t\t\t\t\t    options: {\r\n");
      out.write("\t\t\t\t\t        title: treeNode.name,\r\n");
      out.write("\t\t\t\t\t        content: content\r\n");
      out.write("\t\t\t\t\t    }\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$(\"#tt\").tabs(\"add\",{\r\n");
      out.write("\t\t\t\t\t\ttitle:treeNode.name,\r\n");
      out.write("\t\t\t\t\t\tcontent:content,\r\n");
      out.write("\t\t\t\t\t\tclosable:true\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//打开修改密码窗口\r\n");
      out.write("\tfunction openEditPwdWindow(){\r\n");
      out.write("\t\t$(\"#editPwdWindow\").window('open');\r\n");
      out.write("\t}\r\n");
      out.write("\t//联系管理员\r\n");
      out.write("\tfunction call(){\r\n");
      out.write("\t\t$(\"#callWindow\").window('open');\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction closecallWindow(){\r\n");
      out.write("\t\t$(\"#callWindow\").window('close');\r\n");
      out.write("\t}\r\n");
      out.write("\t//提交修改密码\r\n");
      out.write("\tfunction editPwd(){\r\n");
      out.write("\t\tvar v=$(\"#editPasswordForm\").form(\"validate\");\r\n");
      out.write("\t\tif(v){\r\n");
      out.write("\t\t\tvar v1=$(\"#txtNewPass\").val();\r\n");
      out.write("\t\t\tvar v2=$(\"#txtRePass\").val();\r\n");
      out.write("\t\t\tif(v1==v2){\r\n");
      out.write("\t\t\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/ManagerAction_editPwd.action\",{\"password\":v1},function(data){\r\n");
      out.write("\t\t\t\t\talert(data)\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$.messager.alert(\"提示信息\",\"两次密码输入不一致\",\"warning\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t//取消修改密码\r\n");
      out.write("\tfunction closeEditPwdWindow(){\r\n");
      out.write("\t\t$(\"#editPwdWindow\").window('close');\r\n");
      out.write("\t}\r\n");
      out.write("\t//更换皮肤\r\n");
      out.write("\tfunction changeTheme(themeName) {\r\n");
      out.write("\t\tvar $easyuiTheme = $('#easyuiTheme');\r\n");
      out.write("\t\tvar url = $easyuiTheme.attr('href');\r\n");
      out.write("\t\tvar href = url.substring(0, url.indexOf('themes')) + 'themes/'\r\n");
      out.write("\t\t\t\t+ themeName + '/easyui.css';\r\n");
      out.write("\t\t$easyuiTheme.attr('href', href);\r\n");
      out.write("\t\tvar $iframe = $('iframe');\r\n");
      out.write("\t\tif ($iframe.length > 0) {\r\n");
      out.write("\t\t\tfor ( var i = 0; i < $iframe.length; i++) {\r\n");
      out.write("\t\t\t\tvar ifr = $iframe[i];\r\n");
      out.write("\t\t\t\t$(ifr).contents().find('#easyuiTheme').attr('href', href);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("\t\r\n");
      out.write("\t//退出系统事件\r\n");
      out.write("\tfunction exit(){\r\n");
      out.write("\t\t$.messager.confirm('确认提示框','确定要退出系统吗?',function(r){ \r\n");
      out.write("\t\t\tif (r){ \r\n");
      out.write("\t\t\t\twindow.location.href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/ManagerAction_logout.action\";\r\n");
      out.write("\t\t\t} \r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\"> \r\n");
      out.write("\t<div data-options=\"region:'north',split:true\" style=\"height:70px\">\r\n");
      out.write("           <div style=\"float: left;\">\r\n");
      out.write("\t\t\t   <img alt=\"\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/admin_logo.png\">\r\n");
      out.write("           </div>\r\n");
      out.write("           <div style=\"float: right;line-height: 60px;\">\r\n");
      out.write("\t\t\t   欢迎您,管理员<strong>【");
      if (_jspx_meth_s_005fproperty_005f1(_jspx_page_context))
        return;
      out.write("】</strong>\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-menubutton\" data-options=\"menu:'#pf',iconCls:'icon-ok'\">更换皮肤</a> \r\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-menubutton\" data-options=\"menu:'#mm',iconCls:'icon-help'\">控制面板</a> \r\n");
      out.write("\t\t\t<div id=\"mm\" style=\"width:150px;\"> \r\n");
      out.write("\t\t\t\t<div data-options=\"iconCls:'icon-edit'\" onclick=\"openEditPwdWindow()\">修改密码</div> \r\n");
      out.write("\t\t\t\t<div data-options=\"iconCls:'icon-user'\" onclick=\"call()\">联系管理员</div>\r\n");
      out.write("\t\t\t\t<div class=\"menu-sep\"></div> \r\n");
      out.write("\t\t\t\t<div data-options=\"iconCls:'icon-cancel'\" onclick=\"exit()\">退出系统</div> \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"pf\" style=\"width:150px;\"> \r\n");
      out.write("\t\t\t\t<div onclick=\"changeTheme('default');\">default</div>\r\n");
      out.write("\t\t\t\t<div onclick=\"changeTheme('gray');\">gray</div>\r\n");
      out.write("\t\t\t\t<div onclick=\"changeTheme('black');\">black</div>\r\n");
      out.write("\t\t\t\t<div onclick=\"changeTheme('bootstrap');\">bootstrap</div>\r\n");
      out.write("\t\t\t\t<div onclick=\"changeTheme('metro');\">metro</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("           </div>\r\n");
      out.write("\t</div> \r\n");
      out.write("\t<div data-options=\"region:'west',title:'菜单列表',split:true\" style=\"width:195px;\">\r\n");
      out.write("\t\t\t<div class=\"easyui-accordion\" data-options=\"fit:true\">\r\n");
      out.write("\t\t\t\t<div title=\"基础菜单\" data-options=\"iconCls:'icon-basic'\">\r\n");
      out.write("\t\t\t\t\t<ul id=\"permissions\" class=\"ztree\"></ul>\r\n");
      out.write("\t\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\t\t$(function(){\r\n");
      out.write("\t\t\t\t\t\t\tvar setting={\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsimpleData: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tenable: true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\tcallback:{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonClick:zTreeOnClick\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t};\r\n");
      out.write("\t\t\t\t\t\t\tvar url1=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/FunctionAction_findMenu.action\";\r\n");
      out.write("\t\t\t\t\t\t\t$.post(url1,function(date){\r\n");
      out.write("\t\t\t\t\t\t\t\t $.fn.zTree.init($(\"#permissions\"),setting,date);\r\n");
      out.write("\t\t\t\t\t\t\t},\"json\");\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tvar url2=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/json/sys.json\";\r\n");
      out.write("\t\t\t\t\t\t\t$.post(url2,{},function(zNodes){\r\n");
      out.write("\t\t\t\t\t\t\t  \t $.fn.zTree.init($(\"#roles\"),setting,zNodes);\r\n");
      out.write("\t\t\t\t\t\t\t},\"json\");\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div title=\"系统菜单\" data-options=\"iconCls:'icon-basic'\">\r\n");
      out.write("\t\t\t\t\t<ul id=\"roles\" class=\"ztree\"></ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t</div> \r\n");
      out.write("\t<div data-options=\"region:'center',split:true\" style=\"background:#eee;\">\r\n");
      out.write("\t\t<div id=\"tt\" class=\"easyui-tabs\" data-options=\"fit:true\">\r\n");
      out.write("\t\t\t<div title=\"首页\" data-options=\"iconCls:'icon-home'\" align=\"center\">\r\n");
      out.write("\t\t\t\t<div style=\"padding-top: 160px;\">\r\n");
      out.write("\t\t\t\t\t<h1>欢迎使用家庭记账后台管理系统</h1>\r\n");
      out.write("\t\t\t\t\t<h3>welcome！</h3>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div> \r\n");
      out.write("\t<div data-options=\"region:'south',split:true\" style=\"height:40px;\">\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t家庭记账系统后台管理\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\t</div> \r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 弹出窗口==修改密码 -->\r\n");
      out.write("\t<div id=\"editPwdWindow\" class=\"easyui-window\" title=\"修改密码\" collapsible=\"false\" minimizable=\"false\" modal=\"true\" closed=\"true\" resizable=\"false\"\r\n");
      out.write("        maximizable=\"false\" icon=\"icon-save\"  style=\"width: 300px; height: 160px; padding: 5px;\r\n");
      out.write("        background: #fafafa\">\r\n");
      out.write("        <div class=\"easyui-layout\" fit=\"true\">\r\n");
      out.write("            <div region=\"center\" border=\"false\" style=\"padding: 10px; background: #fff; border: 1px solid #ccc;\">\r\n");
      out.write("            <form method=\"post\" id=\"editPasswordForm\">\r\n");
      out.write("                <table cellpadding=3>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>新密码：</td>\r\n");
      out.write("                        <td><input id=\"txtNewPass\" type=\"Password\" data-options=\"validType:'length[6,12]'\" class=\"txt01 easyui-validatebox\" required=\"true\"/></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>确认密码：</td>\r\n");
      out.write("                        <td><input id=\"txtRePass\" type=\"Password\" data-options=\"validType:'length[6,12]'\" class=\"txt01 easyui-validatebox\" required=\"true\"/></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            </form>\r\n");
      out.write("            <div region=\"south\" border=\"false\" style=\"text-align: right; height: 30px; line-height: 30px;\">\r\n");
      out.write("                <a onclick=\"editPwd()\" class=\"easyui-linkbutton\" icon=\"icon-ok\" href=\"javascript:void(0)\" >确定</a> \r\n");
      out.write("                <a onclick=\"closeEditPwdWindow()\" class=\"easyui-linkbutton\" icon=\"icon-cancel\" href=\"javascript:void(0)\">取消</a>\r\n");
      out.write("            </div>\r\n");
      out.write("           \r\n");
      out.write("\t    </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 联系管理员窗口 -->\r\n");
      out.write("\t<div id=\"callWindow\" class=\"easyui-window\" title=\"联系管理员\" collapsible=\"false\" minimizable=\"false\" modal=\"true\" closed=\"true\" resizable=\"false\"\r\n");
      out.write("        maximizable=\"false\" icon=\"icon-menu\"  style=\"width: 300px; height: 160px; padding: 5px;background: #fafafa\">\r\n");
      out.write("        <div class=\"easyui-layout\" fit=\"true\">\r\n");
      out.write("\t            <div region=\"center\" border=\"false\" style=\"padding: 10px; background: #fff; border: 1px solid #ccc;\">\r\n");
      out.write("\t            \t<strong>管理员邮箱：javazt@126.com</strong><br>\r\n");
      out.write("\t            \t<strong>管理员qq：1534479537</strong>\r\n");
      out.write("\t\t       </div>\r\n");
      out.write("\t     </div>\r\n");
      out.write("\t </div>\r\n");
      out.write("</body> \r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_005fproperty_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f0 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f0.setParent(null);
    // /WEB-INF/admin/common/main.jsp(21,15) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f0.setValue("#session.currentManager.manager_name");
    int _jspx_eval_s_005fproperty_005f0 = _jspx_th_s_005fproperty_005f0.doStartTag();
    if (_jspx_th_s_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f1 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f1.setParent(null);
    // /WEB-INF/admin/common/main.jsp(112,22) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f1.setValue("#session.currentManager.manager_name");
    int _jspx_eval_s_005fproperty_005f1 = _jspx_th_s_005fproperty_005f1.doStartTag();
    if (_jspx_th_s_005fproperty_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f1);
    return false;
  }
}
