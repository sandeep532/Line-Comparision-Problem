import java.util.*;
public class LineProblemUc2
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int x1 = sc.nextInt();
int y1 = sc.nextInt();
int x2 = sc.nextInt();
int y2 = sc.nextInt();

int a1 = sc.nextInt();
int b1 = sc.nextInt();
int a2 = sc.nextInt();
int b2 = sc.nextInt();

if((int)Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)) == (int)Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)))
System.out.println("lengths are equal");
else
System.out.println("lengths are not equal");

}
}