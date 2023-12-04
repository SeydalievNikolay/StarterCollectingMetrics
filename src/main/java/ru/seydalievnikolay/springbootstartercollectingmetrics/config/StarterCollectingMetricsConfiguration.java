package ru.seydalievnikolay.springbootstartercollectingmetrics.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(StarterCollectingMetricsProperties.class)
public class StarterCollectingMetricsConfiguration {
}
