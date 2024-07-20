package com.ejemplo.jpa_tutorial;

import com.ejemplo.jpa_tutorial.model.producto;
import com.ejemplo.jpa_tutorial.repositories.ProductoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class basededatos {

    @Bean
    CommandLineRunner initDatabase(ProductoRepository repository) {
        return args -> {
            repository.save(new producto(1101, "Laptop", "Laptop de alta gama", 1500L));
            repository.save(new producto(1102, "Smartphone", "Smartphone con cámara de 48MP", 700L));
            repository.save(new producto(1103, "Monitor", "Monitor 4K de 27 pulgadas", 300L));
            repository.save(new producto(1104, "Teclado", "Teclado mecánico retroiluminado", 100L));
            repository.save(new producto(1105, "Mouse", "Mouse inalámbrico ergonómico",50L));
        
        };
    }
    
    
}
