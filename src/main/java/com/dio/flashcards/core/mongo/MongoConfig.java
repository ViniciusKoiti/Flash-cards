package com.dio.flashcards.core.mongo;

import com.dio.flashcards.core.mongo.converter.DateToOffsetDateTimeConverter;
import com.dio.flashcards.core.mongo.converter.OffSetDatetimeToDateConvertor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableMongoAuditing(dateTimeProviderRef = "dateTimeProvider")
public class MongoConfig {

    @Bean
    MongoCustomConversions mongoCustomConversions(){
        final List<Converter<?,?>> converterList = new ArrayList<>();
        converterList.add(new OffSetDatetimeToDateConvertor());
        converterList.add(new DateToOffsetDateTimeConverter());
        return new MongoCustomConversions(converterList);
    }


}
