import com.sun.org.apache.xml.internal.utils.XML11Char;

import java.util.Scanner;

public class Mainclass {
    public static void main(String[] args) {
        try {
            Scanner reader= new Scanner(System.in);
    System.out.println("Enter zarib x2 (a):");
                    int a= reader.nextInt();
                    System.out.println("Enter zarib x (b):");
                    int b= reader.nextInt();
                    System.out.println("Enter meghdar sabet (c):");
                    int c= reader.nextInt();
                    int delta=(b*b)-(4*a*c);
                    if(delta < 0)
                    {
                        throw new Exception();
                    }
                    else
                    {
                      Double x1=(-b + Math.sqrt(delta) / (2*a));
                          Double x2=(-b - Math.sqrt(delta) / (2*a));
                        System.out.println(" x1 is :"  +x1+" x2 is:"+x2+" ");
                    }

            }
        catch ( Exception e)

        {
            System.out.println("Error:"+e.toString());
        }
        finally {
            System.out.println(" the end ...");
        }
    }
}
