package com.zdm.spring.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.access.expression.method.MethodSecurityExpressionHandler;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;

@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MethodSecurityConfig extends GlobalMethodSecurityConfiguration {
    public MethodSecurityExpressionHandler createExpressionHandler() {
        return methodSecurityCusHandler();
    }
    @Bean
    public MethodSecurityCusHandler methodSecurityCusHandler(){
        return new MethodSecurityCusHandler();
    }
}
