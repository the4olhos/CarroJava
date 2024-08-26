//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(5881, "BMW", 2010, 50.000,true);

        carro.exibirInformacao();
        carro.setModelo("Fusca");
        carro.setAno(2020);
        carro.setPrecoDiaria(-7);
        carro.exibirInformacao();
        carro.setDisponivel(false);
        carro.exibirInformacao();

    }

}

