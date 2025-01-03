import java.util.Random;    

public class EXAMPLE {

    public static void main (String [] args){
        Random random = new Random();
        int x = random.nextInt(6)+1;
        double y = random.nextDouble(6);

        System.out.print(x);
        System.out.println(y);
    }
}
