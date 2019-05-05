package org.apache.jsp.WEB_002dINF.pages.dczj.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customtemplate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tag/hanweb-tags.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fhead_0026_005fvalidity_005fpagetype_005fcodeedit_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fh_005fhead_0026_005fvalidity_005fpagetype_005fcodeedit_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fh_005fhead_0026_005fvalidity_005fpagetype_005fcodeedit_005fnobody.release();
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
      out.write("<link type=\"text/css\" rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
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
      out.write("    overflow-y: hidden;\r\n");
      out.write("}\r\n");
      out.write("#rows2 {\r\n");
      out.write("    padding-top:0px; \r\n");
      out.write("\tpadding-left: 312px;\r\n");
      out.write("\theight: 100%;\r\n");
      out.write(" \toverflow-y: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#rows3 {\r\n");
      out.write("   background-color: #ffffff;\r\n");
      out.write("/*    margin-left: 40px;\r\n");
      out.write("   margin-right: 40px; */\r\n");
      out.write("   min-height: 100%;\r\n");
      out.write("   text-align: center;\r\n");
      out.write("   overflow-y:hidden;\r\n");
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
      out.write("\theight: 75px;\r\n");
      out.write("\tline-height: 75px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tmargin-top:20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".row1-content {\r\n");
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
      out.write("\tmax-width: 100%;\r\n");
      out.write("\tmax-height: 100%;\r\n");
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
      out.write("\r\n");
      out.write(".row-button-title {\r\n");
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
      out.write(".row-button-title:hover {\r\n");
      out.write("\tbackground-color: #308ef2;\r\n");
      out.write("\tcolor: #FFF;\r\n");
      out.write("\tborder-color: #308ef2;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var pcEditor =\"\";\r\n");
      out.write("var phoneEditor =\"\";\r\n");
      out.write("$(function(){\r\n");
      out.write("\tpcEditor = $(\"#pceditor\").codeedit(); //创建codemirror编辑器对象\r\n");
      out.write("\tphoneEditor = $(\"#phoneeditor\").codeedit(); //创建codemirror编辑器对象\r\n");
      out.write("\t$(\".CodeMirror-wrap\").css('height',$(\"#pc-div-content\").height());\r\n");
      out.write("//\tvar type = $(\"#pagetype\").val();\r\n");
      out.write("\tvar type = sessionStorage.getItem(\"type\");\r\n");
      out.write("\tconsole.log(type);\r\n");
      out.write("\tif(type == null){\r\n");
      out.write("\t\ttype = 0;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(type == 0){\r\n");
      out.write("\t\t$(\"#pc-div-content\").css('display','');\r\n");
      out.write("\t\t$(\"#phone-div-content\").css('display','none');\r\n");
      out.write("\t}else if(type == 2){\r\n");
      out.write("\t\t$(\"#pc-div-content\").css('display','none');\r\n");
      out.write("\t\t$(\"#phone-div-content\").css('display','');\r\n");
      out.write("\t}\r\n");
      out.write("\tselectTemplate(type);\r\n");
      out.write("\t$(\"#oprform\").validity(function() {\r\n");
      out.write("\r\n");
      out.write("\t}, {\r\n");
      out.write("\t\tsuccess : function(result) {\r\n");
      out.write("\t\t\tif (result.success) {\r\n");
      out.write("\t\t\t\tsessionStorage.setItem(\"type\",$(\"#templatetype\").val())\r\n");
      out.write("\t\t\t\twindow.location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/tempalte/showcustom.do?dczjid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dczjid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&type=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\talert(result.message);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function selectTemplate(type) {\r\n");
      out.write("\t$(\"#templatetype\").val(type);\r\n");
      out.write("\tvar val = Math.random();\r\n");
      out.write("\tif(type == 0){\r\n");
      out.write("\t\t$(\"#pc-div-content\").css('display','');\r\n");
      out.write("\t\t$(\"#button-pc\").addClass(\"active-button\");\r\n");
      out.write("\t\t$(\"#phone-div-content\").css('display','none');\r\n");
      out.write("\t\t$(\"#button-phone\").removeClass(\"active-button\");\r\n");
      out.write("\t\t$(\"#iframepage\").css(\"width\",\"100%\");\r\n");
      out.write("\t\t$(\"#iframepage\").attr(\"src\",\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/tempalte/iframecustomtemplate.do?dczjid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dczjid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&type=0&val=\"+val);\r\n");
      out.write("\t}else if(type == 2){\r\n");
      out.write("\t\t$(\"#pc-div-content\").css('display','none');\r\n");
      out.write("\t\t$(\"#button-pc\").removeClass(\"active-button\");\r\n");
      out.write("\t\t$(\"#phone-div-content\").css('display','');\r\n");
      out.write("\t\t$(\"#button-phone\").addClass(\"active-button\");\r\n");
      out.write("\t\t$(\"#iframepage\").attr(\"src\",\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/tempalte/iframecustomtemplate.do?dczjid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dczjid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&type=2&val=\"+val);\r\n");
      out.write("\t\t$(\"#iframepage\").css(\"width\",\"500px\");\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function newchange() {\r\n");
      out.write("\twindow.location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/tempalte/tempalte_show.do?dczjid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dczjid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function restoredefault(){\r\n");
      out.write("\tvar type = $(\"#templatetype\").val();\r\n");
      out.write("\tif(type == 0){\r\n");
      out.write("\t\tvar pcDefaultPage = $(\"#pcDefaultPage\").val();\r\n");
      out.write("\t\t$(\"#pceditor\").val(pcDefaultPage);\r\n");
      out.write("\t\tpcEditor.setValue(pcDefaultPage);\r\n");
      out.write("\t}else if(type == 2){\r\n");
      out.write("\t\tvar phoneDefaultPage = $(\"#phoneDefaultPage\").val();\r\n");
      out.write("\t\t$(\"#phoneeditor\").val(phoneDefaultPage);\r\n");
      out.write("\t\tphoneEditor.setValue(phoneDefaultPage);\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function displaybutton(){\r\n");
      out.write("\tif($(\"#savecommon\").css('display') == 'none'){\r\n");
      out.write("\t\t$(\"#savecommon\").css('display','');\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\t$(\"#savecommon\").css('display','none');\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function beforecommonsubmit(){\r\n");
      out.write("\tvar pcPageCode = pcEditor.getValue();\r\n");
      out.write("\tvar phonePageCode = phoneEditor.getValue();\r\n");
      out.write("\topenDialog('tempalte/showcommontemplateimport.do?dczjid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dczjid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&type=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&pcPageCode='+encodeURIComponent(pcPageCode)+'&phonePageCode='+encodeURIComponent(phonePageCode), 400, 200,{\r\n");
      out.write("\t    \ttitle : '上传图片'\r\n");
      out.write("\t});\r\n");
      out.write("// \t$.post('showcommontemplateimport.do', {\r\n");
      out.write("// \t\tdczjid : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dczjid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("',\r\n");
      out.write("// \t\ttype : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("',\r\n");
      out.write("// \t\tpcPageCode : pcPageCode,\r\n");
      out.write("// \t\tphonePageCode : phonePageCode\r\n");
      out.write("// \t}, function(str) {\r\n");
      out.write("// \t\tlayer.open({\r\n");
      out.write("// \t\t\ttype : 1,\r\n");
      out.write("// \t\t\ttitle : '自定义模板',\r\n");
      out.write("// \t\t\tarea : [ '450px', '250px' ],\r\n");
      out.write("// \t\t\tcontent : str,\r\n");
      out.write("// \t\t\tbtn : [ '确认添加', '放弃编辑' ],\r\n");
      out.write("// \t\t\tyes : function(index, layero) {\r\n");
      out.write("// \t\t\t\t$(\"#oprform\").submit();\r\n");
      out.write("// \t\t\t}\r\n");
      out.write("// \t\t})\r\n");
      out.write("// \t})\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function commonsubmit(){\r\n");
      out.write("\tvar pcPageCode = pcEditor.getValue();\r\n");
      out.write("\tvar phonePageCode = phoneEditor.getValue();\r\n");
      out.write("    $.ajax({\r\n");
      out.write("\t\ttype : \"post\",\r\n");
      out.write("\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/tempalte/commontemplatesubmit.do\",\r\n");
      out.write("\t\tdata : {\r\n");
      out.write("\t\t\tdczjid : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dczjid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("',\r\n");
      out.write("\t\t\ttype : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("',\r\n");
      out.write("\t\t\tpcPageCode : pcPageCode,\r\n");
      out.write("\t\t\tphonePageCode : phonePageCode\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tasync : false,\r\n");
      out.write("\t\tcache : false,\r\n");
      out.write("\t\tsuccess : function(result) {\r\n");
      out.write("\t\t\tif (result.success) {\r\n");
      out.write("\t\t\t\twindow.location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/tempalte/showcustom.do?dczjid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dczjid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&type=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" <input type=\"hidden\" id=\"pagetype\" value=\"0\">\r\n");
      out.write(" <div style=\"height: 100%;\">\r\n");
      out.write("\t<div id=\"rows1\">\r\n");
      out.write("\t\t<div class=\"row1-title\">\r\n");
      out.write("\t\t\t<input id=\"button-pc\" onclick=\"selectTemplate(0);\" class=\"row-button-title active-button\" type=\"button\" value=\"电脑端\" /> \r\n");
      out.write("\t\t\t<input id=\"button-phone\" onclick=\"selectTemplate(2);\" class=\"row-button-title\" type=\"button\" value=\"移动端\" />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" method=\"post\" id=\"oprform\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"dczjid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dczjid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"type\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t<input type=\"hidden\" id=\"templatetype\" name=\"templatetype\" value=\"0\">\r\n");
      out.write("\t\t<div style=\"display:none;\"><textarea name=\"pcDefaultPage\" id=\"pcDefaultPage\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pcDefaultPage }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</textarea></div>\r\n");
      out.write("\t\t<div style=\"display:none;\"><textarea name=\"phoneDefaultPage\" id=\"phoneDefaultPage\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${phoneDefaultPage }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</textarea></div>\r\n");
      out.write("     \t<div id=\"div-content\" class=\"row1-content\" style=\"overflow:hidden;\">\r\n");
      out.write("\t\t\t<div id=\"pc-div-content\" style=\"height: 100%;width: 100%;\">\r\n");
      out.write("\t\t\t<textarea id=\"pceditor\" name=\"pcPageCode\" style=\"display:none;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pcPageCode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</textarea>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"phone-div-content\" style=\"height: 100%;width: 100%;\">\r\n");
      out.write("\t\t\t<textarea id=\"phoneeditor\" name=\"phonePageCode\" style=\"display:none;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${phonePageCode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</textarea>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"row1-bottom\">\r\n");
      out.write("\t\t   <div style=\"position: fixed;margin-left: 10px;margin-top: 5px;height: 63px;\">\r\n");
      out.write("\t\t   <div style=\"height: 30px;line-height: 30px;width: 93px;\">\r\n");
      out.write("\t\t   <input class=\"row-button-title active-button\" style=\"width: 60px;vertical-align:middle;margin-right: 1px;\" type=\"submit\" value=\"保存\" /><img onclick=\"displaybutton();\" style=\"height: 30px;cursor: pointer;\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/dczj/images/template/u8888.png\"> \r\n");
      out.write("\t\t   </div>\r\n");
      out.write("\t\t   <div id=\"savecommon\" style=\"height: 30px;line-height: 30px;width: 93px;margin-top: 3px;display: none;\">\r\n");
      out.write("\t\t   <input class=\"row-button-title active-button\" style=\"width: 93px;vertical-align:middle;margin-right: 1px;font-size: 11px;\" type=\"button\" value=\"保存为常用模板\" onclick=\"beforecommonsubmit();\"/>\r\n");
      out.write("\t\t   </div>\r\n");
      out.write("\t\t   </div>\r\n");
      out.write("\t\t   <div style=\"height: 30px;line-height: 30px;position: fixed;margin-left: 110px;margin-top: 6px;\">\r\n");
      out.write("\t\t   <input class=\"row-button-title active-button\" style=\"width: 90px;\" type=\"button\" value=\"恢复默认\" onclick=\"restoredefault();\"/> \r\n");
      out.write("\t\t   <input class=\"row-button-title active-button\" style=\"width: 90px;\" type=\"button\" value=\"重新选择\" onclick=\"newchange();\"/> </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
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
      out.write("/manager/tempalte/iframecustomtemplate.do?dczjid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dczjid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&type=0&templateid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${templateid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&uuid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uuid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"iframepage\" id=\"iframepage\" frameborder=\"0\" style=\"width: 100%;\"></iframe>\r\n");
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
    com.hanweb.common.view.head.HeadTag _jspx_th_h_005fhead_005f0 = (com.hanweb.common.view.head.HeadTag) _005fjspx_005ftagPool_005fh_005fhead_0026_005fvalidity_005fpagetype_005fcodeedit_005fnobody.get(com.hanweb.common.view.head.HeadTag.class);
    _jspx_th_h_005fhead_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fhead_005f0.setParent(null);
    // /WEB-INF/pages/dczj/template/customtemplate.jsp(10,0) name = pagetype type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setPagetype("page");
    // /WEB-INF/pages/dczj/template/customtemplate.jsp(10,0) name = codeedit type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setCodeedit("true");
    // /WEB-INF/pages/dczj/template/customtemplate.jsp(10,0) name = validity type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h_005fhead_005f0.setValidity("true");
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
      _005fjspx_005ftagPool_005fh_005fhead_0026_005fvalidity_005fpagetype_005fcodeedit_005fnobody.reuse(_jspx_th_h_005fhead_005f0);
    }
    return false;
  }
}
