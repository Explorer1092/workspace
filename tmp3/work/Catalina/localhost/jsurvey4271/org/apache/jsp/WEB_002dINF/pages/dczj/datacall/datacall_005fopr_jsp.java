package org.apache.jsp.WEB_002dINF.pages.dczj.datacall;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class datacall_005fopr_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tag/hanweb-tags.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fhead_0026_005fvalidity_005ftoggle_005ftip_005ftabs_005fselect_005fpagetype_005fdialog_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005ftip_0026_005ftitle_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fh_005fhead_0026_005fvalidity_005ftoggle_005ftip_005ftabs_005fselect_005fpagetype_005fdialog_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005ftip_0026_005ftitle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fh_005fhead_0026_005fvalidity_005ftoggle_005ftip_005ftabs_005fselect_005fpagetype_005fdialog_005fnobody.release();
    _005fjspx_005ftagPool_005fh_005ftip_0026_005ftitle_005fnobody.release();
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
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\tvar iid = $('#iid').val();\r\n");
      out.write("\t\tif(iid != null && iid != undefined && iid != ''){\r\n");
      out.write("\t\t\tif('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${en.datacall_type}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("' == 0){\r\n");
      out.write("\t\t\t\t$('#type_1').attr('disabled','true');\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$('#type_0').attr('disabled','true');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#oprform\").validity(function() {\r\n");
      out.write("\t\t\t$(\"#name\").require(\"请输入模板名称\");\r\n");
      out.write("\t\t\t$(\"#webnames\").require(\"请选择所属站点\");\r\n");
      out.write("\t\t\t$(\"#number\").require(\"请输入数据行数\");\r\n");
      out.write("\t\t}, {\r\n");
      out.write("\t\t\tsuccess : function(result) {\r\n");
      out.write("\t\t\t\tif (result.success) {\r\n");
      out.write("\t\t\t\t\tcloseDialog(true);\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\talert(result.message);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tfunction selectWeb(){\r\n");
      out.write("\t\tvar webids = $(\"#jact_webids\").val();\r\n");
      out.write("\t\topenDialog('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/datacall/selectWeb.do?jact_webids='+webids, 400, 400,{\r\n");
      out.write("\t\t    title : '网站管理'\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" method=\"post\" id=\"oprform\">\r\n");
      out.write("\t    <input type=\"hidden\" id=\"jact_webids\" name=\"datacall_webids\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${en.datacall_webids}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t    <input type=\"hidden\" id=\"iid\" name=\"iid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${en.iid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t    <input type=\"hidden\" id=\"webid\" name=\"webid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${en.webid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t    <!-- <input type=\"hidden\" id=\"createdate\" name=\"createdate\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${en.createdate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"> -->\r\n");
      out.write("\t    <input type=\"hidden\" id=\"createname\" name=\"createname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${en.createname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t    <input type=\"hidden\" id=\"state\" name=\"state\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${en.state}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t    <input type=\"hidden\" id=\"updatehtml\" name=\"updatehtml\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${en.updatehtml}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t<div id=\"dialog-content\">\r\n");
      out.write("\t\t\t<table class=\"table\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"label\" align=\"right\">模板名称:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" class=\"input-text\" id=\"name\" name=\"datacall_name\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${en.datacall_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"label\" align=\"right\">所属站点:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" class=\"input-text\" id=\"webnames\"\r\n");
      out.write("\t\t\t\t\t\tname=\"datacall_webnames\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${en.datacall_webnames}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\treadonly=\"readonly\" onclick=\"selectWeb();\" style=\"cursor: pointer;\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"label\" align=\"right\">数据类别:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"checkbox\" name=\"datacall_types\" value=\"0\"\r\n");
      out.write("\t\t\t\t\t\tdata-value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${en.datacall_types}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">在线调查 <input type=\"checkbox\"\r\n");
      out.write("\t\t\t\t\t\tname=\"datacall_types\" value=\"1\" data-value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${en.datacall_types}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">意见征集\r\n");
      out.write("\t\t\t\t\t\t <input type=\"checkbox\"\r\n");
      out.write("\t\t\t\t\t\tname=\"datacall_types\" value=\"2\" data-value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${en.datacall_types}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">网上投票\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"label\" align=\"right\">展示方式:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"radio\" id=\"type_0\" name=\"datacall_type\" value=\"0\"\r\n");
      out.write("\t\t\t\t\t\tdata-value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${en.datacall_type}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">固定长度 <input type=\"radio\" id=\"type_1\"\r\n");
      out.write("\t\t\t\t\t\tname=\"datacall_type\" value=\"1\" data-value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${en.datacall_type}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">列表页\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"label\" align=\"right\">");
      if (_jspx_meth_h_005ftip_005f0(_jspx_page_context))
        return;
      out.write("数据行数:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" class=\"input-text\" id=\"number\" name=\"datacall_number\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${en.datacall_number}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"label\" align=\"right\">展现顺序:</td>\r\n");
      out.write("\t\t\t\t\t<td>页面按照&nbsp;&nbsp;<select name=\"datacall_sorttype\" style=\"width: 100px;\"\r\n");
      out.write("\t\t\t\t\t\tdata-value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${en.datacall_sorttype}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"><option value=\"0\">创建时间</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1\">开始时间</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"2\">结束时间</option>\r\n");
      out.write("\t\t\t\t\t</select>&nbsp;&nbsp; <select name=\"datacall_sort\" style=\"width: 70px;\"\r\n");
      out.write("\t\t\t\t\t\tdata-value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${en.datacall_sort}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"><option value=\"0\">逆序</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1\">顺序</option>\r\n");
      out.write("\t\t\t\t\t</select>&nbsp;&nbsp;排序</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"label\" align=\"right\">展现条件:</td>\r\n");
      out.write("\t\t\t\t\t<td><select name=\"filtercondition\"\r\n");
      out.write("\t\t\t\t\t\tdata-value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${en.filtercondition}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"><option value=\"0\">不限</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1\">只展现未开始的</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"2\">只展现进行中的</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"3\">只展现已结束的</option>\r\n");
      out.write("\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"dialog-toolbar\">\r\n");
      out.write("\t\t\t<div id=\"dialog-toolbar-panel\">\r\n");
      out.write("\t\t\t\t<input type=\"submit\" class=\"btn btn-primary\" value=\"保存\" /> <input\r\n");
      out.write("\t\t\t\t\ttype=\"button\" class=\"btn\" value=\"取消\" onclick=\"closeDialog();\" />\r\n");
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
    com.hanweb.common.view.head.HeadTag _jspx_th_h_005fhead_005f0 = (com.hanweb.common.view.head.HeadTag) _005fjspx_005ftagPool_005fh_005fhead_0026_005fvalidity_005ftoggle_005ftip_005ftabs_005fselect_005fpagetype_005fdialog_005fnobody.get(com.hanweb.common.view.head.HeadTag.class);
    _jspx_th_h_005fhead_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fhead_005f0.setParent(null);
    // /WEB-INF/pages/dczj/datacall/datacall_opr.jsp(9,0) name = pagetype type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setPagetype("dialog");
    // /WEB-INF/pages/dczj/datacall/datacall_opr.jsp(9,0) name = validity type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setValidity("true");
    // /WEB-INF/pages/dczj/datacall/datacall_opr.jsp(9,0) name = dialog type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setDialog("true");
    // /WEB-INF/pages/dczj/datacall/datacall_opr.jsp(9,0) name = toggle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setToggle("true");
    // /WEB-INF/pages/dczj/datacall/datacall_opr.jsp(9,0) name = tip type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setTip("true");
    // /WEB-INF/pages/dczj/datacall/datacall_opr.jsp(9,0) name = select type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setSelect("true");
    // /WEB-INF/pages/dczj/datacall/datacall_opr.jsp(9,0) name = tabs type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setTabs("true");
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
      _005fjspx_005ftagPool_005fh_005fhead_0026_005fvalidity_005ftoggle_005ftip_005ftabs_005fselect_005fpagetype_005fdialog_005fnobody.reuse(_jspx_th_h_005fhead_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_h_005ftip_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:tip
    com.hanweb.common.view.tip.TipTag _jspx_th_h_005ftip_005f0 = (com.hanweb.common.view.tip.TipTag) _005fjspx_005ftagPool_005fh_005ftip_0026_005ftitle_005fnobody.get(com.hanweb.common.view.tip.TipTag.class);
    _jspx_th_h_005ftip_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005ftip_005f0.setParent(null);
    // /WEB-INF/pages/dczj/datacall/datacall_opr.jsp(88,37) name = title type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005ftip_005f0.setTitle("若选择列表页则为分页条数");
    int[] _jspx_push_body_count_h_005ftip_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_h_005ftip_005f0 = _jspx_th_h_005ftip_005f0.doStartTag();
      if (_jspx_th_h_005ftip_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_h_005ftip_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_h_005ftip_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_h_005ftip_005f0.doFinally();
      _005fjspx_005ftagPool_005fh_005ftip_0026_005ftitle_005fnobody.reuse(_jspx_th_h_005ftip_005f0);
    }
    return false;
  }
}
