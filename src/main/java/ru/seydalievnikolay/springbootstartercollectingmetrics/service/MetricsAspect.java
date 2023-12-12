package ru.seydalievnikolay.springbootstartercollectingmetrics.service;

public interface MetricsAspect {
    void afterReturningMetricMethod();
    void afterThrowingMetricMethod();
}
