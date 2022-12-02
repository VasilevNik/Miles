public class Main {
    public static void main(String[] args) {
        int price = 60; // стоимость билета
        int spent = 20; // потраченная сумма за которую начисляется 1 миля
        int bonus = (price / spent); // расчет миль

        System.out.println("За купленный билет начислено - " + bonus + " мили(ль)");
    }
}