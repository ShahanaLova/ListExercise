import java.util.Random;

public class Milion {
    public static void main(String[] args) {
        Random r = new Random();
        int[] tes = new int[1001];
        int count = 0;
        for (int i = 0; i <= 150; i++) {
            int q = r.nextInt(150);
            for (int j = 0; j <= 1000; j++) {
                tes[i] = r.nextInt();
                if (q == tes[j]) {
                    count++;
                }
            }

            System.out.println(i + "=" + count);

        }
    }


}

