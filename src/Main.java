public class Main {
    public static void main(String[] args) {
         int mobileBill1 = 300;
         int replenishmentAmount = 1500;

         int bonus;
         if (replenishmentAmount > 1000) {
             bonus = replenishmentAmount / 100;
         }else {
             bonus = 0;
         }
         int mobileBill2 = mobileBill1 + replenishmentAmount + bonus;
         System.out.println("Наш счет " + mobileBill2 + " рублей");
         

    }

}
