package com.legatohealth.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {

	@Value("${spring.driver.class}")
	private String driverClass;

	@Value("${spring.user}")
	private String userName;

	@Value("${spring.password}")
	private String password;

	@Value("${spring.url}")
	private String url;

	@Bean
	public DataSource datasource() {
		return DataSourceBuilder.create().driverClassName(driverClass)
				.url(url).username(userName).password(password).build();
	}

	public String driverClass() {
		System.out.println(" driver class " + driverClass);
		return driverClass;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

}
