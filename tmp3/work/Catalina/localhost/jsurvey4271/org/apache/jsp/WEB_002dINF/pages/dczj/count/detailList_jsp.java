package org.apache.jsp.WEB_002dINF.pages.dczj.count;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detailList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tag/hanweb-tags.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fhead_0026_005fselect_005fpagetype_005fcalendar_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fimport_0026_005ftype_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fh_005fhead_0026_005fselect_005fpagetype_005fcalendar_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005fimport_0026_005ftype_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fh_005fhead_0026_005fselect_005fpagetype_005fcalendar_005fnobody.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      if (_jspx_meth_h_005fhead_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("<title>调查征集系统</title>\r\n");
      if (_jspx_meth_h_005fimport_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/layui/css/layui.css\">\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/layui/layui.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\thtml{\r\n");
      out.write("\t\theight: 99%;\r\n");
      out.write("\t\twidth: 99%;\r\n");
      out.write("\t} \r\n");
      out.write("\tbody {\r\n");
      out.write("\t\theight: 100%;\r\n");
      out.write("\t\twidth: 100%;\r\n");
      out.write("\t}\r\n");
      out.write("\t.layui-table-body {\r\n");
      out.write("\t\toverflow-x: hidden;\r\n");
      out.write("\t}\r\n");
      out.write("\t.layui-form-radio {\r\n");
      out.write("    line-height: 28px;\r\n");
      out.write("    margin: 0px 0px 0 0; \r\n");
      out.write("    padding-right: 10px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    font-size: 0;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- <form class=\"layui-form\" action=\"\"> -->\r\n");
      out.write("<div style=\"background-color: #f0f0f0;height: 40px;width: 100%;\">\r\n");
      out.write("\t<div style=\"font-weight: bold;padding-top: 10px;padding-left: 15px;\">参与明细</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"height: 40px;width: 100%;padding-top: 10px;\">\r\n");
      out.write("\t<span style=\"padding-left: 15px;\">选择时间：</span>\r\n");
      out.write("\t<input type=\"hidden\" id=\"dczjid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dczjid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t<input type=\"hidden\" id=\"createdate\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${createdate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t<input type=\"hidden\" id=\"earnscore\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${earnscore}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t<input type=\"text\" id=\"starttime\" name=\"starttime\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${starttime}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"jcalendar input-text\" style=\"width:150px;\" \r\n");
      out.write("\t\t\tonFocus=\"WdatePicker({dateFmt:'yyyy-MM-dd',maxDate:'#F{$dp.$D(\\'endtime\\')}'})\" readonly=\"readonly\">\r\n");
      out.write("\t<span>-</span>\r\n");
      out.write("\t<input type=\"text\" id=\"endtime\" name=\"endtime\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endtime}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"jcalendar input-text\" style=\"width:150px;\" \r\n");
      out.write("\t\t\tonFocus=\"WdatePicker({dateFmt:'yyyy-MM-dd',minDate:'#F{$dp.$D(\\'starttime\\')}'})\" readonly=\"readonly\">\r\n");
      out.write("\t<button class=\"layui-btn layui-btn-normal layui-btn-sm\" onclick=\"reload();\" style=\"margin-left: 15px;\">检索</button>\r\n");
      out.write("\t<button class=\"layui-btn layui-btn-danger layui-btn-sm\" onclick=\"javascript:window.location.reload()\" style=\"margin-right: 15px;float: right;\">刷新</button>\r\n");
      out.write("\t<button class=\"layui-btn layui-btn-danger layui-btn-sm\" onclick=\"removeAll()\" style=\"margin-left: 15px;float: right;\">清空数据</button>\r\n");
      out.write("\t<button class=\"layui-btn layui-btn-warm layui-btn-sm\" onclick=\"toolbarAction('export')\" style=\"margin-left: 15px;float: right;\">导出EXCEL</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("<div class=\"layui-form layui-form-item\">\r\n");
      out.write("<table id=\"detail\" lay-filter=\"test\" border=\"0\">\r\n");
      out.write("\r\n");
      out.write("<tr height=\"30px;\"><td colspan=\"4\"  height=\"30px;\"><span style=\"padding-left: 15px;\">选择排序：</span>\r\n");
      out.write("    <input type=\"radio\" id=\"escore\" name=\"escore\" value=\"0\" title=\"创建时间\"  checked>\r\n");
      out.write("\t<input type=\"radio\" id=\"escore\"  name=\"escore\" value=\"1\" title=\"得分\" >\r\n");
      out.write("\t<button class=\"layui-btn layui-btn-normal layui-btn-sm\" onclick=\"btssort();\" style=\"margin-left: 184px;\">正序</button>\r\n");
      out.write("\t<button class=\"layui-btn layui-btn-normal layui-btn-sm\" onclick=\"stbsort();\" style=\"margin-left: 15px;\">逆序</button></td></tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!-- </form> --> \r\n");
      out.write("</body>\r\n");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction reload(check,sorttype){\r\n");
      out.write("\t\tvar table = layui.table;\r\n");
      out.write("\t\tvar starttime = $(\"#starttime\").val();\r\n");
      out.write("\t\tvar endtime = $(\"#endtime\").val();\r\n");
      out.write("\t\ttable.reload('detail', {\r\n");
      out.write("\t\t\t  url: 'list.do' //数据接口\r\n");
      out.write("\t\t\t  ,where: {starttime:starttime,endtime:endtime,check:check,sorttype:sorttype}\r\n");
      out.write("\t\t \t  ,page: {\r\n");
      out.write("\t          curr: 1 //重新从第 1 页开始\r\n");
      out.write("\t        },\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t};\r\n");
      out.write("\r\n");
      out.write("\tfunction toolbarAction(action){\r\n");
      out.write("\t\tswitch (action){\r\n");
      out.write("\t\tcase 'export':\r\n");
      out.write("\t\t\tvar starttime = $(\"#starttime\").val();\r\n");
      out.write("\t\t\tvar endtime = $(\"#endtime\").val();\r\n");
      out.write("\t\t\tiframeSubmit(\"exportdetailnew.do?dczjid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dczjid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&starttime=\"+starttime+\"&endtime=\"+endtime+\"&type=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"); \r\n");
      out.write("\t\t\tbreak;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("\tfunction search(){\r\n");
      out.write("\t\t\tvar x = document.getElementById(\"select1\").value;\r\n");
      out.write("\t\t\t\t  document.form1.select2.options[0].value=\"1\";\r\n");
      out.write("\t\t\t\t  document.form1.select2.length=1;  \r\n");
      out.write("\t\t\tif(x==\"2\"){\r\n");
      out.write("\t\t\t\t  document.form1.select2.options[0].text=\"提交时间\";\r\n");
      out.write("\t\t\t}else if(x==\"1\"){\r\n");
      out.write("\t\t\t\tdocument.form1.select2.options[0].text=\"得分\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t/* function remove(id){\r\n");
      out.write("\t\tvar flag = confirm(\"您确认要删除本条数据吗\",function(){\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype : \"post\",\r\n");
      out.write("\t\t\t\turl : \"remove.do\",\r\n");
      out.write("\t\t\t\tdataType : \"json\",\r\n");
      out.write("\t\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\t\"id\" : id\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tsuccess : function(result){\r\n");
      out.write("\t\t\t\t\tif(result.isSuccess == 1){\r\n");
      out.write("\t\t\t\t\t\treload();\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\talert(\"删除失败，请联系系统管理员\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}; */\r\n");
      out.write("\tfunction removeAll(){\r\n");
      out.write("\t\tvar dczjid = $('#dczjid').val();\r\n");
      out.write("\t\tconfirm(\"这项操作会清空明细数据，您确认执行吗\",function(){\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype : \"post\",\r\n");
      out.write("\t\t\t\turl : \"removeall.do\",\r\n");
      out.write("\t\t\t\tdataType : \"json\",\r\n");
      out.write("\t\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\t\"dczjid\" : dczjid\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tsuccess : function(result){\r\n");
      out.write("\t\t\t\t\tif(result.success){\r\n");
      out.write("\t\t\t\t\t\talert(\"删除成功\");\r\n");
      out.write("\t\t\t\t\t\treload();\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\talert(result.message);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t};\r\n");
      out.write("\tfunction btssort(){\r\n");
      out.write("\t\tvar dczjid = $('#dczjid').val();\r\n");
      out.write("\t\tvar sorttype=0;\r\n");
      out.write("\t\tvar check;\r\n");
      out.write("\t\tvar checked=$(\"input[name='escore']:checked\").val();\r\n");
      out.write("\t\tif(checked==0){\r\n");
      out.write("\t\t  check=1;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(checked==1){\r\n");
      out.write("\t\t  check=2;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tconfirm(\"您确认执行吗\",function(){\r\n");
      out.write("\t\t\treload(check,sorttype);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t};\r\n");
      out.write("\tfunction stbsort(){\r\n");
      out.write("\t\tvar dczjid = $('#dczjid').val();\r\n");
      out.write("\t\tvar sorttype=1;\r\n");
      out.write("\t\tvar check;\r\n");
      out.write("\t\tvar checked=$(\"input[name='escore']:checked\").val();\r\n");
      out.write("\t\tif(checked==0){\r\n");
      out.write("\t\t  check=1;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(checked==1){\r\n");
      out.write("\t\t  check=2;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tconfirm(\"您确认执行吗\",function(){\r\n");
      out.write("\t\t\treload(check,sorttype);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\r\n");
      out.write("\t};\r\n");
      out.write("\tfunction showdetail(id){\r\n");
      out.write("\t\tparent.changePage('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/count/showdetail.do?id='+id);\r\n");
      out.write("\t};\r\n");
      out.write("</script>\r\n");
      out.write("</html>\r\n");
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
    com.hanweb.common.view.head.HeadTag _jspx_th_h_005fhead_005f0 = (com.hanweb.common.view.head.HeadTag) _005fjspx_005ftagPool_005fh_005fhead_0026_005fselect_005fpagetype_005fcalendar_005fnobody.get(com.hanweb.common.view.head.HeadTag.class);
    _jspx_th_h_005fhead_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fhead_005f0.setParent(null);
    // /WEB-INF/pages/dczj/count/detailList.jsp(9,0) name = pagetype type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setPagetype("page");
    // /WEB-INF/pages/dczj/count/detailList.jsp(9,0) name = calendar type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setCalendar("true");
    // /WEB-INF/pages/dczj/count/detailList.jsp(9,0) name = select type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setSelect("true");
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
      _005fjspx_005ftagPool_005fh_005fhead_0026_005fselect_005fpagetype_005fcalendar_005fnobody.reuse(_jspx_th_h_005fhead_005f0);
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
    // /WEB-INF/pages/dczj/count/detailList.jsp(12,0) name = type type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fimport_005f0.setType("js");
    // /WEB-INF/pages/dczj/count/detailList.jsp(12,0) name = path type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/pages/dczj/count/detailList.jsp(67,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type==3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("<td style=\"width: 120px;\"><span style=\"padding-left: 15px;\">总分：");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sumscore}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</span></td>\r\n");
        out.write("<td style=\"width: 120px;\"><span style=\"padding-left: 15px;\">最高分：");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${maxscore}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</span></td>\r\n");
        out.write("<td style=\"width: 120px;\"><span style=\"padding-left: 15px;\">最低分：");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${minscore}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</span></td>\r\n");
        out.write("<td style=\"width: 120px;\"><span style=\"padding-left: 15px;\">平均分：");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${avgscore}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</span></td>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /WEB-INF/pages/dczj/count/detailList.jsp(79,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type==3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("<script type=\"text/javascript\">\r\n");
        out.write("layui.use('table', function(){\r\n");
        out.write("\t  var table = layui.table;\r\n");
        out.write("\t  //第一个实例\r\n");
        out.write("\t  table.render({\r\n");
        out.write("\t    elem: '#detail'\r\n");
        out.write("\t    //,height: 312\r\n");
        out.write("\t    ,url: 'list.do' //数据接口\r\n");
        out.write("\t    ,page: true //开启分页\r\n");
        out.write("\t    ,where: {randcode:Math.random()*10000,dczjid:");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dczjid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("}\r\n");
        out.write("\t    ,cols: [[ //表头\r\n");
        out.write("\t      {field: 'iid', title: 'ID', width:'5%', align: 'center'}\r\n");
        out.write("\t      ,{field: 'unid', title: 'COOKIED', width:'30%', align: 'center'}\r\n");
        out.write("\t      ,{field: 'ip', title: '参与人IP', width:'20%', align: 'center'} \r\n");
        out.write("\t      ,{field: 'type', title: '提交来源', width: '13%', align: 'center'}\r\n");
        out.write("\t      ,{field: 'createdate', title: '提交时间', width: '20%',   align: 'center'}\r\n");
        out.write("\t      ,{field: 'earnscore', title: '得分', width: '13%',   align: 'center'}\r\n");
        out.write("\t      //,{field: 'delete', title: '删除', width: '10%', align: 'center'}\r\n");
        out.write("\t    ]]\r\n");
        out.write("\t  });\r\n");
        out.write("\t  \r\n");
        out.write("\t});\r\n");
        out.write("</script>\r\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(null);
    // /WEB-INF/pages/dczj/count/detailList.jsp(104,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type==0||type==1||type==2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("<script type=\"text/javascript\">\r\n");
        out.write("layui.use('table', function(){\r\n");
        out.write("\t  var table = layui.table;\r\n");
        out.write("\t  //第一个实例\r\n");
        out.write("\t  table.render({\r\n");
        out.write("\t    elem: '#detail'\r\n");
        out.write("\t    //,height: 312\r\n");
        out.write("\t    ,url: 'list.do' //数据接口\r\n");
        out.write("\t    ,page: true //开启分页\r\n");
        out.write("\t    ,where: {randcode:Math.random()*10000,dczjid:");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dczjid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("}\r\n");
        out.write("\t    ,cols:[[ //表头\r\n");
        out.write("\t      {field: 'iid', title: 'ID', width:'8%',  align: 'center'}\r\n");
        out.write("\t      ,{field: 'unid', title: 'COOKIED', width:'30%', align: 'center'}\r\n");
        out.write("\t      ,{field: 'ip', title: '参与人IP', width:'23%', align: 'center'} \r\n");
        out.write("\t      ,{field: 'type', title: '提交来源', width: '20%', align: 'center'}\r\n");
        out.write("\t      ,{field: 'createdate', title: '提交时间', width: '20%', align: 'center'}\r\n");
        out.write("\t      //,{field: 'delete', title: '删除', width: '10%', align: 'center'}\r\n");
        out.write("\t    ]]\r\n");
        out.write("\t  });\r\n");
        out.write("\t  \r\n");
        out.write("\t});\r\n");
        out.write("</script>\r\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }
}
