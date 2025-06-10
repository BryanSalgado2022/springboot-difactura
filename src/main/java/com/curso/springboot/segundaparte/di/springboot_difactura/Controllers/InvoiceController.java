package com.curso.springboot.segundaparte.di.springboot_difactura.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.springboot.segundaparte.di.springboot_difactura.Models.Client;
import com.curso.springboot.segundaparte.di.springboot_difactura.Models.Invoice;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/invoices")
public class InvoiceController {

    @Autowired
    private Invoice invoice;

    @GetMapping("/show")
    public Invoice show(){
        
        Invoice inv = new Invoice();
        
        Client client = new Client();
        client.setName(invoice.getClient().getName());
        client.setApellido(invoice.getClient().getApellido());

        inv.setClient(client);
        inv.setDescription(invoice.getDescription());
        inv.setItems(invoice.getItems());

        return inv;
    }
}
