package com.ejemplo.jpa_tutorial.repositories;

import com.ejemplo.jpa_tutorial.model.producto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductoRepository extends JpaRepository<producto, Integer>  {

    List<producto> findByNombreContaining(String nombre);
    List<producto> findByPrecioBetween(long preciomin, long preciomax);

    
    
}
