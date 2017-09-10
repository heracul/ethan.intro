package ethan.web.intro.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {

    @RequestMapping("/ethan")
    public String index() {
        return "index";
    }



}
