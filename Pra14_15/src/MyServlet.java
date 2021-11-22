import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

	private int count;

	@Override
	public void init(ServletConfig config) {
		count = Integer.parseInt(config.getInitParameter("start"));
		ServletContext application = config.getServletContext();
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res){
		
		count++;		
		PrintWriter pw = null;
		try {
			pw = res.getWriter();
			pw.println(count);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			pw.close();
		}
		
		return;		
	}

}
