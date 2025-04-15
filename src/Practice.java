public class Practice {
    public static void main(String[] args) {
        int number = 0b110100101100111001011011;
        // can do it 8 to shift 8 and remove blue
        number = number >> 16;
        int mask = 0xff;
        int result = number+mask;
        System.out.println(Integer.toBinaryString((result)));
    }
}