package lab6;

/**
 * Клас, що представляє завдання в черзі на виконання
 */
class Task implements Comparable<Task> {
    private String description;
    private int priority;

    /**
     * Конструктор створює нове завдання
     * @param description опис завдання
     * @param priority пріоритет завдання (1-10)
     */
    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return description + " (пріоритет: " + priority + ")";
    }
}
