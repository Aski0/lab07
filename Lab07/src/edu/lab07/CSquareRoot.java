package edu.lab07;

import javax.swing.*;

public class CSquareRoot extends CRoot{
    public CSquareRoot(double number, double precision, JTextArea textArea){
        super(number,precision,textArea);
    }

    @Override
    public double calculate() {
        double x=number/2;
        double y=1;
        int step=0;
        while(Math.abs(x - y)>=precision){
        double root=(x+y)/2;
        y=number/x;
        step++;
        if (log){
            String logLine="- step: "+ step+", value: "+String.format("%.15f",x);
            textArea.append(logLine+"\n");
        }
        x=root;
        }
        return x;
    }
}
