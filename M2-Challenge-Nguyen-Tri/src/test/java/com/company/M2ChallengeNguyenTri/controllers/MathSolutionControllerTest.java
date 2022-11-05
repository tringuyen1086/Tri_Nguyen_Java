package com.company.M2ChallengeNguyenTri.controllers;

import com.company.M2ChallengeNguyenTri.models.MathSolution;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * References: This was originally written as a part of the 01-we-record-store-back-end on October 6, 2022.
 * Please see the 01-we-record-store-back-end for the original code.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(MathSolutionController.class)
public class MathSolutionControllerTest {

    @Autowired
    private MockMvc mockMvc;

    // ObjectMapper used to convert Java objects to JSON and vice versa
    private ObjectMapper mapper = new ObjectMapper();
    private MathSolution inputOperand;
    private MathSolution outputOperand;

    @Before
    public void setUp() {
        // This is the standard set up method that runs before each test. It's typically used for instantiating test
        // objects. We don't have to do anything special for mockMvc since it's Autowired. We will however be using
        // setUp() in the future.
        inputOperand = new MathSolution();
        outputOperand = new MathSolution();
    }

    @Test
    public void shouldReturn422StatusCodeForInputTypeOfZeroInAddition() throws Exception{
        // ARRANGE
        inputOperand.setOperand1(0);
        inputOperand.setOperand2(0);
        inputOperand.setOperation("add");
        inputOperand.setAnswer();

        // Convert Java Object to JSON.
        String inputJson = mapper.writeValueAsString(inputOperand);

        // ACT
        mockMvc.perform(
                post("/add")                                    // Perform the POST request.
                        .content(inputJson)                               // Set the request body.
                        .contentType(MediaType.APPLICATION_JSON)          // Tell the server it's in JSON format.
                )
                .andDo(print())                                           // Print results to console.
                .andExpect(status().isUnprocessableEntity());             // ASSERT (status code is 422)

    }

    @Test
    public void shouldReturn422StatusCodeForInputTypeOfZeroInSubtraction() throws Exception{
        // ARRANGE
        inputOperand.setOperand1(0);
        inputOperand.setOperand2(0);
        inputOperand.setOperation("subtract");
        inputOperand.setAnswer();

        // Convert Java Object to JSON.
        String inputJson = mapper.writeValueAsString(inputOperand);

        // ACT
        mockMvc.perform(
            post("/subtract")                               // Perform the POST request.
                    .content(inputJson)                               // Set the request body.
                    .contentType(MediaType.APPLICATION_JSON)          // Tell the server it's in JSON format.
                )
                .andDo(print())                                       // Print results to console.
                .andExpect(status().isUnprocessableEntity());         // ASSERT (status code is 422)
    }

    @Test
    public void shouldReturn422StatusCodeForInputTypeOfZeroInMultiplication() throws Exception{
        // ARRANGE
        inputOperand.setOperand1(0);
        inputOperand.setOperand2(0);
        inputOperand.setOperation("multiply");
        inputOperand.setAnswer();

        // Convert Java Object to JSON.
        String inputJson = mapper.writeValueAsString(inputOperand);

        // ACT
        mockMvc.perform(
                post("/multiply")                               // Perform the POST request.
                        .content(inputJson)                               // Set the request body.
                        .contentType(MediaType.APPLICATION_JSON)          // Tell the server it's in JSON format.
                )
                .andDo(print())                                           // Print results to console.
                .andExpect(status().isUnprocessableEntity());             // ASSERT (status code is 422)
    }

    @Test
    public void shouldReturn422StatusCodeForInputTypeOfZeroInDivision()throws Exception{
        // ARRANGE
        inputOperand.setOperand1(0);
        inputOperand.setOperand2(0);
        inputOperand.setOperation("divide");

        // Convert Java Object to JSON.
        String inputJson = mapper.writeValueAsString(inputOperand);

        // ACT
        mockMvc.perform(
                post("/divide")                                 // Perform the POST request.
                        .content(inputJson)                               // Set the request body.
                        .contentType(MediaType.APPLICATION_JSON)          // Tell the server it's in JSON format.
                )
                .andDo(print())                                           // Print results to console.
                .andExpect(status().isUnprocessableEntity());             // ASSERT (status code is 422)
    }

    @Test
    public void shouldReturn422StatusCodeForStringInputs() throws Exception{
        // ARRANGE
        Map<String, String> inputOperand = new HashMap<>();
        inputOperand.put("operand1", "10");
        inputOperand.put("operand2", "It's a string, not an Integer.");

        // Convert Java Object to JSON.
        String inputJson = mapper.writeValueAsString(inputOperand);

        // ACT
        mockMvc.perform(
                post("/add")                                    // Perform the POST request.
                        .content(inputJson)                               // Set the request body.
                        .contentType(MediaType.APPLICATION_JSON)          // Tell the server it's in JSON format.
                )
                .andDo(print())                                           // Print results to console.
                .andExpect(status().isUnprocessableEntity());             // ASSERT (status code is 422)
    }

    @Test
    public void shouldReturn422StatusCodeForStringInputsInSubtraction() throws Exception{
        // ARRANGE
        Map<String, String> inputOperand = new HashMap<>();
        inputOperand.put("operand1", "10");
        inputOperand.put("operand2", "It's a string, not an Integer.");

        // Convert Java Object to JSON.
        String inputJson = mapper.writeValueAsString(inputOperand);

        // ACT
        mockMvc.perform(
                post("/subtract")                               // Perform the POST request.
                        .content(inputJson)                               // Set the request body.
                        .contentType(MediaType.APPLICATION_JSON)          // Tell the server it's in JSON format.
                )
                .andDo(print())                                           // Print results to console.
                .andExpect(status().isUnprocessableEntity());             // ASSERT (status code is 422)
    }

