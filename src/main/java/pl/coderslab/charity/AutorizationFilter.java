package pl.coderslab.charity;

import org.springframework.ui.Model;
import pl.coderslab.charity.user.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/donation/*")
public class AutorizationFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;

        if (httpRequest.getSession().getAttribute("user") != null) {
            chain.doFilter(request, response);

        } else {
            ((HttpServletResponse) response).sendRedirect(httpRequest.getContextPath() + "/user/login");
        }
    }
}
