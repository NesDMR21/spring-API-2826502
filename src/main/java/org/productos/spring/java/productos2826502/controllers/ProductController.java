package org.productos.spring.java.productos2826502.controllers;

import java.util.List;

import org.productos.spring.java.productos2826502.entities.Product;
import org.productos.spring.java.productos2826502.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/products")
public class ProductController {


    //inyectar el servicio 
    public ProductService service = 
            new ProductService();

    //Primer endpoint
    //Endpoint: un metodo en un controlador 

    @GetMapping("/saludo")
    public String saludo(){
            return "Hola ... 2826502";
    }

    //segundo endpoint 
    //Get: obtener informacion SIN ALTERAR 
    //    (inmuntable)

    @GetMapping("/{idproducto}")
    public String findProductoById(@PathVariable String idproducto){
            return "aqui se mostrara el producto coyu id es:" + idproducto;
    }

    @GetMapping
    public List<Product> findAllProducts(){
            return service.finAllProducts();

    }
    

}
