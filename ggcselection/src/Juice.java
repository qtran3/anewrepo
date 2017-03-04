/**
 * @author: Quan Tran
 *
 */

public class Juice extends Drink {

	public Juice(String name, String ounces) {
		super(name, ounces);
		
	}

	@Override
	public void setOunces(int ounces) {
		if (ounces<4||16<ounces) ounces=6;
		this.ounces=ounces;
	}

	@Override
	public int findCalories() {
		if (this.getOunces()>8) return 220;
		return 120;
	}

	@Override
	public String toString() {
		return String.format("Juice %s", super.toString());		
	}
	
}
