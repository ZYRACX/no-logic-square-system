import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), x=n+1, y=n+2, s=n*n;
        while(true)
        {
            if(y!=s)
            {
                System.out.println(y);
                y=y+x;
            }
            else
            break;
        }
        System.out.println(y);
    }
}
