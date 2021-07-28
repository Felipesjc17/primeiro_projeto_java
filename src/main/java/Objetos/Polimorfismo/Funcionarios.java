package Objetos.Polimorfismo;

public class Funcionarios {

    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        Supervisor  supervisor = new Supervisor();
        Atendente atendente = new Atendente();

        gerente.setSalario(10000.0);
        supervisor.setSalario(5000.0);
        atendente.setSalario(1000.0);


        System.out.println("Gerente vai pagar = " + gerente.calculaImposto()+
                "  Supervisor vai pagar = "+ supervisor.calculaImposto()+
                "  Atendente vai pagar = " + atendente.calculaImposto());


    }

}
