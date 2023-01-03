package com.example.demomapstruct.configuration;

import com.example.demomapstruct.exception.TokenNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

@Configuration
@Slf4j
public class AuthenticationFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // checking request
        HttpServletRequest httpServletRequest = ((HttpServletRequest) request);
        String token = httpServletRequest.getHeader("token");
        Scanner s = new Scanner(httpServletRequest.getInputStream(), "UTF-8").useDelimiter("\\A");
        if(s.hasNext()){
            log.info(s.next());
        } else {
            log.info("");
        }
        // verify token
        if(token == null || !token.toString().contains("g3")){
            throw new TokenNotFoundException("Token is not found");
        }

//        Map<String, Object> body = httpServletRequest.getReader();
        // remove token form header

        //modify response

        // allow filter chain continue
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
