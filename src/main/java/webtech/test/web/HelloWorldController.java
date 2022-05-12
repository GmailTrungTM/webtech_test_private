package webtech.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    @GetMapping(path ="/")
    public ModelAndView showHelloPage() {
        return new ModelAndView("helloworld");
    }
}
