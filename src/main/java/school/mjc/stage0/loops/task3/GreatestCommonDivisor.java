package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {

        int result = 0;
        int min = Math.min(first, second);
        if (min ==0){
            System.out.println(Math.max(first, second));
            return;
        }
        for (int i = min; i > 1; i--) {
            if (second % i == 0 && first % i == 0) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
