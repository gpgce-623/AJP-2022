import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyServlet extends HttpServlet {

	private int count;
	private int stop;
	
	@Override
	public void init(ServletConfig config){
		String start = config.getInitParameter("start");
		count = Integer.parseInt(start);
		
		ServletContext context = config.getServletContext();
		String end = context.getInitParameter("end");
		stop = Integer.parseInt(end);
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String email = req.getParameter("email");
		String pswd = req.getParameter("pswd");
		System.out.println(email + " : " + pswd);
		
		HttpSession session = req.getSession(true);
		String msg = "";
		if(session.isNew()){
			session.setAttribute("username", email);
			msg = " welcome " + email;
		}else {			
			String s_email = (String) session.getAttribute("username");
			msg = " welcome back " + s_email;
		}
		
		if(count<stop)
			count++;
		res.setContentType("text/html");		
		PrintWriter pw = res.getWriter();
		pw.print(msg +  " : " + count);
		pw.close();
		return;
	}
}
