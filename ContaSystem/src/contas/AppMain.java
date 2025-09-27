package contas;

public class AppMain {
    public static void main(String[] args) {
        Contas conta01 = new Contas();
        Contas conta02 = new Contas();

        conta01.nome = "Anjinho";
        conta02.nome = "Qualquer Anjo";


        conta01.nome = "Anjinho";
        conta01.numero = 01;
        conta01.limite = 100000;
        conta01.saldo  = 10000;
        //Impressão valor por valor
      //  System.out.println(contas01.nome);
       // System.out.println(contas01.numero);
       // System.out.println(contas01.limite);
       // System.out.println(contas01.saldo);
        System.out.println("-------------");
        //Impressão via toString
        System.out.println("Contas{" + conta01 );
        System.out.println("-------------");



        conta02.nome = "Anjo Segundo";
        conta02.numero = 02;
        conta02.limite = 200000;
        conta02.saldo  = 20000;

        //Impressão valor por valor
        //  System.out.println(contas02.nome);
        // System.out.println(contas02.numero);
        // System.out.println(contas02.limite);
        // System.out.println(contas02.saldo);
        System.out.println("-------------");
        //Impressão via toString
        System.out.println("Contas{" + conta02 );
        System.out.println("-------------");

        conta01.sacar(10000);
        System.out.println("Novo saldo: " + conta01.saldo);

        conta01.sacar(5000);
        System.out.println("Novo saldo: " + conta02.saldo);


    }

}
