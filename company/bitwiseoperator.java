package company;

public class bitwiseoperator {
    public static void main(String[] args) {
        int a=12;
        int b=64;
        System.out.println("and:"+ (a&b) );
        System.out.println("or:"+ (a|b) );
        System.out.println("xor:"+ (a^b) );
        System.out.println("compliment:"+ ~b );
    }
}
