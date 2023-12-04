package ru.seydalievnikolay.springbootstartercollectingmetrics.service;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.aspectj.lang.annotation.Aspect;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
public class MetricsService {
    private static final Logger LOG = LoggerFactory.getLogger(MetricsService.class);

    public void logMetric(String metricName) {
        LOG.info(String.format("'logMetric' call for metric: '%s'", metricName));
    }

    public void logErrorMetric(String metricName) {
        LOG.info(String.format("'logErrorMetric' call for metric: '%s'", metricName));
    }
}
