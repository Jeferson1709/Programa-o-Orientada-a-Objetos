package UML;

public class Turma {
    private Aluno[] alunos   ;
    private String nome;
    private Professor professor;
    private Disciplina disciplina;
    private  int tamanho;
    public Turma(int tamanho) {

        this.alunos = new Aluno[tamanho];
    }

    public Turma( String nome, Professor professor, Disciplina disciplina ) {
        this.alunos = new Aluno[this.tamanho];
        this.nome = nome ;
        this.disciplina = disciplina;
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public Aluno[] getAlunos() {
        return alunos ;

    }
    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
    public String getNome() {
        return nome;

    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
