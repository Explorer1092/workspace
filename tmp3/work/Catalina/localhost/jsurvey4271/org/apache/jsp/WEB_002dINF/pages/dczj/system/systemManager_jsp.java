package org.apache.jsp.WEB_002dINF.pages.dczj.system;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class systemManager_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tag/hanweb-tags.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fhead_0026_005ftree_005fmessage_005fmenu_005ficonfont_005fdialog_005fcookie_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fimport_0026_005ftype_005fpath_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fh_005fhead_0026_005ftree_005fmessage_005fmenu_005ficonfont_005fdialog_005fcookie_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005fimport_0026_005ftype_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fh_005fhead_0026_005ftree_005fmessage_005fmenu_005ficonfont_005fdialog_005fcookie_005fnobody.release();
    _005fjspx_005ftagPool_005fh_005fimport_0026_005ftype_005fpath_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("<title>调查征集系统</title>\r\n");
      if (_jspx_meth_h_005fhead_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_h_005fimport_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/layui/css/layui.css\">\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/layui/layui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("\tvar treeMenu = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tree}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("    $('#webtree').menu({\r\n");
      out.write("\t\ttree : 'rangemenu',\r\n");
      out.write("\t\theight : 200,\r\n");
      out.write("\t\tinit : function() {\r\n");
      out.write("\t\t\tsetting('rangemenu', onClickRange, onDbClickRange, treeMenu);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\tfunction onClickRange(event, treeId, treeNode) {\r\n");
      out.write("\t\t$('#webId').val(treeNode.id);\r\n");
      out.write("\t\t$('#webName').val(treeNode.name);\r\n");
      out.write("\t\t$('#webid').val(treeNode.id);\r\n");
      out.write("\t\t$('#webtree').val(treeNode.name);\r\n");
      out.write("\t\t$('#webtree_menu').fadeOut(50);\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction setting(treeName, onClickFunction, onDblClickFunction, rootNode) {\r\n");
      out.write("\t\tvar setting = {\r\n");
      out.write("\t\t\tasync : {\r\n");
      out.write("\t\t\t\tenable : true,\r\n");
      out.write("\t\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/system/sync_loadtree.do',\r\n");
      out.write("\t\t\t\tautoParam : [ \"id=webid\", \"isDisabled\" ]\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tcallback : {\r\n");
      out.write("\t\t\t\tbeforeClick : beforeClick,\r\n");
      out.write("\t\t\t\tbeforeDblClick : beforeClick,\r\n");
      out.write("\t\t\t\tonClick : onClickFunction,\r\n");
      out.write("\t\t\t\tonDblClick : onDblClickFunction\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t$(\"#\" + treeName).tree(setting, rootNode);\r\n");
      out.write("\t\t$(\"#\" + treeName).tree().refreshNode('');\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction onDbClickRange(event, treeId, treeNode) {\r\n");
      out.write("\t\tif (treeNode == null) {\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif (treeNode.isDisabled)//根节点及失效节点双击无效\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t$('#webid').val(treeNode.id);\r\n");
      out.write("\t\t$('#webtree').val(treeNode.name);\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction beforeClick(treeId, treeNode, clickFlag) {\r\n");
      out.write("\t\tif (treeNode.isDisabled)\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\treturn (treeNode.id != 0);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//数据调用树\r\n");
      out.write("\t/* var treeMenu_datacall = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tree_datacall}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("    $('#webtree_datacall').menu({\r\n");
      out.write("\t\ttree : 'rangemenu_datacall',\r\n");
      out.write("\t\theight : 200,\r\n");
      out.write("\t\tinit : function() {\r\n");
      out.write("\t\t\tsetting_datacall('rangemenu_datacall', onClickRange_datacall, onDbClickRange_datacall, treeMenu_datacall);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\tfunction onClickRange_datacall(event, treeId, treeNode) {\r\n");
      out.write("\t\tif(treeNode.id == 0){\r\n");
      out.write("\t\t\t$('#webtree_datacall_menu').fadeOut(50);\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$('#webid_datacall').val(treeNode.id);\r\n");
      out.write("\t\t\t$('#webtree_datacall').val(treeNode.name);\r\n");
      out.write("\t\t\t$('#webtree_datacall_menu').fadeOut(50);\r\n");
      out.write("\t\t\tvar pagetype = $('#pagetype_datacall').val();\r\n");
      out.write("\t\t\tchangePage(pagetype);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction setting_datacall(treeName_datacall, onClickFunction_datacall, onDblClickFunction_datacall, rootNode_datacall) {\r\n");
      out.write("\t\tvar setting_datacall = {\r\n");
      out.write("\t\t\tasync : {\r\n");
      out.write("\t\t\t\tenable : true,\r\n");
      out.write("\t\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/websiteconfig/sync_loadtree_datacall.do',\r\n");
      out.write("\t\t\t\tautoParam : [ \"id\", \"isDisabled\" ]\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tcallback : {\r\n");
      out.write("\t\t\t\tbeforeClick : beforeClick_datacall,\r\n");
      out.write("\t\t\t\tbeforeDblClick : beforeClick_datacall,\r\n");
      out.write("\t\t\t\tonClick : onClickFunction_datacall,\r\n");
      out.write("\t\t\t\tonDblClick : onDblClickFunction_datacall\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t$(\"#\" + treeName_datacall).tree(setting_datacall, rootNode_datacall);\r\n");
      out.write("\t\t$(\"#\" + treeName_datacall).tree().refreshNode('');\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction onDbClickRange_datacall(event, treeId, treeNode) {\r\n");
      out.write("\t\tif (treeNode == null) {\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif (treeNode.isDisabled)//根节点及失效节点双击无效\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t$('#webid_datacall').val(treeNode.id);\r\n");
      out.write("\t\t$('#webtree_datacall').val(treeNode.name);\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction beforeClick_datacall(treeId, treeNode, clickFlag) {\r\n");
      out.write("\t\tif (treeNode.isDisabled)\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\treturn (treeNode.id != 0);\r\n");
      out.write("\t}\r\n");
      out.write("\tnodisplayweb(); */\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t.layui-bg-main{background-color:#172951!important}\r\n");
      out.write("\t.layui-input{height: 30px;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"layui-layout-body\" >\r\n");
      out.write("\t<input type=\"hidden\" id=\"webId\">\r\n");
      out.write("\t<input type=\"hidden\" id=\"webName\">\r\n");
      out.write("\t<div class=\"layui-layout layui-layout-admin\">\r\n");
      out.write("\t  <div class=\"layui-header layui-bg-main\">\r\n");
      out.write("\t    <div class=\"layui-logo layui-bg-main\" style=\"width:200px;\">\r\n");
      out.write("\t    \t<span id=\"logo\" style=\"font-size:18px;\"><font color=\"#5CB85C\"><b>JSURVEY</b></font></span>\r\n");
      out.write("\t    \t<span style=\"font-size:16px;\"><font color=\"#eeeeee\"><b>调查征集系统 </b></font></span>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t    <!-- 头部区域（可配合layui已有的水平导航） -->\r\n");
      out.write("\t    <ul class=\"layui-nav layui-layout-left layui-bg-main\">\r\n");
      out.write("\t    \t<li class=\"layui-nav-item\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/index.do\">我的调查</a></li>\r\n");
      out.write("\t    </ul>\r\n");
      out.write("\t    <ul class=\"layui-nav layui-layout-right\">\r\n");
      out.write("\t      <li class=\"layui-inline\" style=\"padding-right: 20px;\">\r\n");
      out.write("\t      \t<input type=\"text\" id=\"webtree\" class=\"layui-input\" readonly = \"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t      </li>\r\n");
      out.write("\t      ");
      out.write("\r\n");
      out.write("\t      <li class=\"layui-inline\" style=\"width: 60px;cursor: pointer;\"><img alt=\"系统设置\" width=\"30px;\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/u10.png\"></li>\r\n");
      out.write("\t      <li class=\"layui-nav-item\">\r\n");
      out.write("\t        <a href=\"javascript:;\">您好，");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</a>\r\n");
      out.write("\t        <dl class=\"layui-nav-child\">         \r\n");
      out.write("\t          <dd><a style=\"cursor: pointer;\" onclick=\"openDialog('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/user/modify_self_show.do',500,515,{title:'账户设置'})\">账户设置</a></dd>\r\n");
      out.write("\t          <dd><a style=\"cursor: pointer;\" onclick=\"openDialog('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/onlineuser/list.do',500,515,{title:'在线用户'})\">在线用户</a></dd>\r\n");
      out.write("\t          <dd><a style=\"cursor: pointer;\" onclick=\"top.location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/logout.do'\">系统退出</a></dd>\r\n");
      out.write("\t        </dl>\r\n");
      out.write("\t      </li>\r\n");
      out.write("\t    </ul>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"layui-side layui-bg-black layui-bg-main\" style=\"top:60px;\">\r\n");
      out.write("\t    <div class=\"layui-side-scroll\">\r\n");
      out.write("\t      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->\r\n");
      out.write("\t      <ul class=\"layui-nav layui-nav-tree layui-bg-main\"  lay-filter=\"test\">\r\n");
      out.write("\t        <li class=\"layui-nav-item layui-nav-itemed\">\r\n");
      out.write("\t          <a class=\"\" href=\"javascript:;\">系统管理</a>\r\n");
      out.write("\t          <dl class=\"layui-nav-child\">\r\n");
      out.write("\t            <dd><a style=\"cursor: pointer;\" onclick=\"var webId = $('#webId').val();var webName = $('#webName').val();changePage(encodeURI('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/website/list.do?webId='+webId+'&webName='+webName));display();nodisplayweb();\">&nbsp;&nbsp;网站管理</a></dd>\r\n");
      out.write("\t            <dd><a style=\"cursor: pointer;\" onclick=\"changePage('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/datacall/list.do');nodisplay();displayweb();\">&nbsp;&nbsp;数据调用</a></dd>\r\n");
      out.write("\t            <dd><a style=\"cursor: pointer;\" onclick=\"changePage('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/system/grouplist.do');nodisplay();nodisplayweb();\">&nbsp;&nbsp;机构管理</a></dd>\r\n");
      out.write("\t            <dd><a style=\"cursor: pointer;\" onclick=\"changePage('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/system/userlist_show.do');nodisplay();nodisplayweb();\">&nbsp;&nbsp;用户管理</a></dd>\r\n");
      out.write("\t            <dd><a style=\"cursor: pointer;\" onclick=\"changePage('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/sensitive/list.do');nodisplay();nodisplayweb();\">&nbsp;&nbsp;敏感词管理</a></dd>\r\n");
      out.write("\t            <dd><a style=\"cursor: pointer;\" onclick=\"changePage('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/log/logtable.do');nodisplay();nodisplayweb();\">&nbsp;&nbsp;操作日志</a></dd>\r\n");
      out.write("\t          </dl>\r\n");
      out.write("\t        </li>\r\n");
      out.write("\t        <li class=\"layui-nav-item\">\r\n");
      out.write("\t          <a href=\"javascript:;\">系统参数</a>\r\n");
      out.write("\t          <dl class=\"layui-nav-child\">\r\n");
      out.write("\t            <dd><a style=\"cursor: pointer;\" onclick=\"changePage('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/configuration/modify_show.do');nodisplay();nodisplayweb();\">&nbsp;&nbsp;参数设置</a></dd>\r\n");
      out.write("\t            <dd><a style=\"cursor: pointer;\" onclick=\"changePage('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/configuration/email/modify_show.do');nodisplay();nodisplayweb();\">&nbsp;&nbsp;邮件设置</a></dd>\r\n");
      out.write("\t            <dd><a style=\"cursor: pointer;\" onclick=\"changePage('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/banlist/list.do');nodisplay();nodisplayweb();\">&nbsp;&nbsp;封停管理</a></dd>\r\n");
      out.write("\t            <dd><a style=\"cursor: pointer;\" onclick=\"changePage('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/system/dbpool/info.do');nodisplay();nodisplayweb();\">&nbsp;&nbsp;数据库连接</a></dd>\r\n");
      out.write("\t            <dd><a style=\"cursor: pointer;\" onclick=\"changePage('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/system/info.do');nodisplay();nodisplayweb();\">&nbsp;&nbsp;线程</a></dd>\r\n");
      out.write("\t            <dd><a style=\"cursor: pointer;\" onclick=\"changePage('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/configuration/log/info.do');nodisplay();nodisplayweb();\">&nbsp;&nbsp;日志设置</a></dd>\r\n");
      out.write("\t          </dl>\r\n");
      out.write("\t        </li>\r\n");
      out.write("\t        <!-- <li class=\"layui-nav-item\"><a href=\"\">云市场</a></li>\r\n");
      out.write("\t        <li class=\"layui-nav-item\"><a href=\"\">发布商品</a></li> -->\r\n");
      out.write("\t      </ul>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"layui-body\" style=\"top:60px;\">   \r\n");
      out.write("\t   \t<iframe src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/website/list.do\" name=\"page\" id=\"page\" frameborder=\"0\" style=\"height: 98%;width: 100%;\"></iframe>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/js/systemManager.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("layui.use('element', function(){\r\n");
      out.write("  var element = layui.element;\r\n");
      out.write("\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_h_005fhead_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:head
    com.hanweb.common.view.head.HeadTag _jspx_th_h_005fhead_005f0 = (com.hanweb.common.view.head.HeadTag) _005fjspx_005ftagPool_005fh_005fhead_0026_005ftree_005fmessage_005fmenu_005ficonfont_005fdialog_005fcookie_005fnobody.get(com.hanweb.common.view.head.HeadTag.class);
    _jspx_th_h_005fhead_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fhead_005f0.setParent(null);
    // /WEB-INF/pages/dczj/system/systemManager.jsp(10,0) name = cookie type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setCookie("true");
    // /WEB-INF/pages/dczj/system/systemManager.jsp(10,0) name = dialog type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setDialog("true");
    // /WEB-INF/pages/dczj/system/systemManager.jsp(10,0) name = message type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setMessage("true");
    // /WEB-INF/pages/dczj/system/systemManager.jsp(10,0) name = iconfont type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setIconfont("true");
    // /WEB-INF/pages/dczj/system/systemManager.jsp(10,0) name = menu type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setMenu("true");
    // /WEB-INF/pages/dczj/system/systemManager.jsp(10,0) name = tree type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setTree("true");
    int[] _jspx_push_body_count_h_005fhead_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_h_005fhead_005f0 = _jspx_th_h_005fhead_005f0.doStartTag();
      if (_jspx_th_h_005fhead_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_h_005fhead_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_h_005fhead_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_h_005fhead_005f0.doFinally();
      _005fjspx_005ftagPool_005fh_005fhead_0026_005ftree_005fmessage_005fmenu_005ficonfont_005fdialog_005fcookie_005fnobody.reuse(_jspx_th_h_005fhead_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_h_005fimport_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:import
    com.hanweb.common.view.head.ImportResourceTag _jspx_th_h_005fimport_005f0 = (com.hanweb.common.view.head.ImportResourceTag) _005fjspx_005ftagPool_005fh_005fimport_0026_005ftype_005fpath_005fnobody.get(com.hanweb.common.view.head.ImportResourceTag.class);
    _jspx_th_h_005fimport_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fimport_005f0.setParent(null);
    // /WEB-INF/pages/dczj/system/systemManager.jsp(11,0) name = type type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fimport_005f0.setType("js");
    // /WEB-INF/pages/dczj/system/systemManager.jsp(11,0) name = path type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fimport_005f0.setPath("/ui/script/ui.js");
    int[] _jspx_push_body_count_h_005fimport_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_h_005fimport_005f0 = _jspx_th_h_005fimport_005f0.doStartTag();
      if (_jspx_th_h_005fimport_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_h_005fimport_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_h_005fimport_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_h_005fimport_005f0.doFinally();
      _005fjspx_005ftagPool_005fh_005fimport_0026_005ftype_005fpath_005fnobody.reuse(_jspx_th_h_005fimport_005f0);
    }
    return false;
  }
}
