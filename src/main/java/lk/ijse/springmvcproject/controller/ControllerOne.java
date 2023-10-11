package lk.ijse.springmvcproject.controller;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("ControllerOne")
public class ControllerOne   {



    //mapping methods//Handler methods
    @GetMapping
    public void testMethod(){
        System.out.println("Request Received");
    }


}
