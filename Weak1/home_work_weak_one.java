package WeakOne;

import javax.swing.text.html.FormView;
import java.util.Random;

public class home_work_weak_one {

    public static void main(String[] args) {
     
        
     
     
        //Question-1:
        /**
     * Okul puanlarının harf karşılığını yazan program.
     * Random alınabilir değerler.
     * 0 - 35 arası FF
     * 35 - 50 arası DC
     * 50 - 70 arası BB
     * 70 - 100 arası AA
     */

     //Answer-1:

      Random random =new Random();

      int puan =random.nextInt(100); //RANDOM DEĞER ÜRETME
            

        if(   puan <36){ //FF ŞARTI

        System.out.println("Puanınızın Sayısal Değeri:"+puan+"  Harf karşılığı:FF");
         }

        else if(35<puan &&  puan <51){ //DC ŞARTI
        System.out.println("Puanınızın Sayısal Değeri:"+puan+"  Harf karşılığı:DC");;
 
         }
        else if( 50<puan&& puan<71){//BB ŞARTI
        System.out.println("Puanınızın Sayısal Değeri:"+puan+"  Harf karşılığı:BB");;
         }

        else if (70<puan && puan<101){ //AA ŞARTI
            System.out.println("Puanınızın Sayısal Değeri:"+puan+"  Harf karşılığı:AA");;
        }

        //****************************************************************************************** */

        //Question-2:
            /**
         * 3 ile 100 arasında asal sayıların toplamını bulan program.
         */


          //Answer-1:



        for (int i = 3; i < 101; i++) {
            int sayac=0;
            int toplam=0;
            
             for (int j = 2; j < i-1; j++) {
                 
                if(i%j==0){ //Sayı bölünürse asal değildir
                        sayac +=1;
                    }
                
                    
                
             }

            if(sayac==0){  //sayac kontrolu ileasallığını kontrol eder
                System.out.println(i+" >>Sayısı Asalsayıdır");

                toplam+=toplam;
                System.out.println("Toplam="+toplam);
                
            }



             
          }


          /******************************************************************* */


          //Question-3:

            /**
         * 200 ile 500 arasındaki 3 ile tam bölünen sayılar dışındaki sayıların toplamını bulan program.
         *
         */

         //Answer-3:




        int genel_toplam=0;
        int üc_toplam=0;

         for (int i = 200; i < 501; i++) {
             
            genel_toplam +=i;  //0 İLE 500 ARASINDAKİ TÜM SAYILARIN TOPLAMI
            if(i%3==0){
                üc_toplam +=i; //YANLIZCA ÜÇE BÖLÜNEN DEĞERLERİNTOPLAMI


            }
             
            
         }
         //TÜM TOPLAMDANÜÇE BÖLÜNENLERİ ÇIKARINCA CEVAP ORTAYA CIKIYOR
         System.out.println("TOPLAM= "+(genel_toplam-üc_toplam));


        /*************************************************************** */

        

        //Qestion-4
        

        /**
         * 0 ile 500 aralığında ve
         * Bu sayılardan 50 ile 100 arasında bir sayı bulunana kadar rastgele sayılar seçilir.
         * 50 ile 100 arasındaki sayının kaçıncı seçimde bulunduğunu bulan program.
         */


         //ANSWER-4:





    



        for (int j = 1; ; j++) {

            int i=random.nextInt(500);
            

            if(50<i && i<101){
                System.out.println("Random Sayısı:"+i+"Bulunan Deneme Sayısı:"+j);
                break;
            }

            
        }





























         



        









    }
    
}
