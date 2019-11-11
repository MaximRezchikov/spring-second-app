package com.springapp.quoters.quoter;

import com.springapp.quoters.annotations.DeprecatedClass;
import com.springapp.quoters.annotations.InjectRandomInt;
import com.springapp.quoters.annotations.PostProxy;
import com.springapp.quoters.annotations.Profiling;

import javax.annotation.PostConstruct;

@Profiling
@DeprecatedClass(newImpl = T1000.class)
public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    private String message;

    @PostConstruct
    public void init() {
        System.out.println("Phase 2");
        System.out.println(repeat);
    }

    public TerminatorQuoter() {
        System.out.println("Phase 1");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    @PostProxy
    public void sayQuote() {
        System.out.println("3 phase");
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }
}






