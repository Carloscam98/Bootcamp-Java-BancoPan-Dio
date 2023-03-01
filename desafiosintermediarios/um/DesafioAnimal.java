package dio.java.pan.desafiosintermediarios.um;

import java.io.IOException;
import java.util.Scanner;
public class DesafioAnimal {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String AN1, AN2, AN3;

        System.out.println("Digite: vertebrado ou invertebrado");
        AN1 = sc.nextLine();


        if (AN1.equals("vertebrado")){
            System.out.println("Digite: ave ou mamifero");

        }if (AN1.equals("invertebrado")){
            System.out.println("Digite: inseto ou anelideo");

        }
        AN2 = sc.nextLine();

        if (AN2.equals("ave")){
            System.out.println("Digite: carnivoro ou onivoro ");

        }if (AN2.equals("mamifero")){
            System.out.println("Digite: onivoro ou herbivoro");

        }if (AN2.equals("inseto")){
            System.out.println("Digite: hematofago ou herbivoro");

        }if (AN2.equals("anelideo")){
            System.out.println("Digite: hematofago ou onivoro");

        }

        AN3 = sc.nextLine();


        if (AN1.equals("vertebrado") && AN2.equals("ave") && AN3.equals("carnivoro")) {
            System.out.println("aguia");

        } else if (AN1.equals("vertebrado") && AN2.equals("ave") && AN3.equals("onivoro")) {
            System.out.println("pomba");

        } else if (AN1.equals("vertebrado") && AN2.equals("mamifero") && AN3.equals("onivoro")) {
            System.out.println("homem");

        } else if (AN1.equals("vertebrado") && AN2.equals("mamifero") && AN3.equals("herbivoro")) {
            System.out.println("vaca");

        } else if (AN1.equals("invertebrado") && AN2.equals("inseto") && AN3.equals("hematofago")) {
            System.out.println("pulga");

        } else if (AN1.equals("invertebrado") && AN2.equals("inseto") && AN3.equals("herbivoro")) {
            System.out.println("lagarta");

        } else if (AN1.equals("invertebrado") && AN2.equals("anelideo") && AN3.equals("hematofago")) {
            System.out.println("sanguessuga");

        } else{
            System.out.println("minhoca");
        }

            //TODO: Implemente as condição necessária para que seja verificado que tipo de animal é:
            //Dica: Você pode utilizar o método equals para realizar comparações.
        }
    }
