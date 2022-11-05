package com.company.M2ChallengeNguyenTri.controllers;



import com.company.M2ChallengeNguyenTri.models.Month;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class RandomMonthController {

    private static List<Month> monthList = new ArrayList<>(Arrays.asList(
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

    @RequestMapping(value = "/randomMonth", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Month getARandomMonth() {
        Random randomNumberGenerator = new Random();
        int randomMonth= randomNumberGenerator.nextInt(monthList.size());
        return monthList.get(randomMonth);
    }


}
