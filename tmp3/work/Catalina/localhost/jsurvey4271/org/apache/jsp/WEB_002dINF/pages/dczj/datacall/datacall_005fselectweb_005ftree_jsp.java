package org.apache.jsp.WEB_002dINF.pages.dczj.datacall;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class datacall_005fselectweb_005ftree_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tag/hanweb-tags.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fhead_0026_005fvalidity_005ftree_005fpagetype_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fh_005fhead_0026_005fvalidity_005ftree_005fpagetype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fh_005fhead_0026_005fvalidity_005ftree_005fpagetype_005fnobody.release();
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      if (_jspx_meth_h_005fhead_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\tvar jact_webids = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jact_webids}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("\t\tvar zNodes = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tree}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("\t\tvar setting = {\r\n");
      out.write("\t\t\tview : {\r\n");
      out.write("\t\t\t\tshowLine : true,\r\n");
      out.write("\t\t\t\tselectedMulti : false\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tcheck : {\r\n");
      out.write("\t\t\t\tenable : true\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tdata : {\r\n");
      out.write("\t\t\t\tsimpleData : {\r\n");
      out.write("\t\t\t\t\tenable : true,\r\n");
      out.write("\t\t\t\t\tidKey : \"id\",\r\n");
      out.write("\t\t\t\t\tpIdKey : \"pId\"\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tasync : {\r\n");
      out.write("\t\t\t\tenable : true,\r\n");
      out.write("\t\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/datacall/menuforgroupsearch.do?jact_webids='+jact_webids,\r\n");
      out.write("\t\t\t\tautoParam : [ \"id=webId\", \"isDisabled\"]\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t$(\"#tree\").tree(setting, zNodes);\r\n");
      out.write("\t\tvar treeObj = $.fn.zTree.getZTreeObj(\"tree\");\r\n");
      out.write("\t\ttreeObj.setting.check.chkboxType = {'Y' : '','N' : ''};\r\n");
      out.write("// \t\ttreeObj.expandAll(true);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#oprform\").validity(function(){\r\n");
      out.write("\t\t\t$('#menuIds').assert(function(){\r\n");
      out.write("\t\t\t\tvar treeObj = $.fn.zTree.getZTreeObj(\"tree\");\r\n");
      out.write("\t\t\t\tvar nodes = treeObj.getCheckedNodes(true);\r\n");
      out.write("\t\t\t\tvar menuIds = \"\";\r\n");
      out.write("\t\t\t\tvar menuNames = \"\";\r\n");
      out.write("\t\t\t\t$(nodes).each(function(){\r\n");
      out.write("\t\t\t\t\tmenuIds += $(this).prop(\"id\") + \",\";\r\n");
      out.write("\t\t\t\t\tmenuNames += $(this).prop(\"name\") + \",\";\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\tif(menuIds.length > 0){\r\n");
      out.write("\t\t\t\t\tmenuIds = menuIds.substring(0, menuIds.length - 1);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(menuNames.length > 0){\r\n");
      out.write("\t\t\t\t\tmenuNames = menuNames.substring(0, menuNames.length - 1);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t$('#menuIds').val(menuIds);\r\n");
      out.write("\t\t\t\tgetParentWindow().document.getElementById('jact_webids').value = menuIds;\r\n");
      out.write("\t\t\t\tgetParentWindow().document.getElementById('webnames').value = menuNames;\r\n");
      out.write("\t\t\t\treturn true;\r\n");
      out.write("\t\t\t}, '请选择网站');\r\n");
      out.write("\t\t},{\r\n");
      out.write("\t\t\tsuccess:function(result){\r\n");
      out.write("\t\t\t\tif(result.success){\r\n");
      out.write("\t\t\t\t\tcloseDialog();\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\talert(result.message);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" method=\"post\" id=\"oprform\">\r\n");
      out.write("\t\t<input type=\"hidden\" id=\"menuIds\" name=\"menuIds\" value=\"\" />\r\n");
      out.write("\t\t<div style=\"padding-top: 0px; overflow-y: auto; height: 300px;\">\r\n");
      out.write("\t\t\t<ul id=\"tree\" class=\"ztree\"></ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"dialog-toolbar\" style=\"border-top: 1px solid #CCC;\">\r\n");
      out.write("\t\t\t<div id=\"dialog-toolbar-panel\">\r\n");
      out.write("\t\t\t\t<input type=\"submit\" class=\"btn btn-primary\" value=\"保存\" /> \r\n");
      out.write("\t\t\t\t<input type=\"button\" class=\"btn\" value=\"取消\" onclick=\"closeDialog();\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
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
    com.hanweb.common.view.head.HeadTag _jspx_th_h_005fhead_005f0 = (com.hanweb.common.view.head.HeadTag) _005fjspx_005ftagPool_005fh_005fhead_0026_005fvalidity_005ftree_005fpagetype_005fnobody.get(com.hanweb.common.view.head.HeadTag.class);
    _jspx_th_h_005fhead_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fhead_005f0.setParent(null);
    // /WEB-INF/pages/dczj/datacall/datacall_selectweb_tree.jsp(10,0) name = pagetype type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setPagetype("dialog");
    // /WEB-INF/pages/dczj/datacall/datacall_selectweb_tree.jsp(10,0) name = validity type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setValidity("true");
    // /WEB-INF/pages/dczj/datacall/datacall_selectweb_tree.jsp(10,0) name = tree type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
      _005fjspx_005ftagPool_005fh_005fhead_0026_005fvalidity_005ftree_005fpagetype_005fnobody.reuse(_jspx_th_h_005fhead_005f0);
    }
    return false;
  }
}
