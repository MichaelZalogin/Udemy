package L19;

public class VarArguments {
    public static void intAgrs(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            System.out.print(sum + " ");
        }
    }

    public static void intAgrs1(int... a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            System.out.print(sum + " ");
        }
    }

    public static void abc(int[]... a) {
        //some code
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        intAgrs(array1);
        System.out.println();
        intAgrs1(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println();

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int a : array1) {//Foreach loop
            System.out.print(a + " ");
        }
    }
}