package io.los.gringos.trashporter.api.core.data;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackageClasses = {DataConfiguration.class})
public class DataConfiguration {
}
