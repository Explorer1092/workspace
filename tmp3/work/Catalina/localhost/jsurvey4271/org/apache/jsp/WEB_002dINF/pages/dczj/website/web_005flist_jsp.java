package org.apache.jsp.WEB_002dINF.pages.dczj.website;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class web_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tag/hanweb-tags.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fhead_0026_005fpagetype_005fgrid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fgrid_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fh_005fhead_0026_005fpagetype_005fgrid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005fgrid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fh_005fhead_0026_005fpagetype_005fgrid_005fnobody.release();
    _005fjspx_005ftagPool_005fh_005fgrid_005fnobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      if (_jspx_meth_h_005fhead_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(" #webadd {\r\n");
      out.write("   cursor: pointer;\r\n");
      out.write(" }\r\n");
      out.write(" #webdelete {\r\n");
      out.write("   margin-left: 5px;\r\n");
      out.write("   cursor: pointer;\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function() {\r\n");
      out.write("\tvar html = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${btn}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("\thtml = html.myReplace('&lt;', '<').myReplace('&gt;', '>').myReplace('&quot;', '\"');\r\n");
      out.write("\t$(\".datagrid-toolbar-btn-wrap\").html(html);\r\n");
      out.write("\t$(\"#webadd\").click(function(){\r\n");
      out.write("\t\topenDialog('../website/add_show.do?pid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("', 550, 480, {\r\n");
      out.write("\t\t\ttitle : '网站新增'\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t$(\"#webdelete\").click(function(){\r\n");
      out.write("\t\tvar ids = getCheckedIds();\r\n");
      out.write("\t\tif (ids == \"\") {\r\n");
      out.write("\t\t\talert(\"未选中任何记录\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tconfirm(\"您确定要删除这\" + ids.split(\",\").length + \"条记录吗\", function() {\r\n");
      out.write("\t\t\tajaxSubmit(\"remove.do?pid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&ids=\" + ids,\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\tsuccess : function(result) {\r\n");
      out.write("\t\t\t\t\t\t\tif (result.success) {\r\n");
      out.write("\t\t\t\t\t\t\t\t/* Tree.getInstance().removeNode(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tresult.params.remove); */\r\n");
      out.write("\t\t\t\t\t\t\t\tparent.location.reload();\r\n");
      out.write("\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\talert(result.message);\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\tfunction toolbarAction(action) {\r\n");
      out.write("\t\tswitch (action) {\r\n");
      out.write("\t\tcase 'remove':\r\n");
      out.write("\t\t\tvar ids = getCheckedIds();\r\n");
      out.write("\t\t\tif (ids == \"\") {\r\n");
      out.write("\t\t\t\talert(\"未选中任何记录\");\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tconfirm(\"您确定要删除这\" + ids.split(\",\").length + \"条记录吗\", function() {\r\n");
      out.write("\t\t\t\tajaxSubmit(\"remove.do?pid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&ids=\" + ids,\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\tsuccess : function(result) {\r\n");
      out.write("\t\t\t\t\t\t\t\tif (result.success) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tTree.getInstance().removeNode(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tresult.params.remove);\r\n");
      out.write("\t\t\t\t\t\t\t\t\tlocation.reload();\r\n");
      out.write("\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\talert(result.message);\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\tcase 'add':\r\n");
      out.write("\t\t\topenDialog('../website/add_show.do?pid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("', 550, 480, {\r\n");
      out.write("\t\t\t\ttitle : '网站新增'\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction edit(iid, name) {\r\n");
      out.write("\t\topenDialog('../website/modify_show.do?iid=' + iid, 550, 480, {\r\n");
      out.write("\t\t\ttitle : '网站编辑'\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tString.prototype.myReplace=function(f,e){//吧f替换成e\r\n");
      out.write("\t    var reg=new RegExp(f,\"g\"); //创建正则RegExp对象   \r\n");
      out.write("\t    return this.replace(reg,e); \r\n");
      out.write("\t};\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"page-title\">\r\n");
      out.write("\t\t系统管理 / <span id=\"page-location\">网站管理</span>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"page-content\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_h_005fgrid_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
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
    com.hanweb.common.view.head.HeadTag _jspx_th_h_005fhead_005f0 = (com.hanweb.common.view.head.HeadTag) _005fjspx_005ftagPool_005fh_005fhead_0026_005fpagetype_005fgrid_005fnobody.get(com.hanweb.common.view.head.HeadTag.class);
    _jspx_th_h_005fhead_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fhead_005f0.setParent(null);
    // /WEB-INF/pages/dczj/website/web_list.jsp(12,0) name = pagetype type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setPagetype("page");
    // /WEB-INF/pages/dczj/website/web_list.jsp(12,0) name = grid type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setGrid("true");
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
      _005fjspx_005ftagPool_005fh_005fhead_0026_005fpagetype_005fgrid_005fnobody.reuse(_jspx_th_h_005fhead_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_h_005fgrid_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:grid
    com.hanweb.common.view.grid.GridTag _jspx_th_h_005fgrid_005f0 = (com.hanweb.common.view.grid.GridTag) _005fjspx_005ftagPool_005fh_005fgrid_005fnobody.get(com.hanweb.common.view.grid.GridTag.class);
    _jspx_th_h_005fgrid_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fgrid_005f0.setParent(null);
    int[] _jspx_push_body_count_h_005fgrid_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_h_005fgrid_005f0 = _jspx_th_h_005fgrid_005f0.doStartTag();
      if (_jspx_th_h_005fgrid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_h_005fgrid_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_h_005fgrid_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_h_005fgrid_005f0.doFinally();
      _005fjspx_005ftagPool_005fh_005fgrid_005fnobody.reuse(_jspx_th_h_005fgrid_005f0);
    }
    return false;
  }
}
