package utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

public class Call_methods {

	static String frame_class_method_param(String classname, String methodname, String data, String wait,
			WebElement element, int flag, String method_code) {
		// TODO Auto-generated method stub
		classname = "frontEnd_Utils." + classname;
		Map param = new HashMap();
		param.put("data", data);
		param.put("element", element);
		param.put("flag", flag);
		param.put("wait", wait);
		param.put("method_code", method_code);

		try {
			Class<?> c = Class.forName(classname);

			Method method = c.getDeclaredMethod(methodname, Map.class);

			method_code += method.invoke(methodname, param);

		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | ClassNotFoundException
				| NoSuchMethodException | SecurityException e) {

			e.printStackTrace();
		}
		return method_code;
	}

	static String frame_class_method_param(String classname, String methodname, String data, String wait,
			List<WebElement> element, int flag, String method_code) {
		// TODO Auto-generated method stub
		classname = "frontEnd_Utils." + classname;
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("data", data);
		param.put("element", element);
		param.put("flag", flag);
		param.put("wait", wait);
		param.put("method_code", method_code);

		try {
			Class<?> c = Class.forName(classname);

			Method method = c.getDeclaredMethod(methodname, HashMap.class);

			method_code += method.invoke(methodname, param);

		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | ClassNotFoundException
				| NoSuchMethodException | SecurityException e) {

			e.printStackTrace();
		}
		return method_code;
	}

}
