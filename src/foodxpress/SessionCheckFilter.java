package foodxpress;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "SessionCheckFilter")
public class SessionCheckFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        String path = req.getServletPath();
        if (!(path.endsWith("welcome")
                || path.endsWith("login")
                || path.endsWith("register")
                || path.endsWith("css")
                || path.endsWith("js")
                || path.startsWith("/image")
                || path.endsWith("login-servlet")
                || path.endsWith("register-servlet"))) {
            if (req.getSession().getAttribute("user") == null) { //checks if there's a LOGIN_USER set in session...
                res.sendRedirect("welcome"); //or page where you want to redirect
            } else {
//            String userType = (String) req.getSession().getAttribute("LOGIN_USER");
//            if (!userType.equals("ADMIN")){ //check if user type is not admin
//                res.sendRedirect("login.jsp"); //or page where you want to
//            }
                chain.doFilter(request, response);
            }
        } else {
            chain.doFilter(request, response);
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}