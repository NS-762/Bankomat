public class Display {

    private Bankomat bankomat;

    public Display(Bankomat bankomat) {
         this.bankomat = bankomat;
    }

    public void changeSum(int money) { //изменения суммы в банкомате
        if (money < 0) bankomat.deductSum(money);
        if (money > 0) bankomat.addSum(money);
    }

    public void sayDisplayAdd(int money) {
        System.out.println("Внесена сумма: " + money);
    }

    public void sayDisplayDeduct(int money) {
        System.out.println("Выдача суммы: " + money);
    }

    public void sayDisplayError() {
        System.out.println("Ошибка");
    }

}
