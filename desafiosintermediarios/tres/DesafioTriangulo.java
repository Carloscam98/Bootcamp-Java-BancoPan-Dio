package dio.java.pan.desafiosintermediarios.tres;


import java.io.IOException;
import java.util.Scanner;

public class DesafioTriangulo{

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Lado 1:");
        double A = leitor.nextDouble();
        System.out.println("Lado 2:");
        double B = leitor.nextDouble();
        System.out.println("Lado 3:");
        double C = leitor.nextDouble();
        double area;
        double soma;
        boolean triangulo;

        if(A < B + C && B < A + C && C < A + B){

            soma = A + B + C;
            System.out.println(String.format("Perimetro = %.1f" , soma));

        }else{
            area = ((A + B) * C)/2;
            System.out.println(String.format("Area = %.1f" , area));

        }

    }

}