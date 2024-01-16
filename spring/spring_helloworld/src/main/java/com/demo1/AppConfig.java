package com.demo1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*

    <context:component-scan base-package="com.demo1"/>
 */
@Configuration  //<context:annotation-config/>
@ComponentScan(basePackages = {"com.demo1"}) // <context:component-scan base-package="com.demo1"/>
public class AppConfig {
}
