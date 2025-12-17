package lab3;

import java.io.IOException;

/**
 * Клас Boots розширює абстрактний клас {@link Shoes} та реалізує інтерфейс {@link SeasonalFootwear},
 * що представляє чоботи як сезонне взуття для холодної або дощової погоди.
 *
 * <p>Цей клас додає можливості перевірки на водонепроникність і висоту халяви, а також
 * визначає придатність чобіт для різних сезонів. Всі дії записуються в лог для
 * забезпечення належного контролю за використанням класу.</p>
 */
public class Boots extends Shoes implements SeasonalFootwear {
    private boolean waterproof;
    private int shaftHeight; // висота халяви в сантиметрах

    /**
     * Конструктор для створення чобіт.
     *
     * @param brand        Бренд чобіт
     * @param size         Розмір чобіт
     * @param waterproof   Чи водонепроникні чоботи
     * @param shaftHeight  Висота халяви
     * @throws IOException Якщо виникає помилка при записі в лог-файл
     */
    public Boots(String brand, double size, boolean waterproof, int shaftHeight) throws IOException {
        super(brand, size);
        this.waterproof = waterproof;
        this.shaftHeight = shaftHeight;
        logger.log(String.format("Чоботи %s створено.", this.toString()));
    }

    /**
     * Повертає тип взуття.
     *
     * @return Тип взуття як рядок: "Чоботи"
     */
    @Override
    public String getType() {
        return "Чоботи";
    }

    /**
     * Визначає, чи підходять чоботи для вказаного сезону.
     *
     * @param season Сезон, для якого перевіряється придатність чобіт
     * @return true, якщо чоботи підходять для осені, зими або весни, false - в іншому випадку
     */
    @Override
    public boolean isSuitableForSeason(String season) {
        return season.equalsIgnoreCase("autumn") || season.equalsIgnoreCase("winter") || season.equalsIgnoreCase("spring");
    }

    /**
     * Повертає рекомендовану температуру для носіння чобіт.
     *
     * @return Рекомендована температура у градусах Цельсія (-5 для водонепроникних чобіт, 5 - для звичайних)
     */
    @Override
    public int getRecommendedTemperature() {
        return waterproof ? -5 : 5;
    }

    /**
     * Перевіряє, чи підходять чоботи для дощової погоди.
     *
     * @return true, якщо чоботи водонепроникні, false - якщо ні
     * @throws IOException Якщо виникає помилка при записі в лог-файл
     */
    public boolean isGoodForRain() throws IOException {
        logger.log(String.format("Перевірка на придатність для дощу: %s", waterproof));
        return waterproof;
    }

    /**
     * Повертає висоту халяви чобіт.
     *
     * @return Висота халяви у сантиметрах
     * @throws IOException Якщо виникає помилка при записі в лог-файл
     */
    public int getShaftHeight() throws IOException {
        logger.log(String.format("Отримано висоту халяви: %d см", shaftHeight));
        return shaftHeight;
    }

    /**
     * Повертає рядкове представлення чобіт.
     *
     * @return Інформація про чоботи у форматі рядка
     */
    @Override
    public String toString() {
        return String.format("Чоботи %s (розмір %.1f, водонепроникні: %s, висота халяви: %d см)",
                brand, size, waterproof, shaftHeight);
    }
}