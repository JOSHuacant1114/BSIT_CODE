/**
 * RUB
 */
public class RUB {

    public static void main(String [] args){
        int delay = 100;

        String lines =
            "And the walls kept tumbling down in the city that we love..................grey clouds roll over the hills bringing darkness from above ............................   but if you close your eyes";
            for(char c : lines.toCharArray()){
                System.out.print(c);
                try{
                    Thread.sleep(delay);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
    }
}
