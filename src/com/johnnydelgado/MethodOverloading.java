package com.johnnydelgado;

public class MethodOverloading {
    public static double calcFeetAndInchesToCentimeters (double feet, double inches){
        if((feet >= 0) && (inches >= 0 && inches <=12)){
            double convertedFeet = (feet / 0.032808);
            double convertedInches = (inches / 0.39370);
            return convertedFeet + convertedInches;
        }else{
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0){
            return inches / 0.39370;
        }else {
            return -1;
        }
    }
}
