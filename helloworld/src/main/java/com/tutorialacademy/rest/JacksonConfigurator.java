//package com.tutorialacademy.rest;
//
//import java.text.SimpleDateFormat;
//import java.util.TimeZone;
//
//import javax.ws.rs.Produces;
//import javax.ws.rs.ext.ContextResolver;
//import javax.ws.rs.ext.Provider;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//
//@Provider
//@Produces("application/json")
//public class JacksonConfigurator implements ContextResolver<ObjectMapper> {
//
//    public JacksonConfigurator() {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
//        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
//        mapper.setDateFormat(dateFormat);
//        mapper.configure(SerializationConfig.Feature.WRITE_DATES_AS_TIMESTAMPS, false);
//    }
//
//    @Override
//    public ObjectMapper getContext(Class<?> clazz) {
//        return mapper;
//    }
//
//    private final ObjectMapper mapper = new ObjectMapper();
//}