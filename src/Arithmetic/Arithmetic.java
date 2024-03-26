package Arithmetic;

import java.util.Scanner;

public class Arithmetic <T extends Number, Y extends Number>{
    private final T num1;
    private final Y num2;

    public Arithmetic(T num1, Y num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Number add() {
        return num1.doubleValue() + num2.doubleValue();
    }

    public Number subtract() {
        return num1.doubleValue() - num2.doubleValue();
    }

    public Number multiply() {
        return num1.doubleValue() * num2.doubleValue();
    }

    public Number divide() {
        if(num2.doubleValue() == 0){
            throw new ArithmeticException("Can't divide by Zero (0). hehe");
        }
        return num1.doubleValue() / num2.doubleValue();

    }

    public Number getMin() {
       if(num1.doubleValue() < num2.doubleValue()){
           return num1.doubleValue();
       }
       return num2.doubleValue();
    }

    public Number getMax() {
        if(num1.doubleValue() > num2.doubleValue()){
            return num1.doubleValue();
        }
        return num2.doubleValue();
    }


}
