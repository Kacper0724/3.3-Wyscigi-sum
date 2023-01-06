import java.util.*;

public class Application {
    public static void main(String[] args) {
        int sumaA = 1000;
        int sumaB = 0;
        Random randomGenerator = new Random();

        while(sumaA > sumaB) {
            sumaA = sumaA + randomGenerator.nextInt(10);
            sumaB = sumaB + randomGenerator.nextInt(50);

            System.out.println("Sum A: " + sumaA + ", Sum B: " + sumaB);
        }

        System.out.println("\nBonus task:");
        // bonus task
        BonusTask bonusTask = new BonusTask();
        bonusTask.divisibleNumbers();
    }
}

class BonusTask {
    void divisibleNumbers(){
        for(int i = 1; i <= 100; i++) {
            if(i % 3 == 0) {
                System.out.println("Number divisible by 3: " + i);
            }
        }
    }
}
