public class Main {
    public static void main(String[] args) {
                double initialDistance = 10.0; // начальный пробег в км
                double totalDistance = 0.0; // суммарный путь за первые 7 дней
                double dailyDistance = initialDistance; // пробег за текущий день

                // Вывод пробега за второй, третий, ..., десятый день
                System.out.println("Пробег лыжника за дни:");
                for (int day = 2; day <= 10; day++) {
                    dailyDistance *= 1.1; // увеличение на 10%
                    System.out.println(String.format ("День %d: %.2f км%n", day, dailyDistance));
                    if (day <= 7) {
                        totalDistance += dailyDistance; // добавление к сумме пробегов за первые 7 дней
                    }
                }

                System.out.println(String.format ("Суммарный путь за первые 7 дней: %.2f км%n", totalDistance));
            }
        }
