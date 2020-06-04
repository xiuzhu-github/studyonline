package com.studyonline;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
	/*springboot默认集成sIf4j框架，它定义了一些日志接口，规范日志输出，真正的实现是logback或log4j。
	我们代码中写的都是slf4j的代码。NP%*/
	private static final Logger LOG = LoggerFactory.getLogger(EurekaApplication.class);

//	public static void main(String[] args) {
//		SpringApplication.run(EurekaApplication.class, args);
//	}

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(EurekaApplication.class);
		Environment env = app.run(args).getEnvironment();
		LOG.info("启动成功！！");
		LOG.info("Eureka地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
	}

}
