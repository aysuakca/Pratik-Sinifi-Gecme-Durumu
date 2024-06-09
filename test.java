import java.util.Scanner;

public class test {
}
public static void main(String[] args) {
    int mat, fizik, turkce, kimya, muzik;

    Scanner input = new Scanner(System.in);
    System.out.print("Lütfen Matematik Notunuzu Giriniz :");
    mat = input.nextInt();

    if (mat < 0 || mat > 100) {
        mat = 0;
    }
    System.out.print("Lütfen Fizik Notunuzu Giriniz :");
    fizik = input.nextInt();
    if (fizik<0 || fizik>100) {
        fizik = 0;
    }

    System.out.print("Lütfen Türkçe Notunuzu Giriniz :");
    turkce = input.nextInt();
    if (turkce<0 || turkce>100) {
        turkce = 0;
    }

    System.out.print("Lütfen Kimya Notunuzu Giriniz :");
    kimya = input.nextInt();
    if (kimya<0 || kimya>100){
        kimya = 0;
    }

    System.out.print("Lütfen Müzik Notunuzu Giriniz :");
    muzik = input.nextInt();
    if (muzik<0 || muzik>100) {
        muzik = 0;
    }

    double average = (mat+fizik+turkce+kimya+muzik)/5;

    System.out.println("Ortalamaniz :" +average);

if (average>= 55){

        System.out.println("Sinifi Gectiniz!");
}else{
        System.out.println("Sinifta Kaldiniz!");
}
}




