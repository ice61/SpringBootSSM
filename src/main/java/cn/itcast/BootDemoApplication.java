package cn.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Created by WIN 10 on 2019/1/18.
 */
@SpringBootApplication
//@MapperScan("cn.itcast.mapper")
@MapperScan("cn.itcast.mapper")
public class BootDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootDemoApplication.class);
    }
}
