package exhibitmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Hello world!
 *
 */
///home/student/Documents/exhibitmanagement/src/main/resources/hibernate.cfg.xml
@Configuration
@ComponentScan(basePackages = "exhibitmanagement")
@EnableWebMvc
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EnableJpaRepositories
@PropertySource("classpath:application.properties")
@EnableTransactionManagement
@ImportResource({ "classpath:hibernate.cfg.xml" })
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        try {
            System.out.println(Class.forName("org.postgresql.Driver"));
        } catch (ClassNotFoundException ex) {
            // Log or abort here
        }
        System.out.println(System.getProperty("java.class.path"));
        System.out.println( "Hello World!" );
        SpringApplication.run(App.class, args);
    }
}

