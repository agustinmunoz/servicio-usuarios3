package com.in28minutes.microservices.serviciousuarios2.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfigAgu extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
  /* http
      .cors()
      .and()
      .csrf().disable()
     // .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
     // .and()
      .authorizeRequests()
      .antMatchers("/**").permitAll();*/


    http
      .csrf().disable()
      .authorizeRequests()
      .antMatchers(HttpMethod.OPTIONS,"/**").permitAll()
      .anyRequest().authenticated()
      .and()
      .httpBasic();



  }




}
