package lab2;

import java.io.IOException;

/**
 * Клас Shoes представляє взуття з різними складовими (підошва, верх, шнурки)
 * та забезпечує функціональність для зміни матеріалів, розміру та бренду,
 * а також для перевірки розміру, оцінки вартості, комфорту та зносостійкості.
 */
public class Shoes {
    private Sole sole;
    private Upper upper;
    private Laces laces;
    private Logger logger;
    private String brand;
    private double size;

    /**
     * Конструктор для створення взуття з базовими характеристиками.
     *
     * @param brand Бренд взуття.
     * @param size Розмір взуття.
     * @throws IOException Якщо виникає помилка при записі в лог-файл.
     */
    public Shoes(String brand, double size) throws IOException {
        sole = new Sole();
        upper = new Upper();
        laces = new Laces();
        this.brand = brand;
        this.size = size;

        this.logger = new Logger("shoes_log.txt");
        logger.log(String.format("Взуття створено.", this.toString()));
    }

    /**
     * Конструктор для створення взуття з налаштованими характеристиками.
     *
     * @param sole Підошва взуття.
     * @param upper Верх взуття.
     * @param laces Шнурки.
     * @param brand Бренд взуття.
     * @param size Розмір взуття.
     * @throws IOException Якщо виникає помилка при записі в лог-файл.
     */
    public Shoes(Sole sole, Upper upper, Laces laces, String brand, double size) throws IOException {
        this.sole = sole;
        this.upper = upper;
        this.laces = laces;
        this.brand = brand;
        this.size = size;

        this.logger = new Logger("shoes_log.txt");
        logger.log(String.format("Взуття %s створено.", this.toString()));
    }

    /**
     * Змінює підошву взуття.
     * @param material Матеріал нової підошви.
     * @throws IOException Якщо виникає помилка при записі в лог-файл.
     */
    public void changeSole(String material) throws IOException {
        this.sole.setMaterial(material);
        logger.log(String.format("Змінено підошву на матеріал: %s", material));
        System.out.printf("Змінено підошву на матеріал: %s\n", material);
    }

    /**
     * Змінює верх взуття.
     * @param material Матеріал нового верху.
     * @throws IOException Якщо виникає помилка при записі в лог-файл.
     */
    public void changeUpper(String material) throws IOException {
        this.upper.setMaterial(material);
        logger.log(String.format("Змінено верх на матеріал: %s", material));
        System.out.printf("Змінено верх на матеріал: %s\n", material);
    }

    /**
     * Змінює шнурки взуття.
     * @param color Колір нових шнурків.
     * @throws IOException Якщо виникає помилка при записі в лог-файл.
     */
    public void changeLaces(String color) throws IOException {
        this.laces.setColor(color);
        logger.log(String.format("Змінено шнурки на колір: %s", color));
        System.out.printf("Змінено шнурки на колір: %s\n", color);
    }

    /**
     * Отримує інформацію про взуття.
     * @return Інформація про взуття як рядок.
     * @throws IOException Якщо виникає помилка при записі в лог-файл.
     */
    public String getInfo() throws IOException {
        String info = "Взуття: " + brand + ", Розмір: " + size +
                ", Підошва: " + sole.getMaterial() +
                ", Верх: " + upper.getMaterial() +
                ", Шнурки: " + laces.getColor();

        logger.log(String.format("Отримано інформацію про взуття %s", info));
        System.out.printf("Отримано інформацію про взуття %s\n", info);
        return info;
    }

    /**
     * Змінює розмір взуття.
     * @param newSize Новий розмір взуття.
     * @throws IOException Якщо виникає помилка при записі в лог-файл.
     */
    public void changeSize(double newSize) throws IOException {
        this.size = newSize;
        logger.log(String.format("Змінено розмір взуття на: %s", newSize));
        System.out.printf("Змінено розмір взуття на: %s\n", newSize);
    }

    /**
     * Змінює бренд взуття.
     * @param newBrand Новий бренд взуття.
     * @throws IOException Якщо виникає помилка при записі в лог-файл.
     */
    public void changeBrand(String newBrand) throws IOException {
        this.brand = newBrand;
        logger.log(String.format("Змінено бренд взуття на: %s", newBrand));
        System.out.printf("Змінено бренд взуття на: %s\n", newBrand);
    }

    /**
     * Перевіряє, чи підходить взуття за розміром.
     * @param footSize Розмір ноги.
     * @return true, якщо взуття підходить, false - якщо ні.
     * @throws IOException Якщо виникає помилка при записі в лог-файл.
     */
    public boolean fitsFoot(double footSize) throws IOException {
        boolean fits = Math.abs(this.size - footSize) < 0.5;
        logger.log(String.format("Перевірка на відповідність розміру %s:%s", footSize, fits));
        System.out.printf("Перевірка на відповідність розміру %s:%s\n", footSize, fits);
        return fits;
    }

    /**
     * Розраховує вартість взуття.
     * @return Вартість взуття.
     * @throws IOException Якщо виникає помилка при записі в лог-файл.
     */
    public double calculatePrice() throws IOException {
        double price = 100.0;
        price += sole.getQualityFactor() * 20;
        price += upper.getQualityFactor() * 30;
        logger.log(String.format("Розраховано вартість взуття: %s", price));
        System.out.printf("Розраховано вартість взуття: %s\n", price);
        return price;
    }

    /**
     * Оцінює комфорт взуття.
     * @return Рівень комфорту від 1 до 10.
     * @throws IOException Якщо виникає помилка при записі в лог-файл.
     */
    public int evaluateComfort() throws IOException {
        int comfort = (int) ((sole.getComfortLevel() + upper.getComfortLevel()) / 2.0);
        logger.log(String.format("Оцінено комфорт взуття: %s", comfort));
        System.out.printf("Оцінено комфорт взуття: %s\n", comfort);
        return comfort;
    }

    /**
     * Оцінює зносостійкість взуття.
     * @return Оцінка зносостійкості від 1 до 10.
     * @throws IOException Якщо виникає помилка при записі в лог-файл.
     */
    public int evaluateDurability() throws IOException {
        int soleDurability = (int) (sole.getQualityFactor() * 5);
        int upperDurability = (int) (upper.getQualityFactor() * 5);
        int overallDurability = (soleDurability + upperDurability) / 2;

        if (brand.equalsIgnoreCase("Nike") || brand.equalsIgnoreCase("Adidas")) {
            overallDurability += 1;
        }

        overallDurability = Math.max(1, Math.min(10, overallDurability));
        logger.log(String.format("Оцінено зносостійкість взуття: %d", overallDurability));
        System.out.printf("Оцінено зносостійкість взуття: %d\n", overallDurability);
        return overallDurability;
    }

    /**
     * Закриває логер для збереження даних у файл.
     *
     * @throws IOException якщо виникає помилка під час закриття логера
     */
    public void closeLogger() throws IOException {
        logger.close();
    }
}