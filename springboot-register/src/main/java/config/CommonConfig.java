package config;

import cn.itcast.pojo.Country;
import cn.itcast.pojo.Province;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonConfig {

    @ConditionalOnProperty(prefix = "country", name = {"name", "system"})
    @Bean
    public Country country(@Value("${country.name}") String name, @Value("${country.system}") String system){
        Country country = new Country();
        country.setName(name);
        country.setSystem(system);
        return country;
    }

//    @ConditionalOnMissingBean(Country.class)
    @ConditionalOnClass(name = "org.springframework.web.servlet.DispatcherServlet")
    @Bean
    public Province province(){
        System.out.println("province:");
        return new Province();
    }

}
