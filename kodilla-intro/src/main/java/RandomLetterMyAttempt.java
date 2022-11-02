import java.util.Random;

public class RandomLetterMyAttempt {
public int getCountOfRandomNumber(int max) {
    Random random= new Random();
    int result = 0;
    int sum= 0;
    while (sum < max) {
        int temp = random.nextInt();
        sum = sum + temp;
        result++;
    }
return result;
}
public static void main (String[]args) {
        RandomNumbers letter= new RandomNumbers();
        int equals = letter.getCountOfRandomNumbers(11156);
        System.out.println(equals);
}
}

