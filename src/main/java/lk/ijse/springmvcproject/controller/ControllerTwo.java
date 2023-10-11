package lk.ijse.springmvcproject.controller;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("two")
public class ControllerTwo implements InitializingBean {

    public ControllerTwo() {
        System.out.println("Controller Two Instantiated ");
    }

    @GetMapping
    public String testTwo(){
        return "Hello mf";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("controller two is ready to use");
    }
}
