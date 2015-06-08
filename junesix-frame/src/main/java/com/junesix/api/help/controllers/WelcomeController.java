package com.junesix.api.help.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sofn
 * @version 1.0 Created at: 2015-04-29 16:19
 */
@Controller
@RequestMapping("/welcome")
public class WelcomeController {

    @RequestMapping(value = "")
    public String welcome() {
//        return "redirect:/index.jsp";
        return "forward:/WEB-INF/jsp/welcome.jsp";
    }
}
