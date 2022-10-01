import java.util.Scanner;
public class nothesaplayanprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mat, fizik, kimya, müzik, türkçe, tarih;
		double ortalama;
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("matematik notunuzu giriniz: ");
		mat = input.nextInt();
		
		System.out.printf("fizik notunuzu giriniz: ");
		fizik = input.nextInt();
		
		System.out.printf("kimya notunuzu giriniz: ");
		kimya = input.nextInt();
		
		System.out.printf("türkçe notunuzu giriniz: ");
		türkçe = input.nextInt();
		
		System.out.printf("tarih notunuzu giriniz: ");
		tarih = input.nextInt();
		
		System.out.printf("müzik notunuzu giriniz: ");
		müzik = input.nextInt();
		
		ortalama = (mat + fizik + kimya + müzik + türkçe + tarih)/6;
				
		System.out.println("ortalamanýz: " + ortalama);	
		
		String durum = ortalama>=60 ? "Geçtiniz" : "Kaldýnýz";
		System.out.printf("durumunuz: " + durum);
	}

}
