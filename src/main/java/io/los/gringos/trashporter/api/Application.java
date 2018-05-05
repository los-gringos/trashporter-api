package io.los.gringos.trashporter.api;

import io.los.gringos.trashporter.api.core.data.DataConfiguration;
import io.los.gringos.trashporter.api.core.mapper.MapperConfiguration;
import io.los.gringos.trashporter.api.core.service.ServiceConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;

@Import({
        MapperConfiguration.class,
        ServiceConfiguration.class,
        DataConfiguration.class
})
@EnableAutoConfiguration
@SpringBootConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
