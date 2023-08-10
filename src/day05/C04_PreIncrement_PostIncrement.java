package day05;

public class C04_PreIncrement_PostIncrement {

    public static void main(String[] args) {

        // java`da bir onceki class da yaptıgimiz gibi
        // artirma ve atama, veya artirma ve yazdirma beraber olabilir

        int a = 20;

        int b= 10;

        System.out.println( b = 2* a );// 40

        System.out.println(a= b-5);



        a=10;

        // once a nin degerini b ye atayin , sonra a yi artirin

        b = a++;

        System.out.println("a : " + a + " b : " +b); // a: 11 b:10

        a=10;

        // once a nin degerini bir artırin sonra a nin degerini b ye  atayin

        b = ++a;

        System.out.println("a : " + a + " b : " +b);  // a:11 b :11

        /*
            Bu kullanim sadece a++ a-- ++a --a icin gecerlidir

            burada ++ veya --'yi once mi yoksa sonra mi kullanacagimiz

            bizden istenen duruma gore karar veririz

            artirma once ise ++a

            artirma sonra ise a++
         */


        a= 20;
        System.out.println(a++); // 20

        System.out.println(a); // 21

        a= 20 ;

        System.out.println(--a); // 19

        System.out.println(a); // 19




    }
}
