package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by tomson.ngassa on 2/20/2016.
 */
@Controller
public class Whatever {
    @RequestMapping("/hi/{name}")
    public String sayHi(@PathVariable String name, Model model){
        model.addAttribute("name", name);
        return "hello";
    }
}
