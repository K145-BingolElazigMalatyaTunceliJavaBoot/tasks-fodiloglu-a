package WeakThreeWorkTwo;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Armchair business=new BusinessChair("Business","BUS",5);
        Armchair firstClass=new FirstClassChair("FirsClass","FCL",5);

         business.createArmArray();
         business.getArmArray();
         business.PropertiesDomestic();
         firstClass.PropertiesDomestic();







    }
}
