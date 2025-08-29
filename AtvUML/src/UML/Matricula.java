package UML;

import java.util.Date;

public class Matricula {
private int id ;
private Date dataMatricula;
private Aluno aluno;
private Turma turma;

public Matricula() {

}

public Matricula( Aluno aluno, Date dataMatricula, Turma turma, int id ) {
this.aluno = aluno;
this.turma = turma;
this.dataMatricula = dataMatricula;
this.id = id;
}
public Matricula( int id, Date dataMatricula ){
    this.dataMatricula = dataMatricula;
    this.id = id;
}


public Date getDataMatricula() {
    return dataMatricula;
}
public void setDataMatricula(Date dataMatricula) {
    this.dataMatricula = dataMatricula;
}

    public Aluno getAluno() {
        return aluno;
    }
    public void setAluno(Aluno aluno) {
    this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
    this.turma = turma;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
    this.id = id;
    }
}

