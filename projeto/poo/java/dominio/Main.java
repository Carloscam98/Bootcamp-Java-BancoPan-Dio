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

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Banco de Dados : MySQL");
        curso2.setDescricao("Estudando banco de dados com SQL");
        curso2.setCargaHoraria(9);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria do bootcamp");
        mentoria.setData(LocalDate.now());

        /*System.out.println(mentoria);
        System.out.println(curso1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Banco PAN Java Developer");
        bootcamp.setDescricao("Bootcamp realizado em parceria com o Banco PAN, buscando colaborar com a comunidade tech do Brasil");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos Morato");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Carlos:" + devCarlos.getConteudosInscritos());
        devCarlos.progredir();
        devCarlos.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Carlos:" + devCarlos.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Carlos:" + devCarlos.getConteudosConcluidos());
        System.out.println("XP:" + devCarlos.calcularTotalXp());


    }
}
