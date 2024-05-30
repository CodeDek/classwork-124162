import java.util.*;
import java.util.Arrays;
class arraySorting{
    public static void main(String[] args) {
     int[] ten = {10,20,30,40,50,60,70,80,90,100};
     int sum =0;
     int i;
     for (i = 0; i < ten.length; i++) {
    sum += ten[i];
}

     System.out.println("The sum is" +sum);
     reverse(ten);
     System.out.println(Arrays.toString(ten));