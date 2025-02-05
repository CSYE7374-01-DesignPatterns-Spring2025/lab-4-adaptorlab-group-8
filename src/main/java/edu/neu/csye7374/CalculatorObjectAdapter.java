package edu.neu.csye7374;

import java.util.List;

public class CalculatorObjectAdapter implements AccumulatableAPI {
    private final CalculatableAPI calculator;
    private double sum;

    public CalculatorObjectAdapter(CalculatableAPI calculator) {
        this.calculator = calculator;
        this.sum = 0;
    }

    @Override
    public double accumulation(List<Double> prices) {
        sum = 0;
        for (double price : prices) {
            sum = calculator.operation(CalculatableAPI.OPERATION.ADD, sum, price);
        }
        return sum;
    }

    @Override
    public double payment(double cash) {
        return calculator.operation(CalculatableAPI.OPERATION.SUB, cash, sum);
    }
}