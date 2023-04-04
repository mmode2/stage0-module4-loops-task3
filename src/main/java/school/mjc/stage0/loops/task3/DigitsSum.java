package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        t = Math.abs(t);
        int length = String.valueOf(t).length();
        int sum = 0;
        int reminder = 0;
        for (int i = 0; i < length; i++) {
            reminder = t % 10;
            sum+=reminder;
            t = ( t-reminder)/10;
        }

        System.out.println(sum);
    }
}
