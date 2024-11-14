package AbstractClasses;

public class Main {

	public static void main(String[] args) {
		
		WomanScoreCalculator womanScore = new WomanScoreCalculator();
		womanScore.calculate();
		
		KidsScoreCalculator kidsScore= new KidsScoreCalculator();
		kidsScore.calculate();

		ManScoreCalculator manScore = new ManScoreCalculator();
		manScore.calculate();
		
		
	    //BaseGameCalculator baseGameCalculator = new BaseGameCalculator(); // Abstract classlar direkt olarak new'lenemez( örneği oluşturulamaz ! )
		
		BaseGameCalculator baseGameCalculator = new WomanScoreCalculator(); // referans tutarak kullanılırlar
		baseGameCalculator.calculate();
		
	
		BaseGameCalculator olderCalculator = new OlderGameCalculator();
		olderCalculator.calculate();
	}

}
