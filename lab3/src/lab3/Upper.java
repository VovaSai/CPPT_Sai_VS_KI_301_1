package lab3;

/**
 * Клас Upper представляє верх взуття, який має матеріал та фактор якості.
 */
public class Upper {
    private String material;
    private double qualityFactor;

    /**
     * Конструктор за замовчуванням створює верх з матеріалу "Leather"
     * та фактором якості 1.0.
     */
    public Upper() {
        this.material = "Leather";
        this.qualityFactor = 1.0;
    }

    /**
     * Конструктор для створення верху з заданим матеріалом та фактором якості.
     *
     * @param material Матеріал верху взуття.
     * @param qualityFactor Фактор якості верху.
     */
    public Upper(String material, double qualityFactor) {
        this.material = material;
        this.qualityFactor = qualityFactor;
    }

    /**
     * Задає новий матеріал верху взуття.
     *
     * @param material Новий матеріал верху.
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Повертає матеріал верху взуття.
     *
     * @return Матеріал верху взуття.
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Повертає фактор якості верху взуття.
     *
     * @return Фактор якості верху взуття.
     */
    public double getQualityFactor() {
        return qualityFactor;
    }

    /**
     * Повертає рівень комфорту верху взуття.
     *
     * @return Рівень комфорту верху взуття (за замовчуванням 8).
     */
    public int getComfortLevel() {
        return 8;
    }
}

