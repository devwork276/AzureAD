package in.javakids.AzureAD.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author : Shashidhara ML
 */
@RestController
public class AzureRestController {

    @GetMapping("/hello")
    public String printMessage(){
        return "Hello World!";
    }
}
