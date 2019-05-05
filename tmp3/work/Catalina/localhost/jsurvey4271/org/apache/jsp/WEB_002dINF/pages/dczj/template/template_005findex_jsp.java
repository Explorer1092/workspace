package org.apache.jsp.WEB_002dINF.pages.dczj.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class template_005findex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tag/hanweb-tags.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fhead_0026_005fcookie_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fh_005fhead_0026_005fcookie_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fh_005fhead_0026_005fcookie_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      if (_jspx_meth_h_005fhead_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/layui/css/layui.css\">\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/layui/layui.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/js/closetree.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("html,body {\r\n");
      out.write("\tmargin: 0px;\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("}\r\n");
      out.write("#rows1 {\r\n");
      out.write("\twidth: 300px;\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("\tmargin-left: 10px;\r\n");
      out.write("\tposition: fixed;\r\n");
      out.write("\tbackground-color: #ffffff;\r\n");
      out.write("\tborder-right: solid 1px #CCC;\r\n");
      out.write("\tvertical-align: middle;\r\n");
      out.write("}\r\n");
      out.write("#rows2 {\r\n");
      out.write("    padding-top:0px; \r\n");
      out.write("\tpadding-left: 312px;\r\n");
      out.write("\theight: 100%\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#rows3 {\r\n");
      out.write("   background-color: #ffffff;\r\n");
      out.write("   /**margin-left: 40px;\r\n");
      out.write("   margin-right: 40px;**/\r\n");
      out.write("   min-height: 100%;\r\n");
      out.write("}\r\n");
      out.write(".row1-title {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 40px;\r\n");
      out.write("\tline-height: 40px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tborder-bottom: solid 1px #CCC;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".row1-bottom {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 50px;\r\n");
      out.write("\tline-height: 50px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tmargin-top:10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".row-button {\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tborder: 1px solid #FFF;\r\n");
      out.write("\toutline: none;\r\n");
      out.write("\theight: 30px;\r\n");
      out.write("\twidth: 100px;\r\n");
      out.write("\tbackground-color: #FFF;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".row-button-application {\r\n");
      out.write("\tbackground-color: #1E9FFF;\r\n");
      out.write("\tcolor: #FFF;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".row-button-custom {\r\n");
      out.write("\tbackground-color: #1E9FFF;\r\n");
      out.write("\tcolor: #FFF;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".row1-conten {\r\n");
      out.write("\tborder-bottom: solid 1px #CCC;\r\n");
      out.write("\toverflow: auto;\r\n");
      out.write("\tbackground-color: #f0f0f0;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".styimg {\r\n");
      out.write("\tborder: 1px solid #CCC;\r\n");
      out.write("\twidth: 198px;\r\n");
      out.write("\theight: 120px;\r\n");
      out.write("\tmargin-left: 50px;\r\n");
      out.write("\tmargin-top: 20px;\r\n");
      out.write("\tmargin-bottom: 20px;\r\n");
      out.write("\tbackground-color: #FFF;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".styimg-img {\r\n");
      out.write("\twidth: auto;\r\n");
      out.write("\theight: auto;\r\n");
      out.write("\twidth: 198px;\r\n");
      out.write("\theight: 100px;\r\n");
      out.write("\tcursor：pointer;\r\n");
      out.write("}\r\n");
      out.write(".icon-btn{\r\n");
      out.write("  text-align: center;\r\n");
      out.write("}\r\n");
      out.write(".icon-img{\r\n");
      out.write("   width: 20px;\r\n");
      out.write("   margin-right: 5px;\r\n");
      out.write("   cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <input type=\"hidden\" id=\"type\" name=\"type\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("    <input type=\"hidden\" id=\"dczjid\" name=\"dczjid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dczjid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("    <input type=\"hidden\" id=\"commontemplateid\" name=\"commontemplateid\">\r\n");
      out.write("    <input type=\"hidden\" id=\"contextPath\" name=\"contextPath\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("    <div style=\"height: 100%;\">\r\n");
      out.write("\t<div id=\"rows1\">\r\n");
      out.write("\t\t<div class=\"row1-title\">\r\n");
      out.write("\t\t\t<span style=\"color: #666\">模板演示选择</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"div-content\" class=\"row1-conten\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t    <div class=\"styimg\" onclick=\"styleimgcheck('dczj1',this);\" onmouseover=\"displayimg(this)\" onmouseout=\"hiddenimg(this)\" title=\"此套模板默认模板\" >\r\n");
      out.write("\t\t\t\t    <input id=\"dczj1\" name=\"styleimgradio\" style=\"display: none\" type=\"radio\" value=\"dczj1\">\r\n");
      out.write("\t\t\t\t    <img class=\"styimg-img\" alt=\"\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/template/1.png\">\r\n");
      out.write("\t\t\t\t\t<div class=\"icon-btn\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t  <img alt=\"\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/template/u88.png\" class=\"icon-img\" onclick=\"editTemplate('dczj1');\">\r\n");
      out.write("\t\t\t\t\t  <img alt=\"\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/template/u86.png\" class=\"icon-img\" onclick=\"downloadtemplate('dczj1');\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"row1-bottom\">\r\n");
      out.write("\t\t\t<input id=\"button-application\" class=\"row-button row-button-application\" type=\"button\" value=\"应用\" onclick=\"applicationtemplate();\"/>\r\n");
      out.write("\t\t\t<input id=\"button-custom\" class=\"row-button row-button-custom\" type=\"button\" value=\"自定义\" onclick=\"custom();\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/js/template.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t layui.use('layer', function(){\r\n");
      out.write("\t\t  var layer = layui.layer;\r\n");
      out.write("\t\t});\r\n");
      out.write("\t $(function(){\r\n");
      out.write("\t\t $(\"#iframepage\").css('height',$(\"#rows3\").height()-5);\r\n");
      out.write("\t })\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<div id=\"rows2\"><div id=\"rows3\">\r\n");
      out.write("\t<iframe src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/tempalte/iframetemplate.do?commoncomplateid=dczj1&dczjid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dczjid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&type=0\" name=\"iframepage\" id=\"iframepage\" frameborder=\"0\" style=\"width: 100%;\"></iframe>\r\n");
      out.write("\t</div></div>\r\n");
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
    com.hanweb.common.view.head.HeadTag _jspx_th_h_005fhead_005f0 = (com.hanweb.common.view.head.HeadTag) _005fjspx_005ftagPool_005fh_005fhead_0026_005fcookie_005fnobody.get(com.hanweb.common.view.head.HeadTag.class);
    _jspx_th_h_005fhead_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fhead_005f0.setParent(null);
    // /WEB-INF/pages/dczj/template/template_index.jsp(10,0) name = cookie type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setCookie("true");
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
      _005fjspx_005ftagPool_005fh_005fhead_0026_005fcookie_005fnobody.reuse(_jspx_th_h_005fhead_005f0);
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
    // /WEB-INF/pages/dczj/template/template_index.jsp(149,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${commonTemplateStyleList != null }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_005fforEach_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/pages/dczj/template/template_index.jsp(150,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("en");
    // /WEB-INF/pages/dczj/template/template_index.jsp(150,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/dczj/template/template_index.jsp(150,4) '${commonTemplateStyleList }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${commonTemplateStyleList }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<li>\r\n");
          out.write("\t\t\t\t    <div class=\"styimg\" onclick=\"styleimgcheck('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${en.iid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("',this);\" onmouseover=\"displayimg(this)\" onmouseout=\"hiddenimg(this)\" title=\"此套模板为常用模板\">\r\n");
          out.write("\t\t\t\t    <input id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${en.iid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" name=\"styleimgradio\" style=\"display: none\" type=\"radio\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${en.iid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t    <img class=\"styimg-img\" alt=\"\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("/template/commontemplate_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${en.iid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("/image/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${en.styleimgname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t<div class=\"icon-btn\" style=\"display: none;\">\r\n");
          out.write("\t\t\t\t\t  <img alt=\"\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("/resources/dczj/images/template/u88.png\" class=\"icon-img\" onclick=\"editTemplate('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${en.iid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("');\">\r\n");
          out.write("\t\t\t\t\t  <img alt=\"\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("/resources/dczj/images/template/u86.png\" class=\"icon-img\" onclick=\"downloadtemplate('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${en.iid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("');\">\r\n");
          out.write("\t\t\t\t\t  <img alt=\"\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("/resources/dczj/images/template/u80.png\" class=\"icon-img\" onclick=\"deleteTemplate('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${en.iid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("');\">\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t</li>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
