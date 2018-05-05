package io.los.gringos.trashporter.api.core.service;

import io.los.gringos.trashporter.api.core.data.DataConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({
        DataConfiguration.class
})
@Configuration
public class ServiceConfiguration {
}
