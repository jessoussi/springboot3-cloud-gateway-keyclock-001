package org.lab.keyclock.oidc.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MyController {

    @GetMapping("/")
    public String index(Principal principal) {
        return principal.getName();
    }

    @GetMapping("/say-hello")
    public String sayHello(){
        return "Hello";
    }

}


