package com.Springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomeController {
@RequestMapping("/index")
public String home()
{

System.out.println("This is HomeController");

return "index";
}

}