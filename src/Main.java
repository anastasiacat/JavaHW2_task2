public class Main {
    public static void main(String[] args) {
        int balance = 100; //сумма на счету клиента
        int refill = 1100; //сумма пополнения счета
        int resultBalance; //итоговая сумма на счету клиента
        int bonus = 0; //бонусные рубли за пополнение счета

        if (refill > 1000) {
            bonus = refill / 100;
        }

        resultBalance = balance + refill + bonus;
        System.out.println("Клиент пополнил счет на " + refill + " рублей(ь/я) - бонус равен " + bonus +
                " рублям(ей), итоговая сумма на счету клиента - " + resultBalance + " рублей(ь/я)");
    }
}