public class Practice {
    public static void main(String[] args) {
        int num = 0b110100101100111001011011;
        num = num >> 16;
        int mask = 0xff;
        int result = num & mask;
        System.out.println(Integer.toBinaryString(result));
    }
}