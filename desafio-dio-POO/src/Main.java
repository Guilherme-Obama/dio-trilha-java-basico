import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGuilherme = new Dev();
        devGuilherme.setNome("Guilherme");
        devGuilherme.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Guilherme" + devGuilherme.getConteudosInscritos());
        devGuilherme.progredir();
        devGuilherme.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Guilherme" + devGuilherme.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Guilherme" + devGuilherme.getConteudosConcluidos());
        System.out.println("XP: " + devGuilherme.calcularTotalXP());

        System.out.println("-------");

        Dev devManuela = new Dev();
        devManuela.setNome("Manuela");
        devManuela.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Manuela" + devManuela.getConteudosInscritos());
        devManuela.progredir();
        devManuela.progredir();
        devManuela.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Manuela" + devManuela.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Manuela" + devManuela.getConteudosConcluidos());
        System.out.println("XP: " + devManuela.calcularTotalXP());
    }
}