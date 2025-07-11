package myPackage;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1=request.getParameter("number1");
		String s2=request.getParameter("number2");
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		String op=request.getParameter("bt1");
		int o=Integer.parseInt(op);
		int ans;
		switch(o) {
		case 1:
			ans=n1+n2;
			break;
		case 2:
			ans=Math.abs(n1-n2);
			break;
		case 3:
			ans=n1/n2;
			break;
		case 4:
			ans=n1*n2;
			break;
		default:
			ans=n1+n2;
		}
//		response.sendRedirect("MyServlet2");
		RequestDispatcher dispatcher=request.getRequestDispatcher("MyServlet2");
		dispatcher.forward(request, response);
//		response.getWriter().append("ANS="+ans);
		response.sendRedirect("NewFile.jsp?ans="+ans);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
