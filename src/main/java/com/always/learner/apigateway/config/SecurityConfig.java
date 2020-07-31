package com.always.learner.apigateway.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.
                authorizeRequests().
                antMatchers("/patients-service/**").
                authenticated().
                //antMatchers("/patients-service/**").
                //authenticated().
                anyRequest().
                denyAll();
                //permitAll();
    }
}
