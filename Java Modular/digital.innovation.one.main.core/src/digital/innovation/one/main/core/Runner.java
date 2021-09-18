package digital.innovation.one.main.core;
import digital.innovation.one.utils.Calculadora;

//Definimos a função principal que irá realizar as operações da calculadora
public class Runner {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.multi(6,3));
        System.out.println(calculadora.sub(6,3));
        System.out.println(calculadora.sum(6,3));
        System.out.println(calculadora.div(6,3));
        if(calculadora.mod(6,5) == 0){
            System.out.println("Module results to 0.");
        } else {
            System.out.println("Module doesn't results to 0. Instead results to: " + calculadora.mod(6,5));
        }
    }
}
