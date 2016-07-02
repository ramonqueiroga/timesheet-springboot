package br.com.timesheet.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by ramon on 09/06/16.
 */
@Configuration
@Order(1)
public class ApiWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.csrf().disable();
        //@formatter:off
//        http.antMatcher("/api/**")
//                .authorizeRequests()
//                .anyRequest().hasRole("USER")
//                .and()
//                .httpBasic()
//                .and()
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        //@formatter:on
    }

}
