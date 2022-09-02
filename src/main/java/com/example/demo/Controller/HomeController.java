package com.example.demo.Controller;

import com.example.demo.Model.DTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HomeController {

  @GetMapping("/")
  public String index(){
    return "Home/index";
  }

  @GetMapping("/calculate")
  public String calculate(@ModelAttribute DTO data, Model model ){

    String value_1 = data.getValue_1();
    String value_2 = data.getValue_2();

    double result = Double.parseDouble(value_1) + Double.parseDouble(value_2);

    model.containsAttribute( "result"  + result);

    return "Home/calculator";
  }
}
