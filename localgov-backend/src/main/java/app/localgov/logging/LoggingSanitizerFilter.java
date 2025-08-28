package app.localgov.logging;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class LoggingSanitizerFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        try {
            if (request instanceof HttpServletRequest) {
                HttpServletRequest req = (HttpServletRequest) request;

                MDC.put("path", req.getRequestURI());
            }

            chain.doFilter(request, response);

        } finally {
            MDC.clear();
        }
    }
}
