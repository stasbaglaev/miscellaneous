package book.shildt.chapter5;

public class Task4 {

    public static void main(String[] args) {

        String strs[] = {"Hello", "a", "While", "z", "Z", "G", "P", "Friend", "S", "q"};
        int a;
        int b;
        String t;
        int size;
        size = strs.length; // количество сортируемых элементов

        // Отображение исходного массива
        {
            System.out.print("Исходный массив:");
            for (int i = 0; i < size; i++) {
                System.out.print(" " + strs[i]);
            }
            System.out.println();
        }

        // Реализация алгоритма пузырьковой сортировки
        for (a = 1; a < size; a++) {
            for (b = size - 1; b >= a; b--) {
                for (int j = 0; (j < strs[b - 1].length() && j < strs[b].length()); j++) {
                    if (strs[b - 1].charAt(j) > strs[b].charAt(j)) { // если требуемый порядок следования не соблюдается, поменять элементы местами
                        t = strs[b - 1];
                        strs[b - 1] = strs[b];
                        strs[b] = t;
                        break;
                    }
                }
            }
        }

        // Отображение отсортированного массива
        {
            System.out.print("Отсортированный массив:");
            for (int i = 0; i < size; i++) {
                System.out.print(" " + strs[i]);
            }
            System.out.println();
        }
    }

}
