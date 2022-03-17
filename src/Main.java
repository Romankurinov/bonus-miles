public class Main {
    public static void main(String[] args) {
        // Входные данные
        int ticketPrice = 4649; // стоимость билета
        int bonus = 20; // количество рублей для одной бонусной милли
        // Логика программы
        int bonusMiles = ticketPrice / bonus; // количество бонусных милль

        System.out.println("Количество бонусных милль составит: " + bonusMiles);
    }
}
