package core;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.codec.json.Jackson2JsonDecoder;
import org.springframework.http.codec.json.Jackson2JsonEncoder;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@Configuration
public class JacksonConfig {

    @Bean
    ObjectMapper objectMapper(){
        return new ObjectMapper()
                .registerModule(new JavaTimeModule())
                .setSerializationInclusion(NON_NULL)
                .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
                .configure(SerializationFeature.FAIL_ON_SELF_REFERENCES, false)
                .configure(SerializationFeature.WRITE_SELF_REFERENCES_AS_NULL, false);
    }

    @Bean
    Jackson2JsonDecoder jackson2JsonDecoder(final ObjectMapper objectMapper){
        return new Jackson2JsonDecoder(objectMapper);
    }

    @Bean
    Jackson2JsonEncoder jackson2JsonEncoder(final ObjectMapper objectMapper){
        return new Jackson2JsonEncoder(objectMapper);
    }
}
