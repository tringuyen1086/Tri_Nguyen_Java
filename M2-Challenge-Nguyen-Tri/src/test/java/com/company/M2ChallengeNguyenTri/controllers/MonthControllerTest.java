package com.company.M2ChallengeNguyenTri.controllers;

import com.company.M2ChallengeNguyenTri.models.Month;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * References: This was originally written as a part of the 01-we-record-store-back-end on October 6, 2022.
 * Please see the 01-we-record-store-back-end for the original code.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(MonthController.class)
public class MonthControllerTest {

    @Autowired
    private MockMvc mockMvc;

    // ObjectMapper used to convert Java objects to JSON and vice versa
    private ObjectMapper mapper = new ObjectMapper();

    @Before
    public void setUp() {
        // This is the standard set up method that runs before each test. It's typically used for instantiating test
        // objects. We don't have to do anything special for mockMvc since it's Autowired. We will however be using
        // setUp() in the future.
    }

    @Test
    public void shouldReturnMonthByMonthNumber() throws Exception {
        // ARRANGE
        Month outputMonth = new Month();
        outputMonth.setNumber(10);
        outputMonth.setName("October");

        // Convert Java Object to JSON.
        String outputJson = mapper.writeValueAsString(outputMonth);

        // ACT
        mockMvc.perform(get("/month/10"))           // Perform the GET request
                .andDo(print())                               // Print result to console
                .andExpect(status().isOk())                   // ASSERT (status code is 200)
                .andExpect(content().string(outputJson));     // ASSERT that what we're expecting is what we got back.
    }

    @Test
    public void shouldReturn422StatusCodeIfMonthNumberOutOfBounds() throws Exception {
        mockMvc.perform(get("/month/0"))                // Perform the GET request
                .andDo(print())                                   // Print result to console
                .andExpect(status().isUnprocessableEntity());     // ASSERT (status cod is 422)
    }


}