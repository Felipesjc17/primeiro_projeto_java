package Objetos.Polimorfismo;

public class Gerente {

    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public double calculaImposto() {
        return this.salario * 0.1;

    }
}
