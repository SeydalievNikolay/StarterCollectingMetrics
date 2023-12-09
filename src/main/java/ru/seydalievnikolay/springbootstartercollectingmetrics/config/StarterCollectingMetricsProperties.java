package ru.seydalievnikolay.springbootstartercollectingmetrics.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@ConfigurationProperties(prefix = "spring-boot-starter-collecting-metrics")
public class StarterCollectingMetricsProperties{
    private String metricName;

}
