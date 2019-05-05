package org.apache.jsp.WEB_002dINF.pages.dczj.mainpage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tag/hanweb-tags.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fhead_0026_005ftree_005ftoggle_005fmessage_005fmenu_005ficonfont_005fdialog_005fcookie_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fimport_0026_005ftype_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fh_005fhead_0026_005ftree_005ftoggle_005fmessage_005fmenu_005ficonfont_005fdialog_005fcookie_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005fimport_0026_005ftype_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fh_005fhead_0026_005ftree_005ftoggle_005fmessage_005fmenu_005ficonfont_005fdialog_005fcookie_005fnobody.release();
    _005fjspx_005ftagPool_005fh_005fimport_0026_005ftype_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("   \r\n");
      out.write("\tfunction onClickRange(event, treeId, treeNode) {\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype : \"post\",\r\n");
      out.write("\t\t\turl : \"../manager/dczj/setwebidsession.do\",\r\n");
      out.write("\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\"webid\" : treeNode.id\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tcache : false,\r\n");
      out.write("\t\t\tsuccess : function(result) {\r\n");
      out.write("\t\t\t\tif (result.success) {\r\n");
      out.write("\t\t\t\t\t$('#webid').val(treeNode.id);\r\n");
      out.write("\t\t\t\t\t$('#webtree').val(treeNode.name);\r\n");
      out.write("\t\t\t\t\t$('#webtree_menu').fadeOut(50);\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\talert(\"请联系管理员\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction setting(treeName, onClickFunction, onDblClickFunction, rootNode) {\r\n");
      out.write("\t\tvar setting = {\r\n");
      out.write("\t\t\tasync : {\r\n");
      out.write("\t\t\t\tenable : true,\r\n");
      out.write("\t\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/dczjmenu/menuwithurlforuser_search.do',\r\n");
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
      out.write("});\r\n");
      out.write("function sysManager(){\r\n");
      out.write("\twindow.location.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/system/list.do\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function closeTree(){\r\n");
      out.write("\t$('#webtree_menu').fadeOut(50);\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t.layui-bg-main{background-color:#172951!important}\r\n");
      out.write("\t.layui-input{height: 30px;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"layui-layout-body\" >\r\n");
      out.write("    <input type=\"hidden\" id=\"webid\" name=\"webid\">\r\n");
      out.write("    <input type=\"hidden\" id=\"webname\" name=\"webname\">\r\n");
      out.write("\t<div class=\"layui-layout layui-layout-admin\">\r\n");
      out.write("\t  <div class=\"layui-header layui-bg-main\">\r\n");
      out.write("\t    <div class=\"layui-logo layui-bg-main\" style=\"width:200px;\">\r\n");
      out.write("\t    \t<span id=\"logo\" style=\"font-size:18px;\"><font color=\"#5CB85C\"><b>JSURVEY</b></font></span>\r\n");
      out.write("\t    \t<span style=\"font-size:16px;\"><font color=\"#eeeeee\"><b>调查征集系统 </b></font></span>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t    <!-- 头部区域（可配合layui已有的水平导航） -->\r\n");
      out.write("\t    <ul class=\"layui-nav layui-layout-left layui-bg-main\">\r\n");
      out.write("\t    \t<li class=\"layui-nav-item\"><a href=\"../manager/index.do\">我的调查</a></li>\r\n");
      out.write("\t    </ul>\r\n");
      out.write("\t    <ul class=\"layui-nav layui-layout-right layui-bg-main\">\r\n");
      out.write("\t      <li class=\"layui-inline\" style=\"padding-right: 20px;\">\r\n");
      out.write("\t      \t<input type=\"text\" id=\"webtree\" class=\"layui-input\" style=\"width: 200px;\" readonly = \"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t      </li>\r\n");
      out.write("\t      ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t     \r\n");
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
      out.write("\t<div class=\"layui-body\" style=\"top:60px;left:0px;\">   \r\n");
      out.write("\t   \t<iframe src=\"\" name=\"page\" id=\"page\" frameborder=\"0\" style=\"height: 99%;width: 100%;\"></iframe>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/js/homepage.js\"></script>\r\n");
      out.write("</body>\r\n");
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
    com.hanweb.common.view.head.HeadTag _jspx_th_h_005fhead_005f0 = (com.hanweb.common.view.head.HeadTag) _005fjspx_005ftagPool_005fh_005fhead_0026_005ftree_005ftoggle_005fmessage_005fmenu_005ficonfont_005fdialog_005fcookie_005fnobody.get(com.hanweb.common.view.head.HeadTag.class);
    _jspx_th_h_005fhead_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fhead_005f0.setParent(null);
    // /WEB-INF/pages/dczj/mainpage/homepage.jsp(10,0) name = cookie type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setCookie("true");
    // /WEB-INF/pages/dczj/mainpage/homepage.jsp(10,0) name = dialog type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setDialog("true");
    // /WEB-INF/pages/dczj/mainpage/homepage.jsp(10,0) name = message type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setMessage("true");
    // /WEB-INF/pages/dczj/mainpage/homepage.jsp(10,0) name = iconfont type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setIconfont("true");
    // /WEB-INF/pages/dczj/mainpage/homepage.jsp(10,0) name = menu type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setMenu("true");
    // /WEB-INF/pages/dczj/mainpage/homepage.jsp(10,0) name = tree type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setTree("true");
    // /WEB-INF/pages/dczj/mainpage/homepage.jsp(10,0) name = toggle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setToggle("true");
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
      _005fjspx_005ftagPool_005fh_005fhead_0026_005ftree_005ftoggle_005fmessage_005fmenu_005ficonfont_005fdialog_005fcookie_005fnobody.reuse(_jspx_th_h_005fhead_005f0);
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
    // /WEB-INF/pages/dczj/mainpage/homepage.jsp(11,0) name = type type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fimport_005f0.setType("js");
    // /WEB-INF/pages/dczj/mainpage/homepage.jsp(11,0) name = path type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/pages/dczj/mainpage/homepage.jsp(106,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${isSysManager==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t      \t <li class=\"layui-inline\" onclick=\"sysManager();\" style=\"width: 60px;cursor: pointer;\"><img alt=\"系统设置\" width=\"30px;\" src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/resources/dczj/images/u10.png\"></li>\r\n");
        out.write("\t      ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}
