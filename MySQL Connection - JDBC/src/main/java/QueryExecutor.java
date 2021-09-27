import java.util.List;

public class QueryExecutor {
    public static void main(String[] args) {
        //Lista todos os alunos
        AlunosDAO alunoDAO = new AlunosDAO();
        List<Aluno> alunos = AlunosDAO.list();
        alunos.stream().forEach(System.out::println);
        //Lista um aluno por ID
        Aluno resultado = AlunosDAO.listById(1);
        resultado.toString();
        //Deleta um aluno
        AlunosDAO.delete(5);
    }
}
