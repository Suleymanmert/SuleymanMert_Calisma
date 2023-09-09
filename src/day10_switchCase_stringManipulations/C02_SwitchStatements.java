package day10_switchCase_stringManipulations;

import java.util.Scanner;

public class C02_SwitchStatements {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan gun numarasini alip
        // hafta ici veya hafta sonu yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen gun sayisini yaziniz");
        int gunNo=scan.nextInt();

        switch (gunNo) {

            case 1:
                System.out.println("hafta içi");
                break;
            case 2:
                System.out.println("hafta içi");
                break;
            case 3:
                System.out.println("hafta içi");
                break;
            case 4:
                System.out.println("hafta içi");
                break;
            case 5:
                System.out.println("hafta içi");
                break;
            case 6:
                System.out.println("hafta sonu");
                break;
            case 7:
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("Rakamlar 1 ile 7 arasinda olmalidir,yanlis sayi.");


        }
    }
}
