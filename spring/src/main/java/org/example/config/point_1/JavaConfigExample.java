package org.example.config.point_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigExample {

    @Bean
    public Store store(Product product){
        return new Store(product);
    }

    @Bean
    public Product product(){
        return new ProductImp();
    }
}
