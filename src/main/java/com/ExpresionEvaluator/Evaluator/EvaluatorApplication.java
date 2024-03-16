package com.ExpresionEvaluator.Evaluator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.ExpresionEvaluator.Evaluator.model.*;
import org.springframework.statemachine.StateMachine;

@SpringBootApplication
public class EvaluatorApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EvaluatorApplication.class, args);
    }

    @Autowired
    private StateMachine<States, Events> stateMachine;

    @Override
    public void run(String... args) throws Exception {
        stateMachine.sendEvent(Events.E1);
    }
}
