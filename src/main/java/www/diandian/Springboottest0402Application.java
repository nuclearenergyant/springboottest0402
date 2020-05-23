package www.diandian;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*自带的*/
@SpringBootApplication
/*扫描mapper包*/
@MapperScan(basePackages = {"www.diandian.dao"})
public class Springboottest0402Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboottest0402Application.class, args);
    }

}
