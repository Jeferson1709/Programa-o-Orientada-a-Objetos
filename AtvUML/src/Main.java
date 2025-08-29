import UML.*;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Disciplina disciplina = new Disciplina();
        Professor professor = new Professor();
        Atividade atividade = new Atividade();
        Turma turmaMc = new Turma(10);
        Matricula matricula1 = new Matricula();
        Matricula matricula2= new Matricula();


        matricula1.setDataMatricula(new Date());
        matricula1.setId(12345);
        matricula1.setAluno(aluno1);
        matricula1.setTurma(turmaMc);

        matricula2.setDataMatricula(new Date());
        matricula2.setId(10101);
        matricula2.setAluno(aluno1);
        matricula2.setTurma(turmaMc);


        professor.setId(1);
        professor.setName("Chile");
        professor.setEmail("Chileteste@gmail.com");
        professor.setTelefone("+910000000");

        aluno1.setNome("Jeferson Alves");
        aluno1.setId(1);
        aluno1.setDataNascimento(new Date());
        aluno1.setTelefone("+910000000");
        aluno1.setEmail("jefersonteste@gmail.com");
        aluno1.setCpf("21218733131");

        aluno2.setNome("Ana Luiza");
        aluno2.setId(2);
        aluno2.setDataNascimento(new Date());
        aluno2.setTelefone("+910000000");
        aluno2.setEmail("anateste@gmail.com");
        aluno2.setCpf("212123691");

        turmaMc.setNome("TADS MC");
        turmaMc.setTamanho(2);


        disciplina.setId(1);
        disciplina.setNome("Programação Orienta a Objeto");
        disciplina.setDescricao("Getters e Setters, UML");
        disciplina.setProfessor(professor);

        System.out.println("Matricula: " + matricula1.getId() +"\n" +"Id do aluno: "+aluno1.getId()+"\n" +"Nome: " + aluno1.getNome() +"\n"+"Turma: "+  matricula1.getTurma().getNome() + "\nProfessor: "+ professor.getName()+"\nDisciplina: "+ disciplina.getNome() + "\nDescrição: " +disciplina.getDescricao());
        System.out.println();
        System.out.println("Matricula: " + matricula2.getId() +"\n" +"Id do aluno: "+aluno2.getId()+"\n" +"Nome: " + aluno2.getNome() +"\n"+"Turma: "+  matricula2.getTurma().getNome() + "\nProfessor: "+ professor.getName()+"\nDisciplina: "+ disciplina.getNome() + "\nDescrição: " +disciplina.getDescricao());


    }
}