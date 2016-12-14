CREATE TABLE `sqltrace_data_entity` (
  `sql_trace_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `blame_metric_name` varchar(500) NOT NULL,
  `uri` varchar(500) DEFAULT NULL,
  `sql_id` bigint(20) NOT NULL,
  `metric_name` varchar(500) NOT NULL,
  `call_count` int(11) NOT NULL,
  `min_time` float(10) NOT NULL,
  `max_time` float(10) NOT NULL,
  `application_id` bigint(20) NOT NULL,
  `parameters` text NOT NULL,
  `total_time` float(10) NOT NULL,
  `avg_time` float(10) NOT NULL,
  `sql_info` text NOT NULL,
  `record_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `agent_run_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL DEFAULT '0',
  PRIMARY KEY (`sql_trace_id`),
  KEY `i_appid_agentid_time_name` (`application_id`,`agent_run_id`,`record_time`,`metric_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;