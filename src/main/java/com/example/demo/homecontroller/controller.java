package com.example.demo.homecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class controller {
@GetMapping("/")
public String home() {
    return "home";
}

}
