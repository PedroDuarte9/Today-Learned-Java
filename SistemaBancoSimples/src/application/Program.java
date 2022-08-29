package application;


import entities.Conta;
import entities.ContaDeNegocios;
import entities.ContaPoup;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Conta c = new Conta(1001, "Alex", 0.0);
        ContaDeNegocios cdn = new ContaDeNegocios(1002, "Maria", 0.0, 500.0);
        ContaPoup cp = new ContaPoup(1011, "Fabio", 50.0, 10.0);


        //UPCASTING : É quando uma subclasse é passada em uma variável da superclasse.
        Conta c1 = cdn;

        Conta c2 = new ContaDeNegocios(1003, "Fábio", 10.0, 50.0);
        Conta c3 = new ContaPoup(1004, "Pedro", 1000.0,50.0);

        //DOWNCASTING:É quando uma superclasse é armazenada em uma variável da subclasse
        ContaDeNegocios c4 = (ContaDeNegocios) c2;
        c4.loan(500.0);
        //Nesse caso foi feito uma operação de empréstimo, na superclasse, mesmo a superclasse,
        //não tendo como método principal esse método de loan, sendo possível ser feito desta forma

        //Para ser feito um DONWCASTING nesse caso temos que fazer uma estrura de repetição ou um tratamento de exceções
        if(c3 instanceof ContaDeNegocios){
        ContaDeNegocios c5 = (ContaDeNegocios) c3;
        c5.loan(20.0);
            System.out.println("Empréstimo");
        }

            if(c3 instanceof ContaPoup ) {
                ContaPoup cp1 = (ContaPoup) c3;
                cp1.updateBalance();
                System.out.println("Update / Atualizado ");
                System.out.println(cp1);
            }
            sc.close();


    }


}
