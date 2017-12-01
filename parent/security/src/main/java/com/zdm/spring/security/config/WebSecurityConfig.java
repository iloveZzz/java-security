package com.zdm.spring.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    public void configure(AuthenticationManagerBuilder auth){
        auth.authenticationProvider( cusAuthProvider());
    }
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .logout().invalidateHttpSession(true).and()
                .formLogin().and()
                .httpBasic();
    }

    @Bean
    public UserDetailsService userDetailsS​​ervice() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("zdm").password("zdm").authorities("CESHI").roles("user").build());
        return manager;
    }
    @Bean
    public CusAuthProvider cusAuthProvider(){
        CusAuthProvider cusAuthProvider = new CusAuthProvider(userDetailsS​​ervice());
        return cusAuthProvider;
    }

}
