import java.util.Scanner;

public class Kth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long    k = in.nextLong();
        long    tens = 1;
        long    kI;
        byte    tenPow = 1;

        kI = 0;
        while (kI <= k - tenPow * 9 * tens)
        {
            kI += tenPow * 9 * tens;
            tens *= 10;
            tenPow++;
        }
        System.out.println(findDigit(k, kI, tenPow, tens));
    }
    private static byte findDigit(long k, long k_i, byte ten_pow, long tens)
    {
        long    num;
        byte    digitI;

        num = tens + (k - k_i) / ten_pow;
        digitI = (byte)((k - k_i) % ten_pow);
        while (ten_pow - digitI - 1 > 0)
        {
            digitI++;
            num /= 10;
        }
        return ((byte)(num % 10));
    }
}
