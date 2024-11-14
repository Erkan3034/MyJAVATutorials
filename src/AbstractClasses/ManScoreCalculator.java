package AbstractClasses;

public class ManScoreCalculator extends BaseGameCalculator {

	@Override
	public void calculate() { // BaseGameCalculator classı abstract oldğu için ManScoreCalculator bu metodu kendine göre override etmesi zorunlu hale geldi.
		System.out.println("Man's score has been calculated : 95 ");
		
		
	}

}
