package com.ejemplo.jpa_tutorial.services;

import com.ejemplo.jpa_tutorial.model.producto;
import com.ejemplo.jpa_tutorial.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<producto> findAll() {
        return productoRepository.findAll();
    }

    public producto findById(int id) {
        return productoRepository.findById(id).orElse(null);
    }

    public List<producto> findByNombre(String nombre) {
        return productoRepository.findByNombreContaining(nombre);
    }

    public List<producto> findByPrecioBetween(long preciomin, long preciomax){

        return productoRepository.findByPrecioBetween(preciomin,preciomax);
    }


}

