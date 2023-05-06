package com.example.fuelofmars;

public class Сalculation {
    public Сalculation() {
    } //пустой конструктор

    public String calculation (String input) //метод расчета количества топлива
    {double weight=Double.parseDouble(input);
        float gEarth=9.80665f;
        float gMars=3.721f;
        String fuelMars=String.valueOf(weight*100/gEarth*gMars);

    return fuelMars;};

}
