package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class message_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=GBK");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>提示信息</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"/assets/images/styles.css\">\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div align=\"center\">\r\n");
      out.write("\t\t  \t<div class=\"div1\">\r\n");
      out.write("\t\t  \t\t<div class=\"top\">提示信息</div>\r\n");
      out.write("\t\t  \t\t<div class=\"bottom\">\r\n");
      out.write("\t\t\t\t\t<div class=\"div2\">\r\n");
      out.write("\t\t\t\t  \t\t<ul>\r\n");
      out.write("\t\t\t\t  \t\t\t<li><a href=\"/views/reg.jsp\">用户注册</a></li>\r\n");
      out.write("\t\t\t\t  \t\t\t<li><a href=\"/views/login.jsp\">用户登录</a></li>\r\n");
      out.write("\t\t\t\t  \t\t\t<li><a href=\"/views/message.jsp\">当前用户</a></li>\r\n");
      out.write("\t\t\t\t  \t\t\t<li><a href=\"ExitServlet\">用户退出</a></li>\r\n");
      out.write("\t\t\t\t  \t\t</ul>\r\n");
      out.write("\t\t\t\t  \t</div>\r\n");
      out.write("\t\t\t\t  \t <div class=\"div3\"> \r\n");
      out.write("\t\t\t\t\t    ");
 
					    	// 获取提示信息
							String info = (String)request.getAttribute("info");
					    	// 如果提示信息不为空，则输出提示信息
							if(info != null){
								out.println(info);
							}
					    	// 获取登录的用户信息
							User user = (User)session.getAttribute("user");
					    	// 判断用户是否登录
							if(user != null){
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<table align=\"center\" width=\"350\" border=\"1\" height=\"200\" bordercolor=\"#E8F4CC\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t    \t\t<td align=\"center\" colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t    \t\t\t<span style=\"font-weight: bold;font-size: 18px;\">");
      out.print(user.getUsername() );
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t    \t\t\t登录成功！\r\n");
      out.write("\t\t\t\t\t    \t\t</td>\r\n");
      out.write("\t\t\t\t\t    \t</tr>\r\n");
      out.write("\t\t\t\t\t    \t<tr>\r\n");
      out.write("\t\t\t\t\t    \t\t<td align=\"right\" width=\"30%\">头 像：</td>\r\n");
      out.write("\t\t\t\t\t    \t\t<td>\r\n");
      out.write("\t\t\t\t\t    \t\t\t<img src=\"");
      out.print(user.getPhoto());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t    \t\t</td>\r\n");
      out.write("\t\t\t\t\t    \t</tr>\r\n");
      out.write("\t\t\t\t\t    \t<tr>\r\n");
      out.write("\t\t\t\t\t    \t\t<td align=\"right\">性 别：</td>\r\n");
      out.write("\t\t\t\t\t    \t\t<td>");
      out.print(user.getSex());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t    \t</tr>\r\n");
      out.write("\t\t\t\t\t    \t<tr>\r\n");
      out.write("\t\t\t\t\t    \t\t<td align=\"right\">联系电话：</td>\r\n");
      out.write("\t\t\t\t\t    \t\t<td>");
      out.print(user.getTel());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t    \t</tr>\r\n");
      out.write("\t\t\t\t\t    \t<tr>\r\n");
      out.write("\t\t\t\t\t    \t\t<td align=\"right\">电子邮箱：</td>\r\n");
      out.write("\t\t\t\t\t    \t\t<td>");
      out.print(user.getEmail());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t    \t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t");
								
							}else{
								out.println("<br>对不起，您还没有登录！");
							}
						
      out.write("\r\n");
      out.write("\t\t\t\t  \t </div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t  \t</div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
