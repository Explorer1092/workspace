package org.apache.jsp.WEB_002dINF.pages.dczj.count;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class countindex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tag/hanweb-tags.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fhead_0026_005fpagetype_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fimport_0026_005ftype_005fpath_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fh_005fhead_0026_005fpagetype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005fimport_0026_005ftype_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fh_005fhead_0026_005fpagetype_005fnobody.release();
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
      out.write("\t\toverflow-x:hidden;\r\n");
      out.write("\t}\r\n");
      out.write("\tbody{\r\n");
      out.write("\t\tbackground: #ffffff;\r\n");
      out.write("\t\theight: 99.5%;\r\n");
      out.write("\t\twidth: 99%;\r\n");
      out.write("\t}\r\n");
      out.write("\t.select{\r\n");
      out.write("\t\tcolor: #01AAED;\r\n");
      out.write("\t}\r\n");
      out.write("    .innerbox::-webkit-scrollbar {/*滚动条整体样式*/\r\n");
      out.write("         width: 4px;     /*高宽分别对应横竖滚动条的尺寸*/\r\n");
      out.write("         height: 4px;\r\n");
      out.write("     }\r\n");
      out.write("     .innerbox::-webkit-scrollbar-thumb {/*滚动条里面小方块*/\r\n");
      out.write("         border-radius: 5px;\r\n");
      out.write("         -webkit-box-shadow: inset 0 0 5px rgba(0,0,0,0.2);\r\n");
      out.write("         background: rgba(0,0,0,0.2);\r\n");
      out.write("     }\r\n");
      out.write("     .innerbox::-webkit-scrollbar-track {/*滚动条里面轨道*/\r\n");
      out.write("         -webkit-box-shadow: inset 0 0 5px rgba(0,0,0,0.2);\r\n");
      out.write("         border-radius: 0;\r\n");
      out.write("         background: rgba(0,0,0,0.1);\r\n");
      out.write("     }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<input type=\"hidden\" id=\"dczjid\" name=\"dczjid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dczjid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t<div class=\"selectbutton\" style=\"display: inline-block;width:175px;border-right: 1px solid #dddddd;height: 100%;vertical-align: top;overflow-y:scroll;\">\r\n");
      out.write("\t\t<div style=\"border-bottom: 1px solid #dddddd;height: 125px;\">\r\n");
      out.write("\t\t\t<div style=\"padding-top: 25px;padding-left: 50px;cursor: pointer;\" onclick=\"clearselect();selectcymx();changePage('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/count/detaillist.do?dczjid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dczjid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("')\">\r\n");
      out.write("\t\t\t\t<img id=\"png_cymx\" style=\"padding-left: 5px;\" width=\"50px;\" alt=\"参与明细\"  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/u5226.png\">\r\n");
      out.write("\t\t\t\t<div id=\"write_cymx\" style=\"padding-top: 2px;\">参与明细</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"border-bottom: 1px solid #dddddd;height: 125px;\">\r\n");
      out.write("\t\t\t<div style=\"padding-top: 25px;padding-left: 50px;cursor: pointer;\" onclick=\"clearselect();selectcygk();changePage('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/count/generalizationlist.do?dczjid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dczjid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("')\">\r\n");
      out.write("\t\t\t\t<img id=\"png_cygk\" style=\"padding-left: 5px;\" width=\"50px;\" alt=\"参与概况\"  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/count/u40.png\">\r\n");
      out.write("\t\t\t\t<div id=\"write_cygk\" style=\"padding-top: 2px;\">参与概况</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"border-bottom: 1px solid #dddddd;height: 125px;\">\r\n");
      out.write("\t\t\t<div  style=\"padding-top: 25px;padding-left: 50px;cursor: pointer;\" onclick=\"clearselect();selectjgbb();changePage('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/count/report.do?dczjid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dczjid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("')\">\r\n");
      out.write("\t\t\t\t<img id=\"png_jgbb\" width=\"50px;\" alt=\"报表结果\"  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/u5266.png\">\r\n");
      out.write("\t\t\t\t<div id=\"write_jgbb\" style=\"padding-top: 2px;\">结果报表</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"border-bottom: 1px solid #dddddd;height: 125px;\">\r\n");
      out.write("\t\t\t<div  style=\"padding-top: 25px;padding-left: 50px;cursor: pointer;\" onclick=\"clearselect();selectjcfx();changePage('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/count/crossanalysis.do?dczjid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dczjid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("')\">\r\n");
      out.write("\t\t\t\t<img id=\"png_jcfx\" width=\"50px;\" alt=\"交差分析\"  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/count/u50.png\">\r\n");
      out.write("\t\t\t\t<div id=\"write_jcfx\" style=\"padding-top: 2px;\">交差分析</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"border-bottom: 1px solid #dddddd;height: 125px;\">\r\n");
      out.write("\t\t\t<div  style=\"padding-top: 25px;padding-left: 50px;cursor: pointer;\" onclick=\"checkIsPrize('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/count/showdraw.do?dczjid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dczjid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("');\">\r\n");
      out.write("\t\t\t\t<img id=\"png_zjjg\" width=\"50px;\" alt=\"中奖结果\"  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/u5270.png\">\r\n");
      out.write("\t\t\t\t<div id=\"write_zjjg\" style=\"padding-top: 2px;\">中奖结果</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<!-- \t<div class=\"layui-body\" style=\"top: 50px; left: 0px; background-color: #f0f0f0\"> -->\r\n");
      out.write("<!-- \t\t\t<iframe src=\"\" name=\"quespage\" id=\"quespage\" frameborder=\"0\" style=\"width: 100%; height: 99%\"></iframe> -->\r\n");
      out.write("<!-- \t\t</div> -->\r\n");
      out.write("\t<div class=\"layui-body\" id=\"frame\" style=\"left: 175px;height: 100%;vertical-align: top;\">\r\n");
      out.write("\t\t<iframe id=\"page\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/count/detaillist.do?dczjid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dczjid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" frameborder=\"0\" style=\"height: 99%;width: 100%;\"></iframe>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    var width = \r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\tvar dczjid = $(\"#dczjid\").val();\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype : \"post\",\r\n");
      out.write("\t\t\turl : \"getquessession.do\",\r\n");
      out.write("\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\"dczjid\" : dczjid\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tasync : false,\r\n");
      out.write("\t\t\tcache : false,\r\n");
      out.write("\t\t\tsuccess : function(result) {\r\n");
      out.write("\t\t\t\tif (result.success) {\r\n");
      out.write("\t\t\t\t\tvar url = result.params.url;\r\n");
      out.write("\t\t\t\t\tvar selectid = result.params.selectid;\r\n");
      out.write("\t\t\t\t\tif (url != \"\" && url != null && selectid != \"\" && selectid != null) {\r\n");
      out.write("\t\t\t\t\t\t$('#page').attr(\"src\",url);\r\n");
      out.write("\t\t\t\t\t\tif(selectid == \"cymx\"){\r\n");
      out.write("\t\t\t\t\t\t\tselectcymx();\r\n");
      out.write("\t\t\t\t\t\t}else if(selectid == \"jgbb\"){\r\n");
      out.write("\t\t\t\t\t\t\tselectjgbb();\r\n");
      out.write("\t\t\t\t\t\t}else if(selectid == \"cygk\"){\r\n");
      out.write("\t\t\t\t\t\t\tselectcygk();\r\n");
      out.write("\t\t\t\t\t\t}else if(selectid == \"jcfx\"){\r\n");
      out.write("\t\t\t\t\t\t\tselectjcfx();\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\tselectzjjg();\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t$(\"#write_cymx\").addClass(\"select\");\r\n");
      out.write("\t\t\t\t\t\t$(\"#png_cymx\").attr(\"src\",\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/u5754.png\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\talert(\"操作失败，请联系管理员！\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t$(\"#frame\").css(\"width\",$(document).width()-180);\r\n");
      out.write("\t})\r\n");
      out.write("\tfunction clearselect(){\r\n");
      out.write("    \t$(\"#write_cygk\").removeClass(\"select\");\r\n");
      out.write("\t\t$(\"#write_cymx\").removeClass(\"select\");\r\n");
      out.write("\t\t$(\"#write_jgbb\").removeClass(\"select\");\r\n");
      out.write("\t\t$(\"#write_zjjg\").removeClass(\"select\");\r\n");
      out.write("\t\t$(\"#write_jcfx\").removeClass(\"select\");\r\n");
      out.write("\t\t$(\"#png_cygk\").attr(\"src\",\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/count/u40.png\");\r\n");
      out.write("\t\t$(\"#png_cymx\").attr(\"src\",\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/u5226.png\");\r\n");
      out.write("\t\t$(\"#png_jgbb\").attr(\"src\",\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/u5266.png\");\r\n");
      out.write("\t\t$(\"#png_zjjg\").attr(\"src\",\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/u5270.png\");\r\n");
      out.write("\t\t$(\"#png_jcfx\").attr(\"src\",\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/count/u50.png\");\r\n");
      out.write("\t};\r\n");
      out.write("\tfunction selectcygk(){\r\n");
      out.write("\t\t$(\"#write_cygk\").addClass(\"select\");\r\n");
      out.write("\t\t$(\"#png_cygk\").attr(\"src\",\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/count/u64.png\");\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction selectcymx(){\r\n");
      out.write("\t\t$(\"#write_cymx\").addClass(\"select\");\r\n");
      out.write("\t\t$(\"#png_cymx\").attr(\"src\",\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/u5754.png\");\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction selectjgbb(){\r\n");
      out.write("\t\t$(\"#write_jgbb\").addClass(\"select\");\r\n");
      out.write("\t\t$(\"#png_jgbb\").attr(\"src\",\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/u6099.png\");\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction selectjcfx(){\r\n");
      out.write("\t\t$(\"#write_jcfx\").addClass(\"select\");\r\n");
      out.write("\t\t$(\"#png_jcfx\").attr(\"src\",\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/count/u120.png\");\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction selectzjjg(){\r\n");
      out.write("\t\t$(\"#write_zjjg\").addClass(\"select\");\r\n");
      out.write("\t\t$(\"#png_zjjg\").attr(\"src\",\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/u6768.png\");\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction changePage(url){\r\n");
      out.write("\t\tvar selectid = $(\".select\").attr(\"id\").split(\"_\")[1];\r\n");
      out.write("\t\tvar dczjid = $(\"#dczjid\").val();\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype : \"post\",\r\n");
      out.write("\t\t\turl : \"setquessession.do\",\r\n");
      out.write("\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\"url\" : url,\r\n");
      out.write("\t\t\t\t\"dczjid\" : dczjid,\r\n");
      out.write("\t\t\t\t\"selectid\": selectid\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tasync : false,\r\n");
      out.write("\t\t\tcache : false,\r\n");
      out.write("\t\t\tsuccess : function(result) {\r\n");
      out.write("\t\t\t\tif (result.success) {\r\n");
      out.write("\t\t\t\t\t$('#page').attr(\"src\",url);\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\talert(\"操作失败，请联系管理员！\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction checkIsPrize(url){\r\n");
      out.write("\t\tvar dczjid = $(\"#dczjid\").val();\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype : \"post\",\r\n");
      out.write("\t\t\turl : \"check_isprize.do\",\r\n");
      out.write("\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\"dczjid\" : dczjid,\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tasync : false,\r\n");
      out.write("\t\t\tcache : false,\r\n");
      out.write("\t\t\tsuccess : function(result) {\r\n");
      out.write("\t\t\t\tif (result.success) {\r\n");
      out.write("\t\t\t\t\tclearselect();\r\n");
      out.write("\t\t\t\t\tselectzjjg();\r\n");
      out.write("\t\t\t\t\tchangePage(url);\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\talert(result.message);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t}\r\n");
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
    com.hanweb.common.view.head.HeadTag _jspx_th_h_005fhead_005f0 = (com.hanweb.common.view.head.HeadTag) _005fjspx_005ftagPool_005fh_005fhead_0026_005fpagetype_005fnobody.get(com.hanweb.common.view.head.HeadTag.class);
    _jspx_th_h_005fhead_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fhead_005f0.setParent(null);
    // /WEB-INF/pages/dczj/count/countindex.jsp(8,0) name = pagetype type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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

  private boolean _jspx_meth_h_005fimport_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:import
    com.hanweb.common.view.head.ImportResourceTag _jspx_th_h_005fimport_005f0 = (com.hanweb.common.view.head.ImportResourceTag) _005fjspx_005ftagPool_005fh_005fimport_0026_005ftype_005fpath_005fnobody.get(com.hanweb.common.view.head.ImportResourceTag.class);
    _jspx_th_h_005fimport_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fimport_005f0.setParent(null);
    // /WEB-INF/pages/dczj/count/countindex.jsp(11,0) name = type type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fimport_005f0.setType("js");
    // /WEB-INF/pages/dczj/count/countindex.jsp(11,0) name = path type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
