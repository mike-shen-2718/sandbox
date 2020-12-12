package com.github.seanyinx.sandbox.tps.agent.service.domain;

import lombok.Data;

@Data
public class SqltraceDataEntity {

  private long sqlTraceId;
  private String blameMetricName;
  private String uri;
  private long sqlId;
  private String metricName;
  private int callCount;
  private float minTime;
  private float maxTime;
  private long applicationId;
  private String parameters;
  private float totalTime;
  private float avgTime;
  private String sqlInfo;
  private long recordTime;
  private long agentRunId;
  private long userId;

}
