package com.company.M2ChallengeNguyenTri.controllers;

import com.company.M2ChallengeNguyenTri.models.Month;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * References: This was originally written as a part of the 01-we-record-store-back-end on October 6, 2022.
 * Please see the 01-we-record-store-back-end for the original code.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(MathSolutionController.class)
public class RandomMonthControllerTest {
    @Autowired
    private MockMvc mockMvc;

    // ObjectMapper used to convert Java objects to JSON and vice versa
    private ObjectMapper mapper = new ObjectMapper();

    @Before
    public void setUp() throws JsonProcessingException {
        // This is the standard set up method that runs before each test. It's typically used for instantiating test
        // objects. We don't have to do anything special for mockMvc since it's Autowired. We will however be using
        // setUp() in the future.
    }

    @Test
    public void shouldReturnARandomMonth() throws Exception {
        // ARRANGE
        List<Month> monthList = new ArrayList<>(Arrays.asList(
                new Month(1,"January"),
                new Month(2, "February"),
                new Month(3,"March"),
                new Month(4,"April"),
                new Month(5,"May"),
                new Month(6,"June"),
                new Month(7,"July"),
                new Month(8,"August"),
                new Month(9,"September"),
                new Month(10,"October"),
                new Month(11,"November"),
                new Month(12,"December")
        ));
        Random randomMonthNumber =new Random();

        int randomMonth = randomMonthNumber.nextInt(monthList.size());

        // Convert Java Object to JSON.
        String inputJson = mapper.writeValueAsString(randomMonth);

        // ACT
        mockMvc.perform(get("/randomMonth")              // Perform the GET request.
                .content(inputJson)
                )
                .andDo(print())                                   // Print results to console.
                .andReturn();
        // ASSERT
        assertTrue(monthList.get(randomMonth).getName(), true);
    }

}