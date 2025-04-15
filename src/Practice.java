public class Practice {
    public static void main(String[] args) {
        int number = 0b010110110101001011111111;
        number = number >> 16;
        System.out.println(Integer.toBinaryString(number));

        int mask = 0xf;
        int result = number & mask;
        System.out.println();
        System.out.println(Integer.toBinaryString(result));
    }
}