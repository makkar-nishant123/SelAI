package frontEnd_Utils;

import java.util.Map;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import utils.Servlet_helper;

public class Window {

	private String method_code;
	

	public Window(String method_code, Dimension dimension) {
		// TODO Auto-generated method stub
		this.method_code = method_code;
		
	}

	

	public static String maximize_window(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			Servlet_helper.getdriver().manage().window().maximize();

		return "Servlet_helper.getdriver().manage().window().maximize();";
	}

	public static String fullscreen_window(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			Servlet_helper.getdriver().manage().window().fullscreen();

		return "Servlet_helper.getdriver().manage().window().fullscreen();";
	}

	public static String setSize_window(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			Servlet_helper.getdriver().manage().window().setSize(dimension);

		return "Servlet_helper.getdriver().manage().window().setSize(" + dimension + ");";
	}

	public static String setPosition_window(Map<String, Object> param) {
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			Servlet_helper.getdriver().manage().window().setPosition(point);

		return "Servlet_helper.getdriver().manage().window().setPosition(" + new Point(param.get(arg0)) + ");";
	}

	public static Window getPosition_window(Map<String, Object> param) {
		Point point = null;
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			point = Servlet_helper.getdriver().manage().window().getPosition();

		String method_code = "Servlet_helper.getdriver().manage().window().getPosition();";
		return new Window(method_code, point);
	}

	public static Window getSize_window(Map<String, Object> param) {
		Dimension dimension = null;
		if (param.get("flag").equals(0) || param.get("flag").equals(2))
			dimension = Servlet_helper.getdriver().manage().window().getSize();

		String method_code = "Servlet_helper.getdriver().manage().window().getSize();";
		return new Window(method_code, dimension);
	}

}
