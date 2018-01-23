
package initiate;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map.Entry;

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
				  "[{\"name\":\"type_e\",\"value\":\"Execute\"},{\"name\":\"browser\",\"value\":\"Chrome\"},{\"name\":\"URL\",\"value\":\"https://www.joecolantonio.com\"},{\"name\":\"count_actions\",\"value\":\"1\"},{\"name\":\"close_browser\",\"value\":\"YES\"},{\"name\":\"kill_drivers\",\"value\":\"YES\"}][{\"name\":\"10\",\"value\":\"Keyboard\"},{\"name\":\"20\",\"value\":\"write_text\"},{\"name\":\"70\",\"value\":\"1\"},{\"name\":\"50\",\"value\":\"fsd\"},{\"name\":\"60\",\"value\":\"\"},{\"name\":\"700\",\"value\":\"xpath\"},{\"name\":\"7000\",\"value\":\"(.//*[@name='fields[first_name]'])[1]\"}]";				  
				  HashMap<String, String> out_map = Servlet_helper.get_value(input);
		
			 for (Entry s : out_map.entrySet()){
					  System.out.println(s.getKey());
				  System.out.println(s.getValue());}
				// Servlet_helper.execute(out_map,0);
	  
	  
	  }
	 
}