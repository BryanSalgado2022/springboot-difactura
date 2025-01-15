package com.curso.springboot.segundaparte.di.springboot_difactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.curso.springboot.segundaparte.di.springboot_difactura.Models.Item;
import com.curso.springboot.segundaparte.di.springboot_difactura.Models.Product;

@Configuration
@PropertySource(value = "classpath:/data.properties", encoding = "UTF-8")
public class AppConfig {
    @Bean("items")
    List<Item> itemsInvoice(){
        Product p1 = new Product("Camara Sony",9000);
        Product p2 = new Product("Pizza",50);
        List<Item> items = Arrays.asList(new Item(p1, 3), new Item(p2, 5));
        return items;
    }

    @Bean("default")
    List<Item> itemsInvoiceOffice(){
        Product p1 = new Product("Escritorio",5000);
        Product p2 = new Product("Monitor", 700);
        Product p3 = new Product("NoteBook Asus", 6000);
        Product p4 = new Product("Mouse", 800);
        List<Item> items = Arrays.asList(new Item(p1, 5), new Item(p2, 3), new Item(p3, 10), new Item(p4, 7));
        return items;
    }
}
