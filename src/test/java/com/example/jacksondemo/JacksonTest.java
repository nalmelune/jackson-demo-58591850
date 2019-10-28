package com.example.jacksondemo;

import com.example.jacksondemo.dto.Root;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.ResourceUtils;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
public class JacksonTest {
    @Test
    void shouldMapJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        Root result = mapper.readValue(
                ResourceUtils.getFile("classpath:teleCommunications.json"), Root.class);
        assertNotNull(result);
        System.out.println(result.getResults().get(0).getSalutation());
        System.out.println(result.getResults().get(0).getName());
        System.out.println(result.getResults().get(0).getZipCodeCity());
        System.out.println(result.getResults().get(0).getOpeningDate());
        System.out.println(result.getResults().get(0).getStreetHouseNumber());
    }
}
