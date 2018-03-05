package com.example.Security.OAuth2.test.controller;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	/**
	 * Topページ
	 * @return
	 */
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	
	/**
	 * ログイン後のページ
	 * @return
	 */
	@RequestMapping("/hoge")
	public String hoge() {
		return "hoge";
	}
}
