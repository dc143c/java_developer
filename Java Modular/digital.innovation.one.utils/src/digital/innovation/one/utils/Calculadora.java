package digital.innovation.one.utils;


import digital.innovation.one.utils.internal.*;

public class Calculadora {

    //Instanciamos nossas operações de forma privada
    private DivHelper divHelper;
    private SubHelper subHelper;
    private SumHelper sumHelper;
    private MultiHelper multiHelper;
    private ModOfHelper modOfHelper;

    //Definimos os modelo da calculadora e suas operações, criando assim uma instância da mesma
    public Calculadora(){
        divHelper = new DivHelper();
        sumHelper = new SumHelper();
        multiHelper = new MultiHelper();
        subHelper = new SubHelper();
        modOfHelper = new ModOfHelper();
    }

    //Declaramos as operações e seus dependentes.
    public int sum(int a, int b){
        return sumHelper.execute(a, b);
    }

    public int multi(int a, int b){
        return multiHelper.execute(a, b);
    }

    public int div(int a, int b){
        return divHelper.execute(a, b);
    }

    public int sub(int a, int b){
        return subHelper.execute(a, b);
    }

    public int mod(int a, int b){
        return modOfHelper.execute(a, b);
    }
}
