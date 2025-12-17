package lab3;

import java.io.IOException;

/**
 * Клас ShoesDriver є точкою входу в програму, яка тестує функціональність класу Shoes.
 */
public class BootsDriver {
    /**
     * Головний метод.
     *
     * @param args аргументи командного рядка (не використовуються).
     */
    public static void main(String[] args) {
        try {
            Boots boots = new Boots("Timberland", 42.5, true, 20);
            System.out.println(boots.getInfo());

            boots.changeSole("Гума");
            boots.changeUpper("Шкіра");
            boots.changeLaces("Коричневий");

            System.out.println("Ціна чобіт: " + boots.calculatePrice());
            System.out.println("Комфорт чобіт: " + boots.evaluateComfort());
            System.out.println("Зносостійкість чобіт: " + boots.evaluateDurability());

            System.out.println("Підходить для осені: " + boots.isSuitableForSeason("autumn"));
            System.out.println("Рекомендована температура: " + boots.getRecommendedTemperature() + "°C");
            System.out.println("Підходить для дощу: " + boots.isGoodForRain());
            System.out.println("Висота халяви: " + boots.getShaftHeight() + " см");

            boots.closeLogger();
        } catch (IOException e) {
            // Обробка помилок, що виникають під час запису в файл
            throw new RuntimeException("Сталася помилка при записі в файл: " + e.getMessage());
        }
    }
}
