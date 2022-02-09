package com.webapps.googleauth.spring_google_auth;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/")
    public String home(){
        return "Any User";
    }

    @GetMapping("/prevent")
    public Principal prevent(Principal principal) {
        return principal;
    }
}
