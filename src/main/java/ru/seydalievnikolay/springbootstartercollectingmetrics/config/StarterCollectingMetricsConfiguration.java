package ru.seydalievnikolay.springbootstartercollectingmetrics.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.seydalievnikolay.springbootstartercollectingmetrics.service.MetricsService;

@Configuration
@EnableConfigurationProperties(StarterCollectingMetricsProperties.class)
public class StarterCollectingMetricsConfiguration {
    @Bean
    public MetricsService metricsService(StarterCollectingMetricsProperties metricsProperties) {
        return new MetricsService(metricsProperties);
    }
}
