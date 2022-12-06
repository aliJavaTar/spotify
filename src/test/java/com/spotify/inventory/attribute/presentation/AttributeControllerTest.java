package com.spotify.inventory.attribute.presentation;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.inventory.attribute.domain.Attribute;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
class AttributeControllerTest {
    private MockMvc mock;

    @Test
    void shouldCreateAttribute() throws Exception {
        Attribute request = Attribute.createAttribute("good", "best");
        Attribute attribute = Attribute.createAttribute("good", "best");

        this.mock.perform(MockMvcRequestBuilders
                        .post("/attributes/api-v1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(request)))
                .andExpect(status().isOk())
                .andExpect(content().string(String.valueOf(attribute)));
    }
}