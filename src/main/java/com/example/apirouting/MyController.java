/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.GetMapping;
 * import org.springframework.web.bind.annotation.RestController;
 * 
 */

// Write your code here.

package com.example.apirouting;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MyController {

    MyService myService = new MyService();

    @GetMapping("/")
    public String hello() {
        return myService.home();
    }

    @GetMapping("/about")
    public String about() {
        return myService.about();
    }

}
