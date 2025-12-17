package lab2;

/**
 * Клас Laces представляє шнурки взуття з можливістю налаштування кольору.
 */
public class Laces {
    private String color;

    /**
     * Конструктор за замовчуванням створює шнурки чорного кольору.
     */
    public Laces() {
        this.color = "Black";
    }

    /**
     * Конструктор для створення шнурків з вказаним кольором.
     *
     * @param color Колір шнурків.
     */
    public Laces(String color) {
        this.color = color;
    }

    /**
     * Задає новий колір шнурків.
     *
     * @param color Новий колір шнурків.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Повертає поточний колір шнурків.
     *
     * @return Колір шнурків.
     */
    public String getColor() {
        return color;
    }
}
