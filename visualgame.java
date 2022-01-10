import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class visualgame {

    private static Object visual;

    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);



        visual = new visual();




    }

}
class visual

{
    String visual;
    Scanner input = new Scanner (System.in);




    visual()
    {
        System.out.println("Enter a value");
        visual = input.next();

        System.out.println(" You made a car with " + visual);
        System.out.println("\t" + visual+"\n" + visual+ "\t"+visual+ "\t"+ visual  );
        System.out.println("\t"+visual);
        System.out.println("\t"+visual);
        System.out.println("\t"+visual);
        System.out.println("\t" + visual+"\n" + visual+ "\t"+visual+ "\t"+ visual  );



    }
    }





