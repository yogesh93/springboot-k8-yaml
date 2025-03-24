package com.javatechie.k8s;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(SpringApplicationDemo.class)
class SpringApplicationDemoTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testGetRecentReviewDashboard() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/test/yogesh")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Test content"));
    }

    @Test
    void testGetCall() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/test/yogesh/get")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("GET content"));
    }

    @Test
    void testMainMethod() {
        // Test the main method
        SpringApplicationDemo.main(new String[]{});
    }
    

    @Test
    void contextLoads() {
    }

}