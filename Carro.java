public class Carro {
    private int codigo;
    private String modelo;
    private int ano;
    private double precoDiaria;
    private boolean disponivel;

    public Carro(int codigo, String modelo, int ano, double precoDiaria, boolean disponivel) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.ano = ano;
        this.precoDiaria = precoDiaria;
        this.disponivel = disponivel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        if (precoDiaria < 0) {
            this.precoDiaria = 0;
        } else {

            this.precoDiaria = precoDiaria;
        }
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        if (this.disponivel) {
            this.disponivel = disponivel;
        } else {
            System.out.println("O veículo está indisponível, portanto não pode ser alterado");
        }
    }

    void exibirInformacao() {
        System.out.println("Código: "+ codigo);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Ano: "+ ano);
        System.out.println("Preço da Diária: "+ precoDiaria);
        System.out.println("Disponivel:"+ disponivel);

    }
    public String toString() {
        return "Código do carro: " + codigo
                + "\nModelo: " + modelo
                + "\nAno: " + ano
                + "\nPreço da Diária: " + String.format("%.2f", precoDiaria)
                + "\nDisponível: " + disponivel;


    }



}
