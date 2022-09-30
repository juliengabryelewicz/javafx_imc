package com.juliengabryelewicz.imc;

public class ImcModel {

    public static double imcCalculate(double weight, double height){

        return weight / Math.pow(height/100, 2);

    }

    public static String getImcText(double imc){

        String result = "";

        if(imc < 18.5){
            result = "Maigreur";
        } else if(imc >= 18.5 && imc <= 25){
            result = "Corpulence normale";
        } else if(imc > 25 && imc <= 30){
            result = "Surpoids";
        } else if(imc > 30 && imc <= 35){
            result = "Obésité modérée";
        } else if(imc > 35 && imc <= 40){
            result = "Obésité sévère";
        } else if(imc > 40){
            result = "Obésité morbide";
        }

        return result;

    }

}
