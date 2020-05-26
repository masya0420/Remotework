package mrs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.extras.java8time.dialect.Java8TimeDialect;

/*
 * spring-boot1.4.0からDialectをDIコンテナへ登録する設定は不要となった
 * https://qiita.com/su-kun1899/items/399884d15e17dc8e2eb1
 */
@Configuration
public class ThymeleafConfig {

    @Bean
    public Java8TimeDialect java8TimeDialect() {
        return new Java8TimeDialect();
    }
}
