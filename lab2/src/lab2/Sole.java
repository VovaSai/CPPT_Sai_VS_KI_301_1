package lab2;

/**
 * Клас Sole представляє підошву взуття, яка має матеріал та фактор якості.
 */
public class Sole {
    private String material;
    private double qualityFactor;

    /**
     * Конструктор за замовчуванням створює підошву з матеріалу "Rubber"
     * та фактором якості 1.0.
     */
    public Sole() {
        this.material = "Rubber";
        this.qualityFactor = 1.0;
    }

    /**
     * Конструктор для створення підошви з заданим матеріалом та фактором якості.
     *
     * @param material Матеріал підошви.
     * @param qualityFactor Фактор якості підошви.
     */
    public Sole(String material, double qualityFactor) {
        this.material = material;
        this.qualityFactor = qualityFactor;
    }

    /**
     * Задає новий матеріал підошви.
     *
     * @param material Новий матеріал підошви.
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Повертає матеріал підошви.
     *
     * @return Матеріал підошви.
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Повертає фактор якості підошви.
     *
     * @return Фактор якості підошви.
     */
    public double getQualityFactor() {
        return qualityFactor;
    }

    /**
     * Повертає рівень комфорту підошви.
     *
     * @return Рівень комфорту підошви (за замовчуванням 7).
     */
    public int getComfortLevel() {
        return 7;
    }
}