package com.dio.flashcards.mongo.converter;


import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;
import java.util.Date;

@Component
public class DateToOffsetDateTimeConverter implements Converter<OffsetDateTime, Date> {
    @Override
    public Date convert(OffsetDateTime source) {
        return Date.from(source.toInstant());
    }
}
