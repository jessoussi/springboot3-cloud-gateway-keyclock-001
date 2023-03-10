package org.lab.keyclock.oidc.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class ProductController {


    @GetMapping("/product")
    public String getAllProducts(Principal principal){
        return "Response from product service, User ID : " + principal.getName();
    }
}
