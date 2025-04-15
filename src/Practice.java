public class Practice {
    public static void main(String[] args) {
        int number = 0b101010111011001111011011;
        //right shift operator
        number = number >> 8;
        //I've now right shifted my binary #s by 8 digit spaces
        //now my 8 least significant spaces represent GREEN in rgb 24 bit
        //(if I want red I can: number = number >> 16;)
        
        //but I'm only interested in the 'xxxxXXXX' digit spaces
        int mask = 0xff;
        int result = number & mask;
        System.out.println(Integer.toBinaryString(result));
    }
}