package org.apache.jsp.WEB_002dINF.pages.support.error;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class logintimeout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>您尚未登录或操作已过期</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("html {\r\n");
      out.write("\tbackground: #F6F6F6;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("html,body {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#box {\r\n");
      out.write("\tbackground: #fff;\r\n");
      out.write("\tcolor: #333;\r\n");
      out.write("\tfont-family: \"MicrosoftYaHei\", \"微软雅黑\", Verdana, Arial;\r\n");
      out.write("\twidth: 550px;\r\n");
      out.write("\tpadding: 1em 2em;\r\n");
      out.write("\t-moz-border-radius: 11px;\r\n");
      out.write("\t-khtml-border-radius: 11px;\r\n");
      out.write("\t-webkit-border-radius: 11px;\r\n");
      out.write("\tborder-radius: 11px;\r\n");
      out.write("\tborder: 1px solid #dfdfdf;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a {\r\n");
      out.write("\tcolor: #2583ad;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a:hover {\r\n");
      out.write("\tcolor: #d54e21;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1 {\r\n");
      out.write("\tborder-bottom: 1px solid #dadada;\r\n");
      out.write("\tclear: both;\r\n");
      out.write("\tcolor: #666;\r\n");
      out.write("\tmargin: 5px 0 5px 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tpadding-bottom: 10px;\r\n");
      out.write("\tfont-size: 24px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction gid(id) {\r\n");
      out.write("\t\treturn document.getElementById ? document.getElementById(id) : null;\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction timeDesc() {\r\n");
      out.write("\t\tif (all <= 0) {\r\n");
      out.write("\t\t\ttop.location = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar obj = gid(\"tS\");\r\n");
      out.write("\t\tif (obj)\r\n");
      out.write("\t\t\tobj.innerHTML = all + \" 秒后\";\r\n");
      out.write("\t\tall--;\r\n");
      out.write("\t}\r\n");
      out.write("\tvar all = 4;\r\n");
      out.write("\tif (all > 0)\r\n");
      out.write("\t\twindow.setInterval(\"timeDesc();\", 1000);\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<table width=\"100%\" height=\"100%\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<table id=\"box\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t登入超时\r\n");
      out.write("\t\t\t\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t\t\t\t<p style=\"font-size: 14px;color: #999;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t您尚未登录或操作超时！请返回重新登录\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span id=\"tS\">5 秒后</span> 自动返回登录页面。\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/\" target=\"_top\">立即返回</a>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
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
}
