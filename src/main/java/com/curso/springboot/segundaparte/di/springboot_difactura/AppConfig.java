package com.curso.springboot.segundaparte.di.springboot_difactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.curso.springboot.segundaparte.di.springboot_difactura.Models.Item;
import com.curso.springboot.segundaparte.di.springboot_difactura.Models.Product;

@Configuration
@PropertySource(value = "classpath:/data.properties", encoding = "UTF-8")
public class AppConfig {
    @Bean
    List<Item> itemsInvoice(){
        Product p1 = new Product("Camara Sony",9000);
        Product p2 = new Product("Pizza",50);
        List<Item> items = Arrays.asList(new Item(p1, 3), new Item(p2, 5));
        return items;
    }
}
