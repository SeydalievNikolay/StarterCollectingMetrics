package ru.seydalievnikolay.springbootstartercollectingmetrics.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import ru.seydalievnikolay.springbootstartercollectingmetrics.service.LogMetrics;
import ru.seydalievnikolay.springbootstartercollectingmetrics.service.MetricsService;

@ConfigurationProperties(prefix = "spring-boot-starter-collecting-metrics")
public class StarterCollectingMetricsProperties{
    private String metricName;
}
