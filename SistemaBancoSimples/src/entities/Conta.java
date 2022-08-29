package entities;


public class Conta {
   private Integer number;
   private String holder;
   protected Double balance;
   /*
   * Palavra Super
   * É possivel chamar a implementação da superclasse usando a palavra super
   *
   * Vamos supor que na classe ContaDeNegócios a regra para saque seja realizar
   * o saque normalmente da superclasse e descontar mais 2.0*/

   public Conta() {
   }

   public Conta(Integer number, String holder, Double balance) {
      this.number = number;
      this.holder = holder;
      this.balance = balance;
   }

   public Integer getNumber() {
      return number;
   }

   public void setNumber(Integer number) {
      this.number = number;
   }

   public String getHolder() {
      return holder;
   }

   public void setHolder(String holder) {
      this.holder = holder;
   }

   public Double getBalance() {
      return balance;
   }


   public void withdraw(double amount){
   balance -= amount + 5.0;
   }

   public void deposit(double amount){
   balance += amount;
   }
//Sobreposição ou Sobrescrita
   //É a implementação de um método de uma supercasse na subclasse
   //É fortemente recomendável usar a anotação @Override em um método sobrescrito
      //-Facilita a leitura e compreensão do código
      //-Avisamos ao compilador(boa prática)
   @Override
   public String toString() {
      return "Conta{" +
              "number=" + number +
              ", holder='" + holder + '\'' +
              ", balance=" + balance +
              '}';
   }
}
