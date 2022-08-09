import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Phyton");
        curso2.setDescricao("descrição curso Phyton");
        curso2.setCargaHoraria(10);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descrição mentoria de java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucia = new Dev();
        devLucia.setNome("Lucia");
        devLucia.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devLucia.getConteudosInscritos());
        devLucia.progredir();
        devLucia.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devLucia.getConteudosInscritos());
        System.out.println("Conteudos Concluídos" + devLucia.getConteudosConcluidos());
        System.out.println("XP: " + devLucia.calcularTotalXp());

        System.out.println("---------");

        Dev devMario = new Dev();
        devMario.setNome("Mario");
        devMario.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devMario.getConteudosInscritos());
        devMario.progredir();
        devMario.progredir();
        devMario.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devMario.getConteudosInscritos());
        System.out.println("Conteudos Concluídos" + devMario.getConteudosConcluidos());
        System.out.println("XP: " + devMario.calcularTotalXp());
    }
}
