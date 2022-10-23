import java.util.Random;

public class RandomNumbers {
    public int getCountOfRandomNumbers(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(10);
            sum = sum + temp;
            result++;
        }
        return result;
    }
    public int getMinOfRandomNumbers(int max) {
        Random random = new Random();
        int minn = 30;
        int sum = 0;
        //int maxx = 0;
        while (sum < max) {
            int temp = random.nextInt(30);
            sum = sum + temp;
            if(temp < minn) minn = temp;
            //if(temp > maxx) maxx = temp;
        }
        return minn;
    }
    public int getMaxOfRandomNumbers(int max) {
        Random random = new Random();
        int maxx = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(30);
            sum = sum + temp;
            if(temp > maxx) maxx = temp;
        }
        return maxx;
    }


    public static void main(String[] args) {
        RandomNumbers number= new RandomNumbers();
        int equals= number.getCountOfRandomNumbers(30);
         System.out.println(equals);
         int smallest = number.getMinOfRandomNumbers(5000);
         System.out.println("najmniejsza liczba wynosi");
         System.out.println(smallest);
         int largest = number.getMaxOfRandomNumbers(5000);
        System.out.println("najwieksza liczba wynosi");
         System.out.println(largest);
    }
}


