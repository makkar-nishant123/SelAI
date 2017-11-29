
package initiate;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utils.Servlet_helper;

@WebServlet("/Selenium")
public class Selenium_init extends HttpServlet {
	StringBuffer jb = new StringBuffer();
	String line = null;
	private static final long serialVersionUID = 1031422249396784970L;

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();
		String input = Servlet_helper.read_input_servlet(req);

		HashMap<String, String> out_map = Servlet_helper.get_value(input);

		switch (out_map.get("type_e")) {
		case "Execute":
			Servlet_helper.execute(out_map,0);
			break;
		case "Code":
			Servlet_helper.execute(out_map,1);
			break;
		case "Both":
			Servlet_helper.execute(out_map,2);
			break;
		default:
			System.out.println("Not valid");
		}
	}

	
	
	  public static void main(String[] args) { 
		  String input =
			  "[{\"name\":\"type_e\",\"value\":\"Execute\"},{\"name\":\"browser\",\"value\":\"Chrome\"},{\"name\":\"URL\",\"value\":\"http://www.fb.com\"},{\"name\":\"count_actions\",\"value\":\"1\"},{\"name\":\"close_browser\",\"value\":\"NO\"},{\"name\":\"kill_drivers\",\"value\":\"NO\"}][{\"name\":\"10\",\"value\":\"Keyboard\"},{\"name\":\"20\",\"value\":\"write_text\"},{\"name\":\"30\",\"value\":\"id\"},{\"name\":\"40\",\"value\":\"email\"},{\"name\":\"50\",\"value\":\"sdfdsfsd\"},{\"name\":\"60\",\"value\":\"\"}]";
		  //input = input.replace("", newChar)
		  
		  
	  HashMap<String, String> out_map = Servlet_helper.get_value(input);
	
	System.out.println(out_map.get(String.valueOf(0 + 10)));
	  
	  Servlet_helper.execute(out_map,0);
	  
	  }
	 
}