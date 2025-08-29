package UML;

public class Atividade {
private double nota  ;
private Aluno aluno;
private Disciplina disciplina;
public Atividade() {

}

public Atividade(Aluno aluno, Disciplina disciplina ){
    this.aluno = aluno;
    this.disciplina = disciplina;

}
public void getNota(double nota){
    this.nota = nota;

}
public void setNota(double nota){
    this.nota = nota;
}

    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
    this.disciplina = disciplina;
    }

    public Aluno getAluno() {

    return aluno;
    }
    public void setAluno(Aluno aluno) {
    this.aluno = aluno;
    }
}
