package org.apache.jsp.WEB_002dINF.pages.dczj.system;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class grouplist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tag/hanweb-tags.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fhead_0026_005ftree_005fpagetype_005ficonfont_005fgrid_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fh_005fhead_0026_005ftree_005fpagetype_005ficonfont_005fgrid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fh_005fhead_0026_005ftree_005fpagetype_005ficonfont_005fgrid_005fnobody.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<title>机构列表</title>\r\n");
      if (_jspx_meth_h_005fhead_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t#menu-wrap {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tz-index: 10;\r\n");
      out.write("\tborder-right: 3px solid #EFEFEF;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tbody {\r\n");
      out.write("\t\tmargin: 0;\r\n");
      out.write("\t\tpadding: 0;\r\n");
      out.write("\t\t/*background-color: #F6F6F6;*/\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#searchbtn {\r\n");
      out.write("\t\tcursor: pointer;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#page-wrap {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tz-index: 10;\r\n");
      out.write("\tright: 0;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$('#page-wrap').width($(top.window).width() - 460);\r\n");
      out.write("\t\tvar zNodes = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tree}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("\t\tvar setting = {\r\n");
      out.write("\t\t\tasync : {\r\n");
      out.write("\t\t\t\tenable : true,\r\n");
      out.write("\t\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/system/menuwithurlforgroup_search.do',\r\n");
      out.write("\t\t\t\tautoParam : [ \"id=groupId\", \"isDisabled\" ]\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tcallback:{\r\n");
      out.write("\t\t\t\tonClick:function(event,treeId,treeNode){\r\n");
      out.write("\t\t\t\t\tvar url = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/group/list.do?groupId=\"+treeNode.id;\r\n");
      out.write("\t\t\t\t\t$(\"#grouplist\").attr(\"src\",url);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t$('#tree').tree(setting, zNodes);\r\n");
      out.write("\r\n");
      out.write("\t\t$('#searchbtn').click(searchGroup);\r\n");
      out.write("\t\t$('#searchtext').keyup(function(event) {\r\n");
      out.write("\t\t\tif (event.keyCode == 13) {\r\n");
      out.write("\t\t\t\tsearchGroup();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction searchGroup() {\r\n");
      out.write("\t\t\tvar searchText = $('#searchtext').val();\r\n");
      out.write("\t\t\tif ($.trim(searchText) == '') {\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t//top.page.location.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/group/list.do?groupId=-1&searchText=\"+searchText;\r\n");
      out.write("\t\t\tvar texturl = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/group/list.do?groupId=-1&searchText=\"+searchText;\r\n");
      out.write("\t\t\t$(\"#grouplist\").attr(\"src\",texturl);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"height: 100%;width: 100%\">\r\n");
      out.write("\t<div id=\"menu-wrap\" style=\"height: 100%;\">\r\n");
      out.write("\t\t<div style=\"height:30px;background-color:#EFEFEF;padding:10px;border-bottom:1px solid #CCC;\">\r\n");
      out.write("\t\t\t<span class=\"input-append\">\r\n");
      out.write("\t\t\t\t<input id=\"searchtext\" type=\"text\" class=\"input-text\" style=\"width:180px;\" placeholder=\"请输入机构名称或标识\"/><i id=\"searchbtn\" class=\"iconfont add-on\">&#xf5007;</i>\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"treewrap\" style=\"position:absolute;top:51px;bottom:0;left:0;right:0;overflow:auto;\">\r\n");
      out.write("\t\t\t<ul id=\"tree\" class=\"ztree\"></ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"page-wrap\" style=\"height: 100%;width: 80%;\">\r\n");
      out.write("\t\t<iframe src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/group/list.do\" name=\"grouplist\" id=\"grouplist\" frameborder=\"0\" allowTranspancy=\"true\" height=\"100%;\" width=\"100%\"></iframe>\r\n");
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
    com.hanweb.common.view.head.HeadTag _jspx_th_h_005fhead_005f0 = (com.hanweb.common.view.head.HeadTag) _005fjspx_005ftagPool_005fh_005fhead_0026_005ftree_005fpagetype_005ficonfont_005fgrid_005fnobody.get(com.hanweb.common.view.head.HeadTag.class);
    _jspx_th_h_005fhead_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fhead_005f0.setParent(null);
    // /WEB-INF/pages/dczj/system/grouplist.jsp(13,0) name = pagetype type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setPagetype("page");
    // /WEB-INF/pages/dczj/system/grouplist.jsp(13,0) name = grid type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setGrid("true");
    // /WEB-INF/pages/dczj/system/grouplist.jsp(13,0) name = tree type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setTree("true");
    // /WEB-INF/pages/dczj/system/grouplist.jsp(13,0) name = iconfont type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setIconfont("true");
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
      _005fjspx_005ftagPool_005fh_005fhead_0026_005ftree_005fpagetype_005ficonfont_005fgrid_005fnobody.reuse(_jspx_th_h_005fhead_005f0);
    }
    return false;
  }
}
