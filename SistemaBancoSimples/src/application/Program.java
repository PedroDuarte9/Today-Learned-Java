package application;


import entities.Conta;
import entities.ContaPoup;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Conta c = new Conta(null, null,500.0);
        System.out.println("Digite os dados do Títular da Conta: ");
        System.out.print("Digite o número do titular: ");
        c.setNumber(sc.nextInt());
        System.out.printf("Digite o nome do títular: ");
        sc.nextLine();
        c.setHolder(sc.nextLine());
        System.out.println(c);
        System.out.printf("Digite o valor do Saque: ");
        c.withdraw(sc.nextDouble());
        System.out.println(c);

//        Conta cp = new ContaPoup(1306, "Paulo", 500.0, 0.01);
//        cp.withdraw(sc.nextDouble());
//        System.out.println(cp.getBalance());
//        cp.deposit(sc.nextDouble());


        sc.close();
    }


}
