import java.util.Scanner;

public class AppleAndOrange {

    public static void main( String[] args ){
        Scanner in = new Scanner(System.in);

        int s = in.nextInt();
        int t = in.nextInt();

        int a = in.nextInt();
        int b = in.nextInt();

        int m = in.nextInt();
        int n = in.nextInt();

        int i = 0;
        int j = 0;

        int aa = 0;
        int bb = 0;

        while( i != m ){

            int temp = in.nextInt();
            if( (temp + a) >= s && (temp + a)  <= t) aa++;
            i++;

        }

        while( j != n ){

            int temp = in.nextInt();
            if( (temp + b) >= s && (temp + b)  <= t)  bb++;
            j++;

        }

        System.out.println(aa);
        System.out.println(bb);

        in.close();

    }
}
