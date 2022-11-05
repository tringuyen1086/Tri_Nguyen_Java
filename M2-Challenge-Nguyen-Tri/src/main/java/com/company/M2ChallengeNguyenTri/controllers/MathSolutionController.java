package com.company.M2ChallengeNguyenTri.controllers;

import com.company.M2ChallengeNguyenTri.models.MathSolution;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class MathSolutionController {

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution createAnAddition(@RequestBody @Valid  MathSolution math) {

        math = new MathSolution(math.getOperand1(), math.getOperand2(), "add", math.getOperand1() + math.getOperand2());

        if (math.getOperand1() == 0 || math.getOperand2() == 0){
            System.out.println("your input is Zero");
            throw new IllegalArgumentException("Please enter a non-zero integer for the operation");
        }
        if (math.equals("null")){
            throw new IllegalArgumentException("This can't be null. Please enter a non-zero integer.");
        }
        return math;
    }


    @RequestMapping(value = "/subtract", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution createASubtraction(@RequestBody @Valid  MathSolution math) {
        math = new MathSolution(math.getOperand1(), math.getOperand2(), "subtract", math.getOperand1() - math.getOperand2());
        if (math.getOperand1() == 0 || math.getOperand2() == 0){
            System.out.println("your input is Zero");
            throw new IllegalArgumentException("Please enter a non-zero integer for the operation");
        }
        if (math.equals("null")){
            throw new IllegalArgumentException("This can't be null. Please enter a non-zero integer.");
        }
        return math;
    }


    @RequestMapping(value = "/multiply", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution createAMultiplication(@RequestBody @Valid  MathSolution math) {
        math = new MathSolution(math.getOperand1(), math.getOperand2(), "multiply", math.getOperand1() * math.getOperand2());
        if (math.getOperand1() == 0 ||math.getOperand2() == 0){
            System.out.println("your input is Zero");
            throw new IllegalArgumentException("Please enter a non-zero integer for the operation");
        }
        if (math.equals("null")){
            throw new IllegalArgumentException("This can't be null. Please enter a non-zero integer.");
        }
        return math;
    }

    @RequestMapping(value = "/divide", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution createADivision(@RequestBody @Valid  MathSolution math) {
        math = new MathSolution(math.getOperand1(), math.getOperand2(), "divide", math.getOperand1()/math.getOperand2());
        if (math.getOperand1() == 0 || math.getOperand2() == 0){
            System.out.println("your input is Zero");
            throw new IllegalArgumentException("Please enter a non-zero integer for the operation");
        }
        if (math.equals("null")){
            throw new IllegalArgumentException("This can't be null. Please enter a non-zero integer.");
        }
        return math;
    }

}
