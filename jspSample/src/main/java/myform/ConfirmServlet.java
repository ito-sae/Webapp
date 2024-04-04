package myform;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class confirm
 */

public class ConfirmServlet extends HttpServlet {

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		HttpSession session = request.getSession();
		
		//確認ボタンを押下し、リクエストの情報を受け取りセッションにセット
		String name = request.getParameter("name");		
		String mail = request.getParameter("mail");
		String title = request.getParameter("title");
		String body = request.getParameter("body");
		session.setAttribute("name",name);
		session.setAttribute("mail",mail);
		session.setAttribute("title",title);
		session.setAttribute("body",body);
		
		 
		//入力内容が空欄の場合、エラーページに飛び、
		//入力内容がすべて埋まった場合、確認画面に飛ぶ
		String view;
		if(name == "" || mail == "" || title == "" || body == "") {
			view ="/WEB-INF/views/error.jsp";
		} else {
			view = "/WEB-INF/views/confirm.jsp";
		}
 		
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request,response);
	}

}
