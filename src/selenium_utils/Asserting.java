package selenium_utils;

import org.testng.Assert;

public class Asserting {

	public String assert_String(String Expected, String Actual, String message) {

		Assert.assertEquals(Actual, Expected, message);

		return "Assert.assertEquals(" + Actual + "," + Expected + "," + message + ");";
	}

	public String assert_integer(int Expected, int Actual, String message) {

		Assert.assertEquals(Actual, Expected, message);

		return "Assert.assertEquals(" + Actual + "," + Expected + "," + message + ");";
	}

	public String assert_long(long Expected, long Actual, String message) {

		Assert.assertEquals(Actual, Expected, message);

		return "Assert.assertEquals(" + Actual + "," + Expected + "," + message + ");";
	}

	public String assert_long(double Expected, double Actual, String message) {

		Assert.assertEquals(Actual, Expected, message);

		return "Assert.assertEquals(" + Actual + "," + Expected + "," + message + ");";
	}

	public String assert_array_string(String[] Expected, String[] Actual, String message) {

		Assert.assertEquals(Actual, Expected, message);

		return "Assert.assertEquals(" + Actual + "," + Expected + "," + message + ");";
	}

	public String assert_array_int(int[] Expected, int[] Actual, String message) {

		Assert.assertEquals(Actual, Expected, message);

		return "Assert.assertEquals(" + Actual + "," + Expected + "," + message + ");";
	}

	public String assert_array_long(long[] Expected, long[] Actual, String message) {

		Assert.assertEquals(Actual, Expected, message);

		return "Assert.assertEquals(" + Actual + "," + Expected + "," + message + ");";
	}

	public String assert_float(float Expected, float Actual, String message) {

		Assert.assertEquals(Actual, Expected, message);

		return "Assert.assertEquals(" + Actual + "," + Expected + "," + message + ");";
	}

	public String assert_float_array(float[] Expected, float[] Actual, String message) {

		Assert.assertEquals(Actual, Expected, message);

		return "Assert.assertEquals(" + Actual + "," + Expected + "," + message + ");";
	}

}
