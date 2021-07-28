package Objetos.Heranca;

public class ExemploCarro {

    public static void main(String[] args) {
        Carro carroCaro = new Carro();

        carroCaro.setMarca("Ford");
        carroCaro.setNomeCarro("Mustang");
        carroCaro.setAno(2022);
        carroCaro.setVariante("5.0 Turbo");

        Carro carroBarato = new Carro();

        carroBarato.setMarca("Ford Brasil");
        carroBarato.setNomeCarro("Ka");
        carroBarato.setAno(2021);
        carroBarato.setVariante("1.0 com 4 portas");

        System.out.println("Marca do carro Barato = " + carroBarato.getMarca());
        System.out.println("Marca do carro Caro = " + carroCaro.getMarca());

        System.out.println("Modelo do carro Barato = " + carroBarato.getNomeCarro());
        System.out.println("Modelo do carro Caro = " + carroCaro.getNomeCarro());

        System.out.println("Ano do carro Barato = " + carroBarato.getAno());
        System.out.println("Ano do carro Caro = " + carroCaro.getAno());

        System.out.println("Variação do carro Barato = " + carroBarato.getVariante());
        System.out.println("Variação do carro Caro = " + carroCaro.getVariante());

      //  System.out.println("Tirando 1 = " + carro.tirandoPessoas());
      //  System.out.println("Colocando 1 = " + carro.colocandoPessoas());


    }
}