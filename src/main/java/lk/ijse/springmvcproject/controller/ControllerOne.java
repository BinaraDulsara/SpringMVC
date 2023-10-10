package lk.ijse.springmvcproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ControllerOne")
public class ControllerOne {

    public ControllerOne() {
        System.out.println("Controller One Instantiated ");
    }

    @GetMapping
    public void testMethod(){
        System.out.println("Request have been Received");
    }
}
