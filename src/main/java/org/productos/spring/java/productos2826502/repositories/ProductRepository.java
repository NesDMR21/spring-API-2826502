package org.productos.spring.java.productos2826502.repositories;

import java.util.List;

import org.productos.spring.java.productos2826502.entities.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    //La lista de un repositorio
    //debe ser inmutable
    //La logica de negocio no modifica 
    //La lista de un repositorio
    List<Product> productos = List.of(
        Product.builder()
                .id(1L)
                .nombre("Silla Reclinable")
                .precio(2345.1)
                .build()
                ,
        new Product(2L,
                    "Escritorio",
                    234567.6)
                    ,
        new Product(3L,
                    "Escalera" ,
                    123456.4)
                    ,
        new Product(4L,
                    "Computador",
                    123456.9)
    );

    //metodo(comportamineto) par aconsultar todos
    //los productos del repository
    public List<Product> finAll(){
        return this.productos;
    }
}
