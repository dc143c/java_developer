public class Aluno {
    private int id;
    private String nome;
    private int idade;
    private String curso;

    public Aluno(int id, String nome, int idade, String curso){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public Aluno(String nome, int idade, String curso){
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public Aluno(){};

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    @Override
    public String toString(){
      final StringBuilder sb = new StringBuilder("Aluno: {");
      sb.append("id: ").append(id);
      sb.append(", nome: ").append(nome);
      sb.append(", idade: ").append(idade);
      sb.append(", curso: ").append(curso);
      sb.append("}");
      return sb.toString();
    };
}
