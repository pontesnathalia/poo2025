package contas;

public class Contas {
    int numero;
    String nome;
    double saldo;
    double limite;

    void sacar(double quantidade){
        double novosaldo = this.saldo - quantidade;
        this.saldo = novosaldo;
    }

    @Override
    public String toString() {
        return "Contas{" +
                "numero=" + numero +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                ", limite=" + limite +
                '}'+ "Somos felizes";
    }
}
