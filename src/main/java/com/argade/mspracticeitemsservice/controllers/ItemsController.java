package com.argade.mspracticeitemsservice.controllers;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ItemsController {
	 private final static Logger log = LoggerFactory.getLogger(ItemsController.class);

	    @GetMapping("/home")
	    public String howdy(Principal principal) {
	        String username = principal.getName();
	        JwtAuthenticationToken token = (JwtAuthenticationToken) principal;
	        log.info("claims: " + token.getTokenAttributes());
	        return "Hello, " + username;
	    }
}
