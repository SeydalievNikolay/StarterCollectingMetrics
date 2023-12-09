package ru.seydalievnikolay.springbootstartercollectingmetrics.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.seydalievnikolay.springbootstartercollectingmetrics.config.StarterCollectingMetricsProperties;

@Component
public class MetricsService {

    @Autowired
    public MetricsService(StarterCollectingMetricsProperties metricsProperties) {
    }

    private static final Logger LOG = LoggerFactory.getLogger(MetricsService.class);

    public void logMetric(String metricName) {
        LOG.info(String.format("'logMetric' call for metric: '%s'", metricName));
    }

    public void logErrorMetric(String metricName) {
        LOG.info(String.format("'logErrorMetric' call for metric: '%s'", metricName));
    }

}
