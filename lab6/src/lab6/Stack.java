package lab6;

/**
 * Параметризований клас Стек, що реалізує структуру даних "стек"
 * @param <T> тип елементів, що зберігаються в стеку
 */
public class Stack<T extends Comparable<T>> {
    private T[] elements;
    private int top;
    private int capacity;

    /**
     * Конструктор створює новий Стек із вказаною ємністю
     * @param capacity максимальна кількість елементів, що можуть зберігатися
     */
    @SuppressWarnings("unchecked")
    public Stack(int capacity) {
        this.capacity = capacity;
        elements = (T[]) new Comparable[capacity];
        top = -1;
    }

    /**
     * Додає елемент на вершину стеку
     * @param item елемент для додавання
     * @return true якщо елемент успішно додано, false якщо стек повний
     */
    public boolean push(T item) {
        if (top < capacity - 1) {
            elements[++top] = item;
            return true;
        }
        return false;
    }

    /**
     * Видаляє та повертає елемент з вершини стеку
     * @return видалений елемент або null якщо стек порожній
     */
    public T pop() {
        if (!isEmpty()) {
            return elements[top--];
        }
        return null;
    }

    /**
     * Повертає елемент з вершини стеку без його видалення
     * @return елемент з вершини стеку або null якщо стек порожній
     */
    public T peek() {
        if (!isEmpty()) {
            return elements[top];
        }
        return null;
    }

    /**
     * Знаходить мінімальний елемент у стеку
     * @return мінімальний елемент або null якщо стек порожній
     */
    public T findMin() {
        if (isEmpty()) return null;

        T min = elements[0];
        for (int i = 1; i <= top; i++) {
            if (elements[i].compareTo(min) < 0) {
                min = elements[i];
            }
        }
        return min;
    }

    /**
     * Перевіряє чи стек порожній
     * @return true якщо стек не містить елементів, false в іншому випадку
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Повертає поточну кількість елементів у стеку
     * @return кількість елементів
     */
    public int size() {
        return top + 2;
    }
}
