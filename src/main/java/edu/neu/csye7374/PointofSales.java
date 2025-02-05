package edu.neu.csye7374;

import java.util.List;

public class PointofSales {
    public static void demo(){
        CalculatableAPI calculator = new Calculator();

        // Using Object Adapter
        AccumulatableAPI objectAdapter = new CalculatorObjectAdapter(calculator);
        System.out.println("Object Adapter - Total: " + objectAdapter.accumulation(List.of(10.0, 20.0, 30.0)));
        System.out.println("Object Adapter - Payment: " + objectAdapter.payment(100.0));

        // Using Class Adapter
        AccumulatableAPI classAdapter = new CalculatorClassAdapter();
        System.out.println("Class Adapter - Total: " + classAdapter.accumulation(List.of(10.0, 20.0, 30.0)));
        System.out.println("Class Adapter - Payment: " + classAdapter.payment(100.0));
    }
}
