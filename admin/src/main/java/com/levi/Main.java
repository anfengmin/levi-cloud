package com.levi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * No explanation is needed - Levi
 *
 * @author anfm
 * Created time 2024/5/9
 * @since 1.0
 */
@Slf4j
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  admin模块启动成功   ლ(´ڡ`ლ)ﾞ");
    }
}