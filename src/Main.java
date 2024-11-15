import java.time.LocalDate;

import dio.desafio.Bootcamp;
import dio.desafio.Curso;
import dio.desafio.Dev;
import dio.desafio.Mentoria;

public class Main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("curso de java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("curso de javascript");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("Mentoria de java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDavi = new Dev();
        devDavi.setNome("Davi");
        devDavi.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devDavi.getConteudosInscritos());
        devDavi.progredir();
        devDavi.progredir();
        devDavi.progredir();

        System.out.println("Conteúdos Inscritos: " + devDavi.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devDavi.getConteudosConcluidos());
        System.out.println("XP: " + devDavi.calcularTotalXp());

        Dev devLivia = new Dev();
        devLivia.setNome("Lívia");
        devLivia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devLivia.getConteudosInscritos());
        devLivia.progredir();

        System.out.println("Conteúdos Inscritos: " + devLivia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devLivia.getConteudosConcluidos());
        System.out.println("XP: " + devLivia.calcularTotalXp());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/
    }
}
