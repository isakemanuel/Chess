import java.util.Scanner;

public class Tester
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Board b = new Board();
        
        /*
        b.move(1,0,3,0);
        b.move(6,0,4,0);
        b.move(3,0,4,0);
        b.move(4,0,5,0);
        */
        
        while(true){
            int x = in.nextInt();
            int y = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();
            b.move(x,y,x2,y2);
        }
        
    }
}
