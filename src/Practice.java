public class Practice {
    public static void main(String[] args) {

        int num = 0b010110110101101101011011;
        num = num >> 8; //errasing the 8 digits from the right
        int mask = 0xff;
        int result = num & mask;


        System.out.println(Integer.toBinaryString(result));
    }
}