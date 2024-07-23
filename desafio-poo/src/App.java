import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        
        var menu = """
                    .
                    .........................................................................
                    ██████╗  ██████╗  ██████╗ ████████╗ ██████╗ █████╗ ███╗   ███╗██████╗ 
                    ██╔══██╗██╔═══██╗██╔═══██╗╚══██╔══╝██╔════╝██╔══██╗████╗ ████║██╔══██╗
                    ██████╔╝██║   ██║██║   ██║   ██║   ██║     ███████║██╔████╔██║██████╔╝
                    ██╔══██╗██║   ██║██║   ██║   ██║   ██║     ██╔══██║██║╚██╔╝██║██╔═══╝ 
                    ██████╔╝╚██████╔╝╚██████╔╝   ██║   ╚██████╗██║  ██║██║ ╚═╝ ██║██║     
                    ╚═════╝  ╚═════╝  ╚═════╝    ╚═╝    ╚═════╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝     
                    .........................................................................
                    """;
            System.out.println(menu);


        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição Curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição Mentoria java");
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

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("\nConteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("\nConteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("\nConteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("\nConteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

        System.out.println("-----------------------------------");
        System.out.println(menu);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso Python");
        curso3.setDescricao("Descrição Curso Python");
        curso3.setCargaHoraria(10);

        Curso curso4 = new Curso();
        curso4.setTitulo("Curso C#");
        curso4.setDescricao("Descrição Curso C#");
        curso4.setCargaHoraria(6);

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de Python");
        mentoria2.setDescricao("Descrição Mentoria Python");
        mentoria2.setData(LocalDate.now());

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Bootcamp Python Developer");
        bootcamp2.setDescricao("Descrição Bootcamp Python Developer");
        bootcamp2.getConteudos().add(curso3);
        bootcamp2.getConteudos().add(curso4);
        bootcamp2.getConteudos().add(mentoria2);

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp2);
        System.out.println("\nConteúdos Inscritos Ana:" + devAna.getConteudosInscritos());
        devAna.progredir();
        devAna.progredir();
        System.out.println("-");
        System.out.println("\nConteúdos Inscritos Ana:" + devAna.getConteudosInscritos());
        System.out.println("\nConteúdos Concluídos Ana:" + devAna.getConteudosConcluidos());
        System.out.println("XP:" + devAna.calcularTotalXp());

        System.out.println("-------");

        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcamp2);
        System.out.println("\nConteúdos Inscritos Carlos:" + devCarlos.getConteudosInscritos());
        devCarlos.progredir();
        devCarlos.progredir();
        devCarlos.progredir();
        System.out.println("-");
        System.out.println("\nConteúdos Inscritos Carlos:" + devCarlos.getConteudosInscritos());
        System.out.println("\nConteúdos Concluidos Carlos:" + devCarlos.getConteudosConcluidos());
        System.out.println("XP:" + devCarlos.calcularTotalXp());

    }

}
