public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%-4s", "*");
            }
            System.out.println("");
        }
        System.out.println("");

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.printf("%-4s", "*");
            }
            System.out.println("");
        }
        System.out.println("");

        for (int i = 5; i >= 1; i--) {
            for (int j = i; j <= 5; j++) {
                System.out.printf("%-4s", "*");
            }
            System.out.println("");
        }
    }
}
