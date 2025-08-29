package UML;

import java.util.Date;

public class Aluno {
    private  int id  ;
    private String nome;
    private Date dataNascimento;
    private String telefone;
    private String email;
    private String cpf;
    private Matricula matricula;
    public Aluno() {

    }
    public Aluno(int id,  String nome, Date dataNascimento, String telefone, String email, String cpf, Matricula matricula) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento =  dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.matricula = matricula;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getDataNascimento() {
        return this.dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return this.telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return this.email;

    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
