package com.springboot.redis.demo;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Application {

    private static org.slf4j.Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
        try {
            InetAddress localInetAddress = InetAddress.getLocalHost();
            System.setProperty("address", localInetAddress.getHostName());
        } catch (UnknownHostException e) {
            System.out.println("设置本机IP失败" + e);
        }

        System.setProperty("Log4jContextSelector", "org.apache.logging.log4j.core.async.AsyncLoggerContextSelector");
        System.setProperty("AsyncLoggerConfig.RingBufferSize", "262144");
        System.setProperty("AsyncLogger.RingBufferSize", "262144");
        System.setProperty("log4j2.AsyncQueueFullPolicy", "Discard");

        logger.info("resource job service start ~~~~!");
	    SpringApplication.run(Application.class, args);
	    logger.info("start the service is ok !");
	}

}