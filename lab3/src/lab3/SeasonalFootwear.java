package lab3;

/**
 * Інтерфейс для взуття з сезонними характеристиками
 */
public interface SeasonalFootwear {
    /**
     * Перевіряє, чи підходить взуття для поточного сезону
     * @param season поточний сезон
     * @return true, якщо взуття підходить для сезону, false - якщо ні
     */
    boolean isSuitableForSeason(String season);

    /**
     * Отримує рекомендовану температуру використання
     * @return рекомендована температура у градусах Цельсія
     */
    int getRecommendedTemperature();
}