package org.apache.jsp.WEB_002dINF.pages.dczj.ques;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ques_005fedit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tag/hanweb-tags.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fhead_0026_005fvalidity_005ftoggle_005ftip_005fselect_005fpagetype_005fhighlighter_005feditor_005fcodeedit_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fh_005fhead_0026_005fvalidity_005ftoggle_005ftip_005fselect_005fpagetype_005fhighlighter_005feditor_005fcodeedit_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fh_005fhead_0026_005fvalidity_005ftoggle_005ftip_005fselect_005fpagetype_005fhighlighter_005feditor_005fcodeedit_005fnobody.release();
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
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<META HTTP-EQUIV=\"Pragma\" CONTENT=\"no-cache\"> \r\n");
      out.write("<META HTTP-EQUIV=\"Cache-Control\" CONTENT=\"no-cache\"> \r\n");
      out.write("<title></title>\r\n");
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
      out.write("\r\n");
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
      out.write("   margin-left: 25px;\r\n");
      out.write("   margin-right: 25px;\r\n");
      out.write("   min-height: 100%;\r\n");
      out.write("}\r\n");
      out.write(".row1-title {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 50px;\r\n");
      out.write("\tline-height: 50px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tborder-bottom: solid 1px #CCC;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".row-button {\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tborder: 1px solid #CCC;\r\n");
      out.write("\toutline: none;\r\n");
      out.write("\theight: 30px;\r\n");
      out.write("\twidth: 100px;\r\n");
      out.write("\tbackground-color: #FFF;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".active-button {\r\n");
      out.write("\tbackground-color: #1E9FFF;\r\n");
      out.write("\tcolor: #FFF;\r\n");
      out.write("\tborder-color: #1E9FFF;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".active-button:hover {\r\n");
      out.write("\tbackground-color: #308ef2;\r\n");
      out.write("\tcolor: #FFF;\r\n");
      out.write("\tborder-color: #308ef2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ui-draggable {\r\n");
      out.write("\twidth: 220px;\r\n");
      out.write("\theight: 34px;\r\n");
      out.write("\tcolor: #666666;\r\n");
      out.write("\tfont-family: \"微软雅黑\";\r\n");
      out.write("\tfont-size: 13px;\r\n");
      out.write("\tmargin-bottom: 10px;\r\n");
      out.write("\tmargin-top: 10px;\r\n");
      out.write("\tmargin-left: 30px;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\tborder: solid 1px #CCC;\r\n");
      out.write("\tvertical-align: middle;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".toggle-on {\r\n");
      out.write("\tbackground-color: #01AAED;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".setting-ul {\r\n");
      out.write("\tpadding-top: 5px;\r\n");
      out.write("\tmargin-left: 20px;\r\n");
      out.write("\tpadding-left: 20px;\r\n");
      out.write("\tmargin-right: 20px;\r\n");
      out.write("\tpadding-bottom: 5px;\r\n");
      out.write("\tborder-bottom: 1px solid #CCC;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".setting-li {\r\n");
      out.write("\theight: 24px;\r\n");
      out.write("\tline-height: 24px;\r\n");
      out.write("\tpadding-top: 5px;\r\n");
      out.write("\tpadding-bottom: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".setting-span {\r\n");
      out.write("\theight: 24px;\r\n");
      out.write("\tline-height: 24px;\r\n");
      out.write("\tfont-size: 15px;\r\n");
      out.write("\tvertical-align: bottom;\r\n");
      out.write("\tmargin-left: 15px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".li-radio {\r\n");
      out.write("\tpadding-left: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".li-radio img{\r\n");
      out.write("\tmargin-left: 1px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".li-font {\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tfont-size: 17px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".surveylist {\r\n");
      out.write("    padding-left: 10px;\r\n");
      out.write("\tmargin-left: 50px;\r\n");
      out.write("\tmargin-right : 50px;\r\n");
      out.write("\tborder: solid 1px #3185ce;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\toverflow:hidden;\r\n");
      out.write("}\r\n");
      out.write(".survey{\r\n");
      out.write("   padding-top: 20px;\r\n");
      out.write("   padding-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write(".surveybutton {\r\n");
      out.write("\theight: 30px;\r\n");
      out.write("\tmargin-left: 50px;\r\n");
      out.write("\tmargin-right: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".surveyAnsw {\r\n");
      out.write("\tmargin-left: 50px;\r\n");
      out.write("\tmargin-right: 50px;\r\n");
      out.write("\tmargin-top: 20px;\r\n");
      out.write("    padding-bottom : 20px;\r\n");
      out.write("\tborder: solid 1px #3185ce;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".surveysort {\r\n");
      out.write("\twidth: 40px;\r\n");
      out.write("\tmargin-left: 500px;\r\n");
      out.write("}\r\n");
      out.write(".answ_img{\r\n");
      out.write("   width: 100px;\r\n");
      out.write("   height: 100px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".survey_listbg{\r\n");
      out.write("   font-size: 18px;\r\n");
      out.write("   line-height:24px;\r\n");
      out.write("   margin:0px;\r\n");
      out.write("   padding:0px;\r\n");
      out.write("}\r\n");
      out.write(".span-ques-text{\r\n");
      out.write("   font-size: 14px;\r\n");
      out.write("   height: 30px;\r\n");
      out.write("   line-height: 30px;\r\n");
      out.write("   padding : 8px;\r\n");
      out.write("}\r\n");
      out.write(".row1-bottom {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 45px;\r\n");
      out.write("\tline-height: 45px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".layui-form-radio>i:hover, .layui-form-radioed>i {\r\n");
      out.write("    \tcolor: #01AAED;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    var styleEditor =\"\";\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$(\"#isprogress\").toggle();\r\n");
      out.write("\t\t$(\"#istitlenumber\").toggle();\r\n");
      out.write("\t\t$(\"#isopencontent\").toggle();\r\n");
      out.write("\t\t$(\"#isshowscore\").toggle();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar divheight = $(\"#rows1\").height();\r\n");
      out.write("\t\tvar contentheight = divheight - 430;\r\n");
      out.write("\t\t\r\n");
      out.write("        var xssz = $(\"#xssz\").outerHeight();\r\n");
      out.write("        if(xssz <= 200){\r\n");
      out.write("        \tcontentheight = divheight - 400;\r\n");
      out.write("        }else{\r\n");
      out.write("        \tcontentheight = divheight - 440;\r\n");
      out.write("        }\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("        $(\"#div-content\").css('height',contentheight);\t\r\n");
      out.write("\t\tstyleEditor = $(\"#styleeditor\").codeedit();\r\n");
      out.write("\t\t$(\".CodeMirror-wrap\").css('height',contentheight);\r\n");
      out.write("\t\t$(\"#displaysettings\").css('display','none');\r\n");
      out.write("\t\t$(\"#oprform\").validity(function() {\r\n");
      out.write("\t\t}, {\r\n");
      out.write("\t\t\tsuccess : function(result) {\r\n");
      out.write("\t\t\t\tif (result.success) {\r\n");
      out.write("\t\t\t\t\twindow.location.reload();\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\talert(result.message);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\tfunction restoredefault(){\r\n");
      out.write("\t\tvar defaultcssstyle = $(\"#defaultcssstyle\").val();\r\n");
      out.write("\t\t$(\"#styleeditor\").val(defaultcssstyle);\r\n");
      out.write("\t\tstyleEditor.setValue(defaultcssstyle);\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configEn.cssstyle}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("    <input type=\"hidden\" id=\"dczjid\" name=\"dczjid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dczjid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("    <div style=\"display:none;\"><textarea name=\"defaultcssstyle\" id=\"defaultcssstyle\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${defaultcssstyle }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</textarea></div>\r\n");
      out.write("\t<div style=\"background-color: #f0f0f0;height: 100%\">\r\n");
      out.write("\t\t<div id=\"rows1\">\r\n");
      out.write("\t\t\t<div class=\"row1-title\">\r\n");
      out.write("\t\t\t\t<input id=\"button-select\" class=\"row-button active-button\" type=\"button\" value=\"选项设置\" onclick=\"quessettings(0)\" /> \r\n");
      out.write("\t\t\t\t<input id=\"button-display\" class=\"row-button\" type=\"button\" value=\"显示设置\" onclick=\"quessettings(1)\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"selectques\">\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"ui-draggable\" onclick=\"addques(3);\">\r\n");
      out.write("\t\t\t\t\t<div style=\"position: absolute; padding-top: 6px; padding-left: 35px;\">\r\n");
      out.write("\t\t\t\t\t\t<img style=\"width: 20px;\"\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/u2172.png\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"padding-top: 8px; padding-left: 65px; text-align: left;\">文字说明</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"ui-draggable\" onclick=\"addques(0);\">\r\n");
      out.write("\t\t\t\t\t<div style=\"position: absolute; padding-top: 6px; padding-left: 35px;\">\r\n");
      out.write("\t\t\t\t\t\t<img style=\"width: 20px;\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/u2178.png\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"padding-top: 8px; padding-left: 65px; text-align: left;\">单选题</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"ui-draggable\" onclick=\"addques(1);\">\r\n");
      out.write("\t\t\t\t\t<div style=\"position: absolute; padding-top: 6px; padding-left: 35px;\">\r\n");
      out.write("\t\t\t\t\t\t<img style=\"width: 20px;\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/u2180.png\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"padding-top: 8px; padding-left: 65px; text-align: left;\">多选题</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"ui-draggable\" onclick=\"addques(5);\">\r\n");
      out.write("\t\t\t\t\t<div style=\"position: absolute; padding-top: 8px; padding-left: 35px;\">\r\n");
      out.write("\t\t\t\t\t\t<img style=\"width: 20px;\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/u2182.png\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\tstyle=\"padding-top: 8px; padding-left: 65px; text-align: left;\">单行文本题</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"ui-draggable\" onclick=\"addques(2);\">\r\n");
      out.write("\t\t\t\t\t<div style=\"position: absolute; padding-top: 6px; padding-left: 35px;\">\r\n");
      out.write("\t\t\t\t\t\t<img style=\"width: 20px;\"\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/u2184.png\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"padding-top: 8px; padding-left: 65px; text-align: left;\">多行文本题</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"ui-draggable\" onclick=\"addques(4);\">\r\n");
      out.write("\t\t\t\t\t<div style=\"position: absolute; padding-top: 6px; padding-left: 35px;\">\r\n");
      out.write("\t\t\t\t\t\t<img style=\"width: 20px;\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/u2186.png\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"padding-top: 8px; padding-left: 65px; text-align: left;\">分页</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"margin-left: 30px;width: 220px;\">\r\n");
      out.write("\t\t\t\t\t<hr color=\"#ccc\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"ui-draggable\">\r\n");
      out.write("\t\t\t\t\t<div style=\"position: absolute; padding-top: 6px; padding-left: 35px;\">\r\n");
      out.write("\t\t\t\t\t\t<img style=\"width: 20px;\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/u2188.png\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"padding-top: 8px; padding-left: 65px; text-align: left;\" onclick=\"surveyimport();\">导入</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"ui-draggable\">\r\n");
      out.write("\t\t\t\t\t<div style=\"position: absolute; padding-top: 6px; padding-left: 35px;\">\r\n");
      out.write("\t\t\t\t\t\t<img style=\"width: 20px;\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/u2190.png\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"padding-top: 8px; padding-left: 65px; text-align: left;\" onclick=\"surveyexport();\">导出</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"displaysettings\" style=\"height: 100%;\">\r\n");
      out.write("\t\t\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"oprform\" class=\"layui-form\" lay-filter=\"setting-form\">\r\n");
      out.write("\t\t\t\t    <input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configEn.iid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"iid\" name=\"iid\">\r\n");
      out.write("\t\t\t\t    <input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configEn.dczjid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"dczjid\" name=\"dczjid\">\r\n");
      out.write("\t\t\t\t    <div id=\"xssz\" >\r\n");
      out.write("\t\t\t\t\t<ul class=\"setting-ul\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"setting-li\"><input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configEn.isprogress}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"isprogress\" name=\"isprogress\" /><span class=\"setting-span\">显示答题进度</span></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"setting-li\"><input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configEn.istitlenumber}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"istitlenumber\" name=\"istitlenumber\" /><span class=\"setting-span\">显示题目编号</span></li>\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<ul class=\"setting-ul\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"li-font\">控件ICON</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"li-radio\"><input type=\"radio\" name=\"chooseframe_style\" value=\"0\" title=\"默认\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"li-radio\"><input type=\"radio\" name=\"chooseframe_style\" value=\"1\"\r\n");
      out.write("\t\t\t\t\t\t\ttitle=\"<img src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/chooseframe/radio1.png'><img src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/chooseframe/radiocheck1.png'><img src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/chooseframe/check1.png'><img src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/chooseframe/checkcheck1.png'>\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"li-radio\"><input type=\"radio\" name=\"chooseframe_style\" value=\"2\"\r\n");
      out.write("\t\t\t\t\t\t\ttitle=\"<img src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/chooseframe/radio2.png'><img src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/chooseframe/radiocheck2.png'>\"></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<ul class=\"setting-ul\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"setting-li\"><input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configEn.isopencontent}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"isopencontent\" name=\"isopencontent\" /><span class=\"setting-span\">公开填空文字结果</span></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"setting-li\">允许填空字数：<input type=\"text\" id=\"contentsize\" name=\"contentsize\" class=\"input-text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configEn.contentsize}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" style=\"width: 30px;margin-right: 10px;\">字</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"div-content\">\r\n");
      out.write("\t\t\t\t\t<textarea id=\"styleeditor\" name=\"cssstyle\" style=\"\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configEn.cssstyle}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"row1-bottom\" style=\"margin-top:10px;\">\r\n");
      out.write("\t\t\t\t\t   <input class=\"row-button active-button\" style=\"width: 90px;\" type=\"submit\" value=\"确认\" />\r\n");
      out.write("\t\t\t\t\t   <input class=\"row-button active-button\" style=\"width: 90px;\" type=\"button\" value=\"恢复默认\" onclick=\"restoredefault();\"/> \r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"rows2\"><div id=\"rows3\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${content}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t    var form;\r\n");
      out.write("\t\tlayui.use([ 'form' ], function() {\r\n");
      out.write("\t\t\tform = layui.form;\r\n");
      out.write("\t\t\tform.val(\"setting-form\", {\r\n");
      out.write("\t\t\t\t\"chooseframe_style\": '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configEn.chooseframe_style}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("' \r\n");
      out.write("\t\t\t}) \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("// \t    $(function(quesid,answid){\r\n");
      out.write("// \t\t    var rightAnsw = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${isright}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("// \t\t    if(rightAnsw == 1 ){\r\n");
      out.write("// \t\t\t    $(\"#rightAnsw_\"+quesid+\"_\"+answid).prop(\"checked\", true );\r\n");
      out.write("// \t\t    } \r\n");
      out.write("// \t   });   \r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/js/quesEdit.js\"></script>\r\n");
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
    com.hanweb.common.view.head.HeadTag _jspx_th_h_005fhead_005f0 = (com.hanweb.common.view.head.HeadTag) _005fjspx_005ftagPool_005fh_005fhead_0026_005fvalidity_005ftoggle_005ftip_005fselect_005fpagetype_005fhighlighter_005feditor_005fcodeedit_005fnobody.get(com.hanweb.common.view.head.HeadTag.class);
    _jspx_th_h_005fhead_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fhead_005f0.setParent(null);
    // /WEB-INF/pages/dczj/ques/ques_edit.jsp(14,0) name = pagetype type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setPagetype("page");
    // /WEB-INF/pages/dczj/ques/ques_edit.jsp(14,0) name = validity type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setValidity("true");
    // /WEB-INF/pages/dczj/ques/ques_edit.jsp(14,0) name = toggle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setToggle("true");
    // /WEB-INF/pages/dczj/ques/ques_edit.jsp(14,0) name = highlighter type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setHighlighter("true");
    // /WEB-INF/pages/dczj/ques/ques_edit.jsp(14,0) name = editor type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setEditor("true");
    // /WEB-INF/pages/dczj/ques/ques_edit.jsp(14,0) name = codeedit type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setCodeedit("true");
    // /WEB-INF/pages/dczj/ques/ques_edit.jsp(14,0) name = select type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setSelect("true");
    // /WEB-INF/pages/dczj/ques/ques_edit.jsp(14,0) name = tip type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setTip("true");
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
      _005fjspx_005ftagPool_005fh_005fhead_0026_005fvalidity_005ftoggle_005ftip_005fselect_005fpagetype_005fhighlighter_005feditor_005fcodeedit_005fnobody.reuse(_jspx_th_h_005fhead_005f0);
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
    // /WEB-INF/pages/dczj/ques/ques_edit.jsp(232,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type == 3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<span style=\"float:right; padding-right: 45px\"id=\"score");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dczjid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">测评总分：");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sumscore}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("分</span><span style=\"height:20px;float:right;vertical-align: bottom;\"></span><span style=\"float:right; padding-right: 30px\" id=\"num");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dczjid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">测评总数：");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${num}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("题</span>");
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
    // /WEB-INF/pages/dczj/ques/ques_edit.jsp(243,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type == 3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<div class=\"ui-draggable\" onclick=\"addques(6);\">\r\n");
        out.write("\t\t\t\t\t<div style=\"position: absolute; padding-top: 6px; padding-left: 35px;\">\r\n");
        out.write("\t\t\t\t\t\t<img style=\"width: 20px;\"\r\n");
        out.write("\t\t\t\t\t\t\tsrc=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/resources/dczj/images/radio.png\" />\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t<div style=\"padding-top: 8px; padding-left: 65px; text-align: left;\">测评单选题</div>\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t<div class=\"ui-draggable\" onclick=\"addques(7);\">\r\n");
        out.write("\t\t\t\t\t<div style=\"position: absolute; padding-top: 6px; padding-left: 35px;\">\r\n");
        out.write("\t\t\t\t\t\t<img style=\"width: 20px;\"\r\n");
        out.write("\t\t\t\t\t\t\tsrc=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/resources/dczj/images/checkbox.png\" />\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t<div style=\"padding-top: 8px; padding-left: 65px; text-align: left;\">测评多选题</div>\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t");
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
    // /WEB-INF/pages/dczj/ques/ques_edit.jsp(322,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type == 3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<li class=\"setting-li\"><input type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configEn.isshowscore}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" id=\"isshowscore\" name=\"isshowscore\" /><span class=\"setting-span\">显示题目分值</span></li>\r\n");
        out.write("\t\t\t\t\t\t");
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
