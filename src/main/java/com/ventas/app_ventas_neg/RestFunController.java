package com.ventas.app_ventas_neg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestFunController {

    @GetMapping("/")
    public String decirHola() {
        return "Hola Mundo";
    }
}
