package com.zdm.spring.security.config;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.HashSet;
import java.util.Set;

public class CusAuthProvider implements AuthenticationProvider {
    private UserDetailsService userDetailsService;

    public CusAuthProvider(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ADMIN"));
        authorities.add(new SimpleGrantedAuthority("CESHI"));
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(this.userDetailsService.loadUserByUsername(authentication.getName()),
                authentication.getCredentials(),
                authorities);
        return token;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    }

}
