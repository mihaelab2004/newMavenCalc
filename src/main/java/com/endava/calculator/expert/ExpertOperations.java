package com.endava.calculator.expert;

import com.endava.calculator.basic.BasicOperations;

public interface ExpertOperations extends BasicOperations {

    public abstract double power (int base, int exponent);
    public abstract double root (int a);
    public abstract double nthRoot (int base, int exponent);
    public abstract long fact (int n);
    public abstract long factRec (int n);
    public abstract double calculate(String s);

}
