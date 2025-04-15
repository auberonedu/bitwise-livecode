public class Practice {
    public static void main(String[] args) {
        int num = 0b11111011; // 0b is binary 0x is hexadecimal
        num = num >> 4; //shift over 4
        int mask = 0xf;

        int result = num & mask; // masking to get only the last 4
        System.out.println(Integer.toBinaryString(result));

        System.out.println("Yay bitwise operations!");
    }
}