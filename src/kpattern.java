public class kpattern {
    public static void main(String[] args) {
        int k = 1;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
    }
}
