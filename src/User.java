public class User {

    private int userSum;

    private Bankomat bankomat;
    private Display display;
    public User(int userSum) {
        this.userSum = userSum;
    }

    public int getUserSum() {
        return userSum;
    }

    public void linkBankomat(Bankomat bankomat) { //привязать банкомат к человеку
        this.bankomat = bankomat;
        display = bankomat.linkDisplay(); //получили конкретный дисплей
        bankomat.linkUser(this);

    }

    public void addSum(int money) {
        userSum -= money;
    }

    public void changeMoneyUser(int money) {
        if (money < 0) { //снять деньги из банкомата
            display.changeSum(money);
        } else if (money > 0) { //внести
            if (money <= userSum) {
                userSum -= money;
                display.changeSum(money);
            } else {
                System.out.println("У меня не хватает денег!");
            }
        } else {
            display.sayDisplayError();  //дисплей выводит ошибку
        }
    }


}
