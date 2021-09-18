package com.digital.innovation.one.springbootconfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @Value("${app.message}")
    private String appMessage;

    //export ENV_DB_URL=jdbc:h2:mem:db;DB_CLOSE_DELAY=-1
    @Value("${ENV_DB_URL:NENHUMA}")
    private String dbEnvironmentVariable;

    @GetMapping("/")
    public String getAppMessage(){
        return appMessage;
    }


    @GetMapping("/envVariable")
    public String getEnvironmentVariable(){
        return "A seguinte variavel de ambiente foi passada: " + dbEnvironmentVariable;
    }
}
