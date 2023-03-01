package dio.java.pan.projeto.poo.java.dominio;

import dio.java.pan.projeto.poo.java.dominio.Curso;
import dio.java.pan.projeto.poo.java.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("POO com java - Abstraindo um Bootcamp");
        curso1.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria do bootcamp");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);
        System.out.println(curso1);
    }
}
