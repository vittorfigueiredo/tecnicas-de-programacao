package com.produtos.apirest.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@PostMapping("/session")
	public String salvarSession (@RequestParam("session") String session, HttpServletRequest request) {
		
		List<String> dados = (List<String>) request.getSession().getAttribute("SESSION_LOGIN");
		
		if (dados == null) {
			dados = new ArrayList<>();
			request.getSession().setAttribute("SESSION_LOGIN", dados);
		}
		dados.add(session);
		request.getSession().setAttribute("SESSION_LOGIN", dados);
		return "redirect:/lista_produtos";
	}
}