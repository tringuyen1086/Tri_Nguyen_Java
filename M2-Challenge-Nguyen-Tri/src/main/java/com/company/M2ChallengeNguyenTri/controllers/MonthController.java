package com.company.M2ChallengeNguyenTri.controllers;


import com.company.M2ChallengeNguyenTri.models.Month;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.webjars.NotFoundException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MonthController {
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

    @RequestMapping(value = "/month/{monthNumber}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)

    public Month getAMonthByMonthNumber (@PathVariable int monthNumber) {
        Month lookedUpMonth = null;

        for (Month month : monthList) {
            if (month.getNumber() == monthNumber) {
                lookedUpMonth = month;
                break;
            }
        }

        if (lookedUpMonth == null) {
            throw new NotFoundException("Month not found in collection.");
        }

        return lookedUpMonth;
    }
}
