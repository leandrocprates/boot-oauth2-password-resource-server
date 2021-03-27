package com.javainuse.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/test")
	public String test() {
		return "Hello World";
	}

    @RequestMapping("/whoami")
    public String whoami(@AuthenticationPrincipal String name, OAuth2Authentication auth) {
        Authentication authention =(Authentication) auth.getUserAuthentication();

        String nameAuth = authention.getName();
        boolean estaAutenticado = authention.isAuthenticated() ;
        System.out.println("Name OAuth2: " + nameAuth) ;
        System.out.println("Esta Autenticado: " + estaAutenticado) ;

        return name;
    }

}
