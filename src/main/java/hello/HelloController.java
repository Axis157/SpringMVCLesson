package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@SpringBootApplication
@Controller
public class HelloController {

    @GetMapping("/")
    public String sayHello() {
        return "hello_world";
    }
}
