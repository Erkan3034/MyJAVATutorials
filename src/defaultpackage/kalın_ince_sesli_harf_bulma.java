package defaultpackage;

public class kalın_ince_sesli_harf_bulma {
	private char kalın;
	

	public kalın_ince_sesli_harf_bulma(char kalın) {
		this.kalın=kalın;
		
	}
	
	public void showChar() {
	    // Kalın sesli harfler dizisi
	    char[] kalın_harfler = {'a', 'ı', 'o', 'u'};

	    boolean kalinMi = false;

	    for (int i = 0; i < kalın_harfler.length; i++) {
	        if (kalın == kalın_harfler[i]) {
	            kalinMi = true;
	            break;
	        }
	    }

	    if (kalinMi) {
	        System.out.println("Girilen harf kalın seslidir!");
	    } else {
	        System.out.println("Girilen harf ince seslidir!");
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//harf dizisi oluştur, (ince) gelen harfi bhurdan kontrol et eğer varsa ince. değilse kalın
		
	kalın_ince_sesli_harf_bulma girdi= new kalın_ince_sesli_harf_bulma('ğ');
	
	girdi.showChar();
	
	}

}
