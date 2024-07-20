package com.ejemplo.jpa_tutorial.controllers;
import com.ejemplo.jpa_tutorial.model.producto;
import com.ejemplo.jpa_tutorial.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<producto> getAllProductos() {
        return productoService.findAll();
    }

    @GetMapping("/{id}")
    public producto getProductoById(@PathVariable int id) {
        return productoService.findById(id);
    }

    @GetMapping("/search")
    public List<producto> getProductoByNombre(@RequestParam String nombre) {
        return productoService.findByNombre(nombre);
    }

    @GetMapping("/searchByPrecio")
    public List<producto> getProductosByPrecioBetween(@RequestParam long preciomin, @RequestParam long preciomax) {
        return productoService.findByPrecioBetween(preciomin, preciomax);
    }
}