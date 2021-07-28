package Objetos.Heranca;

public class Carro {
    public Carro() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getVariante() {
        return variante;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }

    private String marca;
    public String nomeCarro;
    public Integer ano;
    public String variante;

    public Integer  capacidade = 5;
    public Integer  pessoas = 1;



    public String getCarro() {return nomeCarro;}
    public Integer getCapacidade() {return capacidade;}
    public Integer getPessoas() {return pessoas ;}




    public Integer tirandoPessoas() {

        return capacidade - getPessoas();
    }
    public Integer colocandoPessoas() {
        return capacidade + getPessoas();

    }

}
