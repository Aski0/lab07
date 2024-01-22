package edu.lab07;

import javax.swing.*;

public class CCubicRoot extends CRoot{
    public CCubicRoot(double number, double precision, JTextArea textArea){
        super(number,precision,textArea);

    }


    @Override
    public double calculate() {
        double start = 0;
        double end = number;
        double mid = 0.5 * number;
        int step = 0;
        while (Math.abs(number - mid * mid * mid) > precision) {
            if (number < mid * mid * mid) {
                end = mid;
            } else {
                start = mid;
            }
            mid = (start + end) / 2;
            step++;
            if (log) {
                String logLine="- step: "+ step+", value: "+String.format("%.15f",mid);
                textArea.append(logLine + "\n");
            }
        }
        return mid;
    }
}
