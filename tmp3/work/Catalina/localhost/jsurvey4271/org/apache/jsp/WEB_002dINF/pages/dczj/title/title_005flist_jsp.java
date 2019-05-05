package org.apache.jsp.WEB_002dINF.pages.dczj.title;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class title_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tag/hanweb-tags.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fhead_0026_005fpagetype_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fh_005fhead_0026_005fpagetype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fh_005fhead_0026_005fpagetype_005fnobody.release();
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
      out.write("<title></title>\r\n");
      if (_jspx_meth_h_005fhead_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/layui/css/layui.css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".title-top {\r\n");
      out.write("\tpadding-top: 10px;\r\n");
      out.write("\tpadding-bottom: 10px;\r\n");
      out.write("\tpadding-left: 20px;\r\n");
      out.write("\tborder-bottom: 1px solid #CCC;\r\n");
      out.write("}\r\n");
      out.write(".title-btn {\r\n");
      out.write("\tpadding-top: 10px;\r\n");
      out.write("\tpadding-bottom: 10px;\r\n");
      out.write("\tpadding-left: 5px;\r\n");
      out.write("}\r\n");
      out.write(".title-table {\r\n");
      out.write("\tpadding-left: 5px;\r\n");
      out.write("}\r\n");
      out.write(".dczj-btn {\r\n");
      out.write("    width: 80px;\r\n");
      out.write("}\r\n");
      out.write(".sort-pic {\r\n");
      out.write("    margin-right: 8px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write(".delete-pic {\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write(".table-pic {\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write(".top-pic {\r\n");
      out.write("    margin-left: 8px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <input type=\"hidden\" id=\"dczj_type\" value=\"0\">\r\n");
      out.write("    <input type=\"hidden\" id=\"dczj_state\" value=\"3\">\r\n");
      out.write("    <input type=\"hidden\" id=\"webid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("    ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t<div class=\"title-btn\">\r\n");
      out.write("\t\t<table style=\"width: 100%\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"width: 35%\"><label class=\"layui-form-label\">问卷类型：</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-btn-group demoTest\" style=\"margin-top: 5px;\">\r\n");
      out.write("\t\t\t\t\t\t<button id=\"jsurvey0\" class=\"layui-btn layui-btn-sm dczj-btn\" data-type=\"set\" style=\"width: 80px;\" data-key=\"indicator_dczj\" data-value=\"0\">调查</button>\r\n");
      out.write("\t\t\t\t\t\t<button id=\"jsurvey1\" class=\"layui-btn layui-btn-sm dczj-btn\" data-type=\"set\" style=\"width: 80px;\" data-key=\"indicator_dczj\" data-value=\"1\">征集</button>\r\n");
      out.write("\t\t\t\t\t\t<button id=\"jsurvey2\" class=\"layui-btn layui-btn-sm dczj-btn\" data-type=\"set\" style=\"width: 80px;\" data-key=\"indicator_dczj\" data-value=\"2\">投票</button>\r\n");
      out.write("\t\t\t\t\t\t<button id=\"jsurvey3\" class=\"layui-btn layui-btn-sm dczj-btn\" data-type=\"set\" style=\"width: 80px;\" data-key=\"indicator_dczj\" data-value=\"3\">测评</button>\r\n");
      out.write("\t\t\t\t\t</div></td>\r\n");
      out.write("\t\t\t\t<td style=\"width: 30%\"><label class=\"layui-form-label\" style=\"width:40px;\">状态：</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-btn-group demoTest\" style=\"margin-top: 5px;\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"layui-btn layui-btn-sm dczj-btn\" style=\"background-color: #5FB878;width: 80px;\" data-key=\"indicator_state\" data-type=\"set\" data-value=\"3\">全部</button>\r\n");
      out.write("\t\t\t\t\t\t<button class=\"layui-btn layui-btn-sm dczj-btn\" data-type=\"set\" style=\"width: 80px;\" data-key=\"indicator_state\" data-value=\"0\">正在进行</button>\r\n");
      out.write("\t\t\t\t\t\t<button class=\"layui-btn layui-btn-sm dczj-btn\" data-type=\"set\" style=\"width: 80px;\" data-key=\"indicator_state\" data-value=\"1\">尚未开始</button>\r\n");
      out.write("\t\t\t\t\t\t<button class=\"layui-btn layui-btn-sm dczj-btn\" data-type=\"set\" style=\"width: 80px;\" data-key=\"indicator_state\" data-value=\"2\">已经结束</button>\r\n");
      out.write("\t\t\t\t\t</div></td>\r\n");
      out.write("\t\t\t\t<td style=\"width: 35%\">\r\n");
      out.write("\t\t\t\t\t<table style=\"width: 100%\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"width: 70px;\"><label class=\"layui-form-label\">问卷标题：</label></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"width: 60%\"><input type=\"text\" name=\"title\" id=\"title\" class=\"layui-input\" style=\"width: 95%;height: 32px;\" placeholder=\"请输入标题\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><button class=\"layui-btn layui-btn-sm layui-btn-normal\" style=\"width: 70px;\" onclick=\"searchtitle();\">检索</button></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"title-table\">\r\n");
      out.write("\t\t<table class=\"layui-hide\" id=\"dczjtable\" lay-filter=\"dczjtableReload\"></table>\r\n");
      out.write("\t</div>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/js/jquery.cookie.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/layui/layui.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/js/title.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/js/closetree.js\"></script>\r\n");
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
    com.hanweb.common.view.head.HeadTag _jspx_th_h_005fhead_005f0 = (com.hanweb.common.view.head.HeadTag) _005fjspx_005ftagPool_005fh_005fhead_0026_005fpagetype_005fnobody.get(com.hanweb.common.view.head.HeadTag.class);
    _jspx_th_h_005fhead_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fhead_005f0.setParent(null);
    // /WEB-INF/pages/dczj/title/title_list.jsp(10,0) name = pagetype type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setPagetype("page");
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
      _005fjspx_005ftagPool_005fh_005fhead_0026_005fpagetype_005fnobody.reuse(_jspx_th_h_005fhead_005f0);
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
    // /WEB-INF/pages/dczj/title/title_list.jsp(50,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webid != 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t<div class=\"title-top\">\r\n");
        out.write("\t\t<button class=\"layui-btn layui-btn-normal\" style=\"width: 150px;\"\r\n");
        out.write("\t\t\tonclick=\"oprTitleAdd()\">创建问卷</button>\r\n");
        out.write("\t</div>\r\n");
        out.write("\t");
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
