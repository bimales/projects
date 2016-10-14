package org.bm.app;

import java.util.Locale;
import java.util.ResourceBundle;

public class Application {
	static ResourceBundle props;
	public static void main(final String[] args) {
		props = ResourceBundle.getBundle("config", Locale.US, Application.class.getClassLoader());
		System.out.println("$$$$ " + props.getObject("name"));
	}

}
