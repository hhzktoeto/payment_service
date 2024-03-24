package faang.school.paymentservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Configuration
public class ThreadPoolConfig {

    @Bean
    public ExecutorService executorService() {
        return Executors.newCachedThreadPool();
    }
}
