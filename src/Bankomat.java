public class Bankomat {

    private int sum;
    private Display display;
    private User user;

    public Bankomat(int sum) {
        this.sum = sum;
        display = new Display(this); //как передать объект
    }

    public int getSum() {
        return sum;
    }

    public void deductSum(int money) { //снять
        if (-money <= sum) {
            sum += money;
            user.addSum(money);
            display.sayDisplayDeduct(money);
        } else { // нет денег в банкомате
            display.sayDisplayError(); //дисплей выводит ошибку
        }
    }

    public void addSum(int money) { //внести
        sum += money;
        display.sayDisplayAdd(money);
    }


    public Display linkDisplay() {
        return display;
    }

    public void linkUser(User user) {
        this.user = user;
    }

}
