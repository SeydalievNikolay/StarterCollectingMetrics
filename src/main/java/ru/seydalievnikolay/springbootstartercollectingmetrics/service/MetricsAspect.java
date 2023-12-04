package ru.seydalievnikolay.springbootstartercollectingmetrics.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.awt.image.SampleModel;

@Aspect
@Component
@EnableAspectJAutoProxy
public class MetricsAspect {
    private static final Logger LOG = LoggerFactory.getLogger(MetricsService.class);
    private final MetricsService metricsService;

    @Autowired
    public MetricsAspect(MetricsService metricsService) {
        this.metricsService = metricsService;
    }
    @Pointcut("execution(@ru.seydalievnikolay.springbootstartercollectingmetrics.service.LogMetrics * *(..))" +
            " && @annotation(logMetrics)")
    private void logMetricAnnotatedPointcut(LogMetrics logMetrics) {

    }

    @AfterReturning(value = "logMetricAnnotatedPointcut(logMetrics)",
            argNames = "jp, logMetrics")
    public void afterReturningMetricMethod(JoinPoint jp, LogMetrics logMetrics) {
        MethodSignature methodSignature = (MethodSignature)jp.getSignature();
        LOG.info(String.format("@AfterReturning advice called for method: '%s'", methodSignature.getMethod()));
        metricsService.logMetric(logMetrics.value());
    }

    @AfterThrowing(value = "logMetricAnnotatedPointcut(logMetrics)",
            argNames = "joinPoint, logMetrics")
    public void afterThrowingMetricMethod(JoinPoint jp, LogMetrics logMetrics) {
        MethodSignature methodSignature = (MethodSignature)jp.getSignature();
        LOG.info(String.format("@AfterThrowing advice called for method: '%s'", methodSignature.getMethod()));
        metricsService.logErrorMetric(logMetrics.value());
    }
}
