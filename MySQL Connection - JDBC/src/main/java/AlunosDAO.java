import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AlunosDAO {
    public static List<Aluno> list() {
        List<Aluno> alunos = new ArrayList<>();

        try(Connection cons = ConnectionFactory.getConnection()){
            PreparedStatement query = cons.prepareStatement("SELECT * FROM aluno");
            ResultSet results = query.executeQuery();

            while(results.next()){
                //public Aluno(int id, String nome, int idade, String curso)
                Aluno aluno = new Aluno(results.getInt("id"),
                        results.getString("nome"),
                        results.getInt("idade"),
                        results.getString("curso"));
                alunos.add(aluno);
            }

        } catch(Exception e){
            System.out.println("Erro na busca do MySQL");
            e.printStackTrace();
        }

        return alunos;
    }

    public static Aluno listById(int id){
        Aluno aluno = new Aluno();
        try(Connection cons = ConnectionFactory.getConnection()){
            PreparedStatement query = cons.prepareStatement("SELECT * FROM aluno WHERE id = ?");

            query.setInt(1, id);
            ResultSet results = query.executeQuery();

            if(results.next()){
                //public Aluno(int id, String nome, int idade, String curso)
               aluno.setId(results.getInt("id"));
               aluno.setNome(results.getString("nome"));
               aluno.setIdade(results.getInt("idade"));
               aluno.setCurso(results.getString("curso"));
            }

        } catch(Exception e){
            System.out.println("Erro na busca do MySQL FindById");
            e.printStackTrace();
        }
        return aluno;
    }

    public static void create(Aluno aluno) {
        try(Connection cons = ConnectionFactory.getConnection()){
            PreparedStatement query = cons.prepareStatement("INSERT INTO aluno(nome, idade, curso) VALUES(?, ?, ?);");

            query.setString(1, aluno.getNome());
            query.setInt(2, aluno.getIdade());
            query.setString(3, aluno.getCurso());

            int rowsAffected = query.executeUpdate();
            System.out.println("Aluno inserido com SUCESSO, " + rowsAffected + " linhas foram adicionadas.");

        } catch(Exception e){
            System.out.println("Erro na busca do MySQL FindById");
            e.printStackTrace();
        }
    };

    public static void delete(int id) {
        try(Connection cons = ConnectionFactory.getConnection()){
            PreparedStatement query = cons.prepareStatement("DELETE FROM aluno WHERE id = ?;");

            query.setInt(1, id);

            int rowsAffected = query.executeUpdate();
            System.out.println("Aluno deletado com SUCESSO, " + rowsAffected + " linhas foram removidas.");

        } catch(Exception e){
            System.out.println("Erro na busca do MySQL FindById");
            e.printStackTrace();
        }
    };

}
