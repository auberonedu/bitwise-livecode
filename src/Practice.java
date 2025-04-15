public class Practice {
    public static void main(String[] args) {
        int number1 = 15;
        int number2 = 0b1110; // 0b means the following is binary
        int number3 = 0x1f; // 0x means hexadecimal;
        // System.out.println(number1);
        // System.out.println(number2);
        // System.out.println(number3);

        int color = 0b110011010101001111100011; // R G B
        int red = color & 0xff0000;
        int green = color & 0x00ff00;
        int blue = color & 0x0000ff;


        int mask = 0xff;
        int blue2 = color & mask;
        color = color >> 8; // color shift over right 8 bits (lose last 8 digits)
        int green2 = color & mask;
        color = color >> 8;
        int red2 = color & mask;

        // int result = number4 & mask;

        // System.out.println(Integer.toBinaryString(result));


        // System.out.println(number1 + " in binary is: " + Integer.toBinaryString(number1));
        // System.out.println(number1 + " in hexadecimal is: " + Integer.toHexString(number1));
    }
}