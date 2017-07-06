/**
 * 
 */
package org.bm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author bimales
 *
 */
public class App {

	/**
	 * 
	 */
	public App() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String paragraph = "ab bc ab bc abbbb bc ab cd ef bc bc ";
		String eachWord[] = paragraph.split(" ");

		List eachWordList = new ArrayList(Arrays.asList(eachWord));

		Map eachnum = new LinkedHashMap();

		for (int i = 0; i < eachWord.length; i++) {
			eachnum.put(eachWord[i], Collections.frequency(eachWordList, eachWord[i]));
			;
		}
		System.out.println(eachnum);
	}

}
