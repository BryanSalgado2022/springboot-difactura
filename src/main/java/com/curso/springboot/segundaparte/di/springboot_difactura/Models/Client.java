package com.curso.springboot.segundaparte.di.springboot_difactura.Models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Client {
    
    @Value("${client.name}")
    private String name;

    @Value("${client.lastname}")
    private String apellido;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
