public class Main {
    public static void main(String[] args) {

        int ticketCost = 17_653; //стоимость билета
        int mileCost = 20; //количество рублей за одну милю
        int mileCalc = ticketCost/mileCost; //расчет количества начисленных миль
        System.out.println("Стоимость билета составляет: " + ticketCost + " рублей");
        System.out.println("Одна миля начисляется за каждые " + mileCost + " рублей");
        System.out.println("Итого начислено " + mileCalc + " мили(миль)");
    }
}