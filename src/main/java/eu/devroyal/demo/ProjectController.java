package eu.devroyal.demo;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class ProjectController {


    @GetMapping(value = "/hello")
    public String getProjects(HttpServletRequest request) {
        CsrfToken token = (CsrfToken) request.getAttribute("_csrf");
        System.out.println(token.getHeaderName() + " = " + token.getToken());
        return "Hello";
    }
}
