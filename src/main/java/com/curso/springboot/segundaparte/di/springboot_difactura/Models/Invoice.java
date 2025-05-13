package com.curso.springboot.segundaparte.di.springboot_difactura.Models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Invoice {

    @Autowired
    private Client client;

    @Value("${invoice.description.office}")
    private String description;
    
    @Autowired
    @Qualifier("default")
    private List<Item> items;

    @PostConstruct
    public void init(){
        System.out.println("Creando el componente de la factura");
    }

    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }

    public int getTotal(){
        /*int total = 0;
        for (Item item : items) {
            total += item.getImport();
        }*/

        //API STREAM DE JAVA
        return items.stream()
        .map(item -> item.getImport())
        .reduce(0, (sum, item) -> sum + item);
        
    }
    
}
