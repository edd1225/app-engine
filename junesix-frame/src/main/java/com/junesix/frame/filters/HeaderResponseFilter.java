package com.junesix.frame.filters;

import com.junesix.frame.context.ThreadLocalContext;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author sofn
 * @version 1.0 Created at: 2015-04-30 18:46
 */
public class HeaderResponseFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        ((HttpServletResponse) response).setHeader("X-Matrix-IP", request.getLocalAddr());
        ((HttpServletResponse) response).setHeader("X-Matrix-RequestID", ThreadLocalContext.getRequestContext().getRequestId());
        filterChain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void destroy() {
    }
}