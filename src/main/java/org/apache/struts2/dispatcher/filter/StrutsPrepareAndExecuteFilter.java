package org.apache.struts2.dispatcher.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by zhoumeng on
 * 2017.10.13.
 * 上午 11:32.
 */
public class StrutsPrepareAndExecuteFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
