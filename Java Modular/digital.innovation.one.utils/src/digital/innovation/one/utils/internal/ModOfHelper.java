package digital.innovation.one.utils.internal;
import digital.innovation.one.utils.Operacao;

//Sobrescrevemos o método de interface de acordo com a operação desejada
//Adicionando operações extras à calculadora
public class ModOfHelper implements Operacao {
    @Override
    public int execute(int a, int b){
        return a%b;
    }
}
