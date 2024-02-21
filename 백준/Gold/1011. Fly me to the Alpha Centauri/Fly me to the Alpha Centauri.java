import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int T = in.nextInt();
        
        for(int i=0; i<T; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            
            int distance = y - x;
            
            int max = (int)Math.sqrt(distance);
            
            if(max == Math.sqrt(distance)) {
                System.out.println(max * 2 - 1);
            } else if(distance <= max * max + max) {
                System.out.println(max * 2);
            } else {
                System.out.println(max * 2 + 1);
            }
        }
        
    }
}