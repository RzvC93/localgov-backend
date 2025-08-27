package app.localgov.logging;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import java.io.IOException;

@Component
public class LoggingSanitizerFilter implements Filter {
    @Override public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        try {
            if (request instanceof HttpServletRequest req) {
                // NU băga IP, email, token în loguri. Pune doar un requestId contextual.
                MDC.put("path", req.getRequestURI());
            }
            chain.doFilter(request, response);
        } finally {
            MDC.clear();
        }
    }
}
