import java.util.Scanner;
public class nothesaplayanprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mat, fizik, kimya, m�zik, t�rk�e, tarih;
		double ortalama;
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("matematik notunuzu giriniz: ");
		mat = input.nextInt();
		
		System.out.printf("fizik notunuzu giriniz: ");
		fizik = input.nextInt();
		
		System.out.printf("kimya notunuzu giriniz: ");
		kimya = input.nextInt();
		
		System.out.printf("t�rk�e notunuzu giriniz: ");
		t�rk�e = input.nextInt();
		
		System.out.printf("tarih notunuzu giriniz: ");
		tarih = input.nextInt();
		
		System.out.printf("m�zik notunuzu giriniz: ");
		m�zik = input.nextInt();
		
		ortalama = (mat + fizik + kimya + m�zik + t�rk�e + tarih)/6;
				
		System.out.println("ortalaman�z: " + ortalama);	
		
		String durum = ortalama>=60 ? "Ge�tiniz" : "Kald�n�z";
		System.out.printf("durumunuz: " + durum);
	}

}