    @Test
    public void shouldReturn422StatusCodeForStringInputsInMultiplication() throws Exception{
        // ARRANGE
        Map<String, String> inputOperand = new HashMap<>();
        inputOperand.put("operand1", "10");
        inputOperand.put("operand2", "It's a string, not an Integer.");

        // Convert Java Object to JSON.
        String inputJson = mapper.writeValueAsString(inputOperand);

        // ACT
        mockMvc.perform(
                post("/multiply")                               // Perform the POST request.
                        .content(inputJson)                               // Set the request body.
                        .contentType(MediaType.APPLICATION_JSON)          // Tell the server it's in JSON format.
                )
                .andDo(print())                                           // Print results to console.
                .andExpect(status().isUnprocessableEntity());             // ASSERT (status code is 422)
    }

    @Test
    public void shouldReturn422StatusCodeForStringInputsDivide() throws Exception{
        // ARRANGE
        Map<String, String> inputOperand = new HashMap<>();
        inputOperand.put("operand1", "10");
        inputOperand.put("operand2", "It's a string, not an Integer.");

        // Convert Java Object to JSON.
        String inputJson = mapper.writeValueAsString(inputOperand);

        // ACT
        mockMvc.perform(
                post("/divide")                                 // Perform the POST request.
                        .content(inputJson)                               // Set the request body.
                        .contentType(MediaType.APPLICATION_JSON)          // Tell the server it's in JSON format.
                )
                .andDo(print())                                           // Print results to console.
                .andExpect(status().isUnprocessableEntity());             // ASSERT (status code is 422)
    }

    @Test
    public void shouldReturnSumOfOperands() throws Exception{
        // ARRANGE
        inputOperand.setOperand1(10);
        inputOperand.setOperand2(20);

        // Convert Java Object to JSON.
        String inputJson = mapper.writeValueAsString(inputOperand);

        outputOperand.setOperand1(10);
        outputOperand.setOperand2(20);
        outputOperand.setOperation("add");
        outputOperand.setAnswer();

        String outputJson = mapper.writeValueAsString(outputOperand);

        // ACT
        mockMvc.perform(
                post("/add")                                    // Perform the POST request.
                        .content(inputJson)                               // Set the request body.
                        .contentType(MediaType.APPLICATION_JSON)          // Tell the server it's in JSON format.
                )
                .andDo(print())                                 // Print results to console.
                .andExpect(status().isCreated())                // ASSERT (status code is 201)
                .andExpect(content().json(outputJson));         // ASSERT that what we're expecting is what we got back.
    }

    @Test
    public void shouldReturnDifferenceOfOperands() throws Exception{
        // ARRANGE
        inputOperand.setOperand1(10);
        inputOperand.setOperand2(20);

        // Convert Java Object to JSON.
        String inputJson = mapper.writeValueAsString(inputOperand);

        outputOperand.setOperand1(10);
        outputOperand.setOperand2(20);
        outputOperand.setOperation("subtract");
        outputOperand.setAnswer();

        String outputJson = mapper.writeValueAsString(outputOperand);

        // ACT
        mockMvc.perform(
                post("/subtract")                               // Perform the POST request.
                        .content(inputJson)                               // Set the request body.
                        .contentType(MediaType.APPLICATION_JSON)          // Tell the server it's in JSON format.
                )
                .andDo(print())                                 // Print results to console.
                .andExpect(status().isCreated())                // ASSERT (status code is 201)
                .andExpect(content().json(outputJson));         // ASSERT that what we're expecting is what we got back.
    }

    @Test
    public void shouldReturnMultiplicationOfOperands() throws Exception{
        // ARRANGE
        inputOperand.setOperand1(10);
        inputOperand.setOperand2(20);

        // Convert Java Object to JSON.
        String inputJson = mapper.writeValueAsString(inputOperand);

        outputOperand.setOperand1(10);
        outputOperand.setOperand2(20);
        outputOperand.setOperation("multiply");
        outputOperand.setAnswer();

        String outputJson = mapper.writeValueAsString(outputOperand);

        // ACT
        mockMvc.perform(
                post("/multiply")                               // Perform the POST request.
                        .content(inputJson)                               // Set the request body.
                        .contentType(MediaType.APPLICATION_JSON)          // Tell the server it's in JSON format.
                )
                .andDo(print())                                 // Print results to console.
                .andExpect(status().isCreated())                // ASSERT (status code is 201)
                .andExpect(content().json(outputJson));         // ASSERT that what we're expecting is what we got back.
    }
    @Test
    public void shouldReturnDivisionOfOperands() throws Exception{
        // ARRANGE
        inputOperand.setOperand1(10);
        inputOperand.setOperand2(20);

        // Convert Java Object to JSON.
        String inputJson = mapper.writeValueAsString(inputOperand);

        outputOperand.setOperand1(10);
        outputOperand.setOperand2(20);
        outputOperand.setOperation("divide");
        outputOperand.setAnswer();

        String outputJson = mapper.writeValueAsString(outputOperand);

        // ACT
        mockMvc.perform(
                post("/divide")                                 // Perform the POST request.
                        .content(inputJson)                               // Set the request body.
                        .contentType(MediaType.APPLICATION_JSON)          // Tell the server it's in JSON format.
                )
                .andDo(print())                                 // Print results to console.
                .andExpect(status().isCreated())                // ASSERT (status code is 201)
                .andExpect(content().json(outputJson));         // ASSERT that what we're expecting is what we got back.
        }

}