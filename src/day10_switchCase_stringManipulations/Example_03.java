package day10_switchCase_stringManipulations;

public class Example_03 {
    public static void main(String[] args) {


        String str = "Java Candir";
        System.out.println(str); // Java Candir

        // str in ilk harfini yazdirin
        System.out.println(str.charAt(0)); // J

        // str i tum harfleri buyuk olacak sekilde yazdirin
        System.out.println(str.toUpperCase()); // JAVA CANDİR


        System.out.println(str); // Java Candir
        /*
        burada  tekrardan yazdirirsak java yazdirma olayini eski hali ile yazdirir, yani kucuk yazdirir.
        aslinda biz buyuk harfle yazdirdik ama o sadece bizim istegimiz dogrulktuda yapti. yani tek seferlik.
        ***System.out.println(str.toUpperCase()); // JAVA CANDİR*** burasi bizim istedigimiz.

        ***System.out.println(str); // Java Candir** burasida eski halidir.

         */

        // str i tamamen kucuk harflerden olusan  bir metne  cevirin
        System.out.println(str.toLowerCase()); // java candir

         /*
         yine burada biz tamamen kucuk harfle yazmasini istedik ve java sadece bizim emirlerimize uydu.
          */
    }
}
