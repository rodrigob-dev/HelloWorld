public class Main {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 0;
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
            if (array[i] % 2 == 0) {
                pares ++;
            } else {
                impares++;
            }
        }
        System.out.println("Total: " + total);
        System.out.println("Total even numbers: " + pares);
        System.out.println("Total odd numbers: " + impares);
      
    }
}