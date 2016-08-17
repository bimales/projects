package com.websystique.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 * @author bmandal
 *
 */
@Controller
@RequestMapping("/")
public class AppController {

	/**
	 * @param model
	 * @return
	 */
	@RequestMapping(value = { "/"}, method = RequestMethod.GET)
	public String homePage(final ModelMap model) {
		return "home";
	}

	/**
	 * @param model
	 * @return view string
	 */
	@RequestMapping(value = { "/search"}, method = RequestMethod.GET)
	public String productsPage(final ModelMap model) {
		return "search";
	}

	/**
	 * @param model
	 * @return
	 */
	@RequestMapping(value = { "/contactus"}, method = RequestMethod.GET)
	public String contactUsPage(final ModelMap model) {
		return "contactus";
	}
}