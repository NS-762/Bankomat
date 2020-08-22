public class Main {

    public static void main(String[] args) {

        Bankomat bankomat1 = new Bankomat(500);
        User user1 = new User(100);

        user1.linkBankomat(bankomat1);

        System.out.println("Банкомат: " + bankomat1.getSum());
        System.out.println("Пользователь: " + user1.getUserSum());
        System.out.println("\n");

        user1.changeMoneyUser(-200);
        System.out.println("Банкомат: " + bankomat1.getSum());
        System.out.println("Пользователь: " + user1.getUserSum());
        System.out.println("\n");

        user1.changeMoneyUser(100);
        System.out.println("Банкомат: " + bankomat1.getSum());
        System.out.println("Пользователь: " + user1.getUserSum());
        System.out.println("\n");

        user1.changeMoneyUser(800); //у пользователя не хватает денег
        user1.changeMoneyUser(-800);  //у банкомата не хватает денег
        user1.changeMoneyUser(0); //не надо вводить ноль
    }

}
