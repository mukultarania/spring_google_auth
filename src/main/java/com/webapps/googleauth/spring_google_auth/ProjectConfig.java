package com.webapps.googleauth.spring_google_auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class ProjectConfig extends WebSecurityConfigurerAdapter {
    
    //Allow user to access only / 
    //Restrict other page access  
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        
        http.antMatcher("/**")
        .authorizeRequests()
        .antMatchers("/")
        .permitAll()
        .anyRequest().authenticated().and()
        .oauth2Login();
    }
}
