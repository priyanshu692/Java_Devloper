package company;

import java.util.Scanner;

public class Cuboid_area {
    public static void main(String[] args) {
        int length, hight,width ,total_area , volume;
        Scanner value = new Scanner(System.in);
        System.out.print("Enter a lenth : ");
        length = value.nextInt();
        System.out.print("Enter a hight : ");
        hight = value.nextInt();
        System.out.print("Enter a width : ");
        width = value.nextInt();
        total_area = 2*(length*width+length*hight+hight*width);
        volume = length*width*hight;
        System.out.println("Total area = "+total_area);
        System.out.println("volume = "+volume);
    }
}
