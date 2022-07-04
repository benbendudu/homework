package com.geektime.springbucks.config;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;

/**
 * @Auther:hongjingjing
 * @Date:2022/7/3-07-03-16:11
 * @Description:com.geektime.springbucks.config
 * @vision:1.0
 */

@Controller
@Data
@Configuration
@EnableAutoConfiguration
@EnableApolloConfig
public class DemoConfiguration {
    @Value("${timeout}")
    private String timeOut;
}