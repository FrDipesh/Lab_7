public class Lab7Task1 {
    public static void main(String[] args) {

        System.out.println("Count from 0-30");
        for(int i = 0; i <= 30; i++) {
            System.out.println(i);
        }

        System.out.println("\nCount from 30-0");
        for(int j = 30; j >= 0; j--) {
            System.out.println(j);
        }

        System.out.println("\nCount from 0-18 by 3s");
        for(int k = 0; k <= 18; k+=3) {
            System.out.println(k);
        }

        System.out.println("\nCount from 10-0 by 2s");
        for(int u = 10; u >= 0; u-=2) {
            System.out.println(u);
        }

    }
}
