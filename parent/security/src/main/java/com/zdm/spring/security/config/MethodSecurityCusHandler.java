package com.zdm.spring.security.config;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.security.access.expression.method.MethodSecurityExpressionHandler;
import org.springframework.security.core.Authentication;

public class MethodSecurityCusHandler implements MethodSecurityExpressionHandler {
    @Override
    public Object filter(Object filterTarget, Expression filterExpression, EvaluationContext ctx) {
        return null;
    }

    @Override
    public void setReturnObject(Object returnObject, EvaluationContext ctx) {

    }

    @Override
    public ExpressionParser getExpressionParser() {
        return null;
    }

    @Override
    public EvaluationContext createEvaluationContext(Authentication authentication, MethodInvocation invocation) {
        return null;
    }
}
