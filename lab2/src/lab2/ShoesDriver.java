package lab2;

import java.io.IOException;

/**
 * Клас ShoesDriver є точкою входу в програму, яка тестує функціональність класу Shoes.
 */
public class ShoesDriver {
    /**
     * Головний метод.
     *
     * @param args аргументи командного рядка (не використовуються).
     */
    public static void main(String[] args) {
        try {
            Shoes shoes = new Shoes("chereviki", 32);
            shoes.changeSole("Ризина");
            shoes.changeUpper("Дермантин");
            shoes.changeLaces("Червоний");
            shoes.getInfo();
            shoes.changeSize(33);
            shoes.changeBrand("Adidas");
            shoes.fitsFoot(31);
            shoes.calculatePrice();
            shoes.evaluateComfort();
            shoes.evaluateDurability();

            shoes.closeLogger();
        } catch (IOException e) {
            // Обробка помилок, що виникають під час запису в файл
            throw new RuntimeException("Сталася помилка при записі в файл: " + e.getMessage());
        }
    }
}