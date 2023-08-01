package D01_int_StringTurleri;

public class C04_String {

    public static void main(String[] args) {

        String str1="Java ";
        String str2="Candir ";
        String str3="tekrar edersen.";

        System.out.println(str1 + str2 + str3);//Java Candir tekrar edersen.



        String str="suleyman mert";

        System.out.println(str);//suleyman mert


        String isim="istanbul cok guzeldir";

        System.out.println(isim.toUpperCase());//İSTANBUL COK GUZELDİR *** toUpperCase harfleri buyuk yapıyor

        System.out.println(isim.toLowerCase());//istanbul cok guzeldir *** toLowerCase ise harfleri kucuk yapiyor


        String str4="123";
        String str5="456";
        System.out.println(str4+str5);// --123456-- String bu sekilde str4 ve str5 i yanyana yazarak birlestirir.

        // verilen isim ve soyısımse
        // girilen ali uzunkavak databas e kaydedildi
        // seklinde yazdirin

        String adi="ali ";
        String soyadi="cabbar";
        System.out.println("Girilen " + adi +" "+ soyadi + " databese kaydedildi ");//Girilen ali  cabbar databese kaydedildi




    }
}
/*
    git init
    git add .
        git commit -m "first commit"
        git branch -M main
        git remote add origin https://github.com/Suleymanmert/Java_Team120.git
        git push -u origin main

 */