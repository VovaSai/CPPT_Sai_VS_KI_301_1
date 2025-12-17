package lab6;

/**
 * Головний клас для тестування реалізації Стеку
 */
public class StackDriver {
    /**
     * Головний метод програми
     * @param args параметри командного рядка (не використовуються)
     */
    public static void main(String[] args) {
        // Тестування стеку з товарами
        Stack<Product> productStack = new Stack<>(5);
        System.out.println("Тестування стеку з товарами:");

        productStack.push(new Product("Ноутбук", 25000.0));
        productStack.push(new Product("Навушники", 2000.0));
        productStack.push(new Product("Смартфон", 15000.0));

        System.out.println("Найдешевший товар: " + productStack.findMin());
        System.out.println("Верхній елемент: " + productStack.peek());
        System.out.println("Видалений елемент: " + productStack.pop());
        System.out.println("Розмір стеку: " + productStack.size());

        // Тестування стеку з завданнями
        Stack<Task> taskStack = new Stack<>(3);
        System.out.println("\nТестування стеку з завданнями:");

        taskStack.push(new Task("Написати звіт", 8));
        taskStack.push(new Task("Зробити презентацію", 5));
        taskStack.push(new Task("Перевірити пошту", 3));

        System.out.println("Завдання з найнижчим пріоритетом: " + taskStack.findMin());
        System.out.println("Верхнє завдання: " + taskStack.peek());
        System.out.println("Видалене завдання: " + taskStack.pop());
        System.out.println("Розмір стеку: " + taskStack.size());
    }
}