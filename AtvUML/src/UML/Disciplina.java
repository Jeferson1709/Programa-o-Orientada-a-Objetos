package UML;

public class Disciplina {
    private int id;
    private String nomeDisciplina;
    private String descricao;
    private Professor professor;

    public  Disciplina() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return this.nomeDisciplina;
    }
    public void setNome(String nome) {
        this.nomeDisciplina = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
