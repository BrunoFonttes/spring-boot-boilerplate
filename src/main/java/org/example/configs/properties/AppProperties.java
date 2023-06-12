package org.example.configs.properties;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import org.example.configs.properties.spring.DataSourceProperties;
import org.example.configs.properties.spring.JpaHibernateProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Validated
@Getter
@ConfigurationProperties(prefix="app.properties")
public class AppProperties {

    @Autowired
    private JpaHibernateProperties jpaHibernateProperties;

    @Autowired
    private DataSourceProperties dataSourceProperties;

    @NotNull
    private final Boolean trace;

    public AppProperties(Boolean trace){
        this.trace = trace;
    }
}
