package test.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Join")
public class GetRequest extends HttpServlet {
private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
request.setCharacterEncoding("UTF-8");
response.setContentType("text/html charset=UTF-8");
response.setCharacterEncoding("utf-8");
PrintWriter out=response.getWriter();

String name=request.getParameter("name");
String gender=request.getParameter("gender");
String id=request.getParameter("id");
String address=request.getParameter("address");
String telNumber=request.getParameter("telNumber");
String eMail=request.getParameter("eMail");
String[] hobby=request.getParameterValues("hobby");

out.println("<h2>�ۼ��Ͻ� ������ �Ʒ��� �����ϴ�.</h2><br><br>");
out.println("�̸� : "+name+"<hr>");
out.println("���� : "+gender+"<hr>");
out.println("���̵� : "+id+"<hr>");
out.println("�ּ� : "+address+"<hr>");
out.println("��ȭ��ȣ : "+telNumber+"<hr>");
out.println("�̸����ּ� : "+eMail+"<hr>");

out.println("��� : <br>");
if(hobby==null) {
out.println("[������ ��̰� �����ϴ�.]");
}else {
for(String str : hobby) {
out.println("<table border='1' cellpadding='0' cellspacing='0' width='200'>");
out.println("<tr><td>"+str+"</td></tr>");
}
out.println("</table>");
}
}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request, response);
}

}