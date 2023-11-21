package pr19;

public class ex23 {
    private Object[] array;

    public ex23(int size) {
        array = new Object[size];
    }

    public void set(int index, Object value) {
        array[index] = value;
    }

    public Object get(int index) {
        return array[index];
    }

    public int size() {
        return array.length;
    }

    public void print() {
        for (Object item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public Object getElement(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            return null;
        }
    }
    public static void main(String[] args) {
        ex23 objArray = new ex23(5);
        objArray.set(0, 1);
        objArray.set(1, 2.25);
        objArray.set(2, false);
        objArray.set(3, "IIT");
        objArray.set(4, 2);

        System.out.println("Данные массива:");
        objArray.print();

        // Приведение типов при извлечении элемента из массива
        int intValue = (int) objArray.get(0);
        double doubleValue = (double) objArray.get(1);
        boolean booleanValue = (boolean) objArray.get(2);
        String stringValue = (String) objArray.get(3);

        System.out.println("Целое значение: " + intValue);
        System.out.println("Строковое значение: " + stringValue);
        System.out.println("Значение с плавающей точкой: " + doubleValue);
        System.out.println("Логическое значение: " + booleanValue);

        Object element = objArray.getElement(1);
        System.out.println("Элемент по 1 индексу: " + element);
    }
}
