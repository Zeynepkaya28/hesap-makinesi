import java.util.Scanner;;
public class Main {
    public static void main(String[] args) {
        Scanner klavye =new Scanner(System.in);
        int sayi1,sayi2,işlem;
        System.out.println("birinci sayıyı giriniz");
        sayi1 =klavye.nextInt();
        System.out.println("\nikinci sayıyı giriniz");
         sayi2 =klavye.nextInt();
        System.out.println("yapmak istediğiniz işlemi seçiniz");
        System.out.println("lütfen yapmak istediğiniz işlemi seçiniz");
        System.out.println("1-)toplama \n2-)çıkarma \n3-)çarpma \n4-)bölme");
        System.out.println("seçiminiz?");

işlem=klavye.nextInt();
switch(işlem){
    case 1:
        System.out.println("sonuç:"+ (sayi1+sayi2));
        break;
    case 2:
        System.out.println("sonuç:"+ (sayi1-sayi2));
        break;
    case 3:
        System.out.println("sonuç:"+ (sayi1*sayi2));
        break;
    case 4:
        System.out.println("sonuç"+ (sayi1/sayi2));
        break;}
    }
}