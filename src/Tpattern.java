public class Tpattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for(int j = 1; j <= i / 2; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
