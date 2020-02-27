import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ZweihandHolder
{
    public static void main(String[] args)
    {
        System.out.println("Yeah, this isn't done yet.");
	System.out.println(Math.PI);
    }

    

    public int roll(int size)
    {
	    return ThreadLocalRandom.current().nextInt(1,size + 1);
    }
}
