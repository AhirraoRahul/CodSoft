package Rahul;
import java.util.Random;
public class generateRandom {

	public static void main(String[] args) {
		Random rand = new Random();
		   
        int rand_int1 = rand.nextInt(100);
        int rand_int2 = rand.nextInt(100);
   
        System.out.println("Random Integers: "+rand_int1);
        System.out.println("Random Integers: "+rand_int2);
   
        double rand_dub1 = rand.nextDouble();
        double rand_dub2 = rand.nextDouble();
   
        System.out.println("Random Doubles: "+rand_dub1);
        System.out.println("Random Doubles: "+rand_dub2);

	}

}
