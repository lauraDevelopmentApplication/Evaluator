package com.ExpresionEvaluator.Evaluator.controller;

import com.ExpresionEvaluator.Evaluator.service.EvaluatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/evaluator")
public class EvaluatorController {

    @Autowired
    private EvaluatorService evaluatorService;

    //We are going to try to evaluate a regular expresion with a finite state machine
    @GetMapping("/{expression}")
    public String evaluate(@PathVariable String expression) {
        //We will verify with try cath that there is no error or the expression was not ok
        this.evaluatorService.evaluate(expression);
        return expression;
    }
 }
