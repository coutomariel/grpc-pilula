package br.com.zupacademy.apicarrosgrpc.controller;

import br.com.zupacademy.CarroResponse;
import br.com.zupacademy.apicarrosgrpc.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/carros")
public class CarroController {

    @Autowired
    CarroService carroService;

    @GetMapping
    public String getCarro(){
        CarroResponse response = carroService.criarCarro();
        return response.getId();
    }

}
