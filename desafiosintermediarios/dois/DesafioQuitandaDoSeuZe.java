package dio.java.pan.desafiosintermediarios.dois;

import java.util.*;
public class DesafioQuitandaDoSeuZe{


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();

        double totalMorangos, totalMacas, totalCompra;

        if(morangos <= 5){
            totalMorangos = morangos * 2.5;
        }else{
            totalMorangos = morangos * 2.2;
        }

        if(macas <= 5){
            totalMacas = macas * 1.8;
        }else{
            totalMacas = macas * 1.5;
        }

        if((totalMacas + totalMorangos) > 25.0 || (morangos + macas) > 8 ){

            totalCompra = (totalMorangos + totalMacas) * 0.9;
        }else{
            totalCompra = totalMorangos + totalMacas;
        }
        System.out.println(totalCompra);
    }
}
