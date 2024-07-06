import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setCargaHorario(10);
        curso1.setDescricao("Curso de Java basico");
        System.out.println(curso1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria do curso de Java");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Um bootcamp focado em desenvolvimento Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devIsllas = new Dev();
        devIsllas.setNome("Isllas");
        devIsllas.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos "+devIsllas.getConteudosIncritos());
        devIsllas.progredir();
        devIsllas.progredir();
        System.out.println("Conteudos inscritos "+devIsllas.getConteudosIncritos());
        System.out.println("Conteudos concluidos "+devIsllas.getConteudosConcluidos());
        System.out.println("XP: "+devIsllas.calcularTotalxp());
        System.out.println("-------------------------------------");

        Dev devDavi = new Dev();
        devDavi.setNome("Davi");
        devDavi.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: "+ devDavi.getConteudosIncritos());
        devDavi.progredir();
        devDavi.progredir();
        System.out.println("Conteudos Inscritos: "+ devDavi.getConteudosIncritos());
        System.out.println("Conteudos concluidos "+devDavi.getConteudosConcluidos());
        System.out.println("XP: "+devDavi.calcularTotalxp());


    }

}
