/**
 * @author: Quan Tran
 *
 */
public class Soda extends Drink{
	private boolean isDiet;
	public Soda(String name, String ounces, String isDiet) {
		super(name, ounces);
		this.setDiet(isDiet);
	}


	public boolean getDiet() {
		return this.isDiet;
	}
	public void setDiet(boolean diet) {
		this.isDiet=diet;
	}
	public void setDiet(String strDiet) {
		if (strDiet.length()>=1){
			char f=strDiet.charAt(0);
			setDiet((Character.toLowerCase(f))=='t');
		}
		setDiet(false);
	}

	/* (non-Javadoc)
	 * @see Drink#setOunces(int)
	 */
	@Override
	public void setOunces(int ounces) {
		if (ounces<8||ounces>16) ounces=12;
		this.ounces=ounces;

	}

	/* (non-Javadoc)
	 * @see Drink#findCalories()
	 */
	@Override
	public int findCalories() {
		if (isDiet==true) return 0;
		//isDiet==false
		if (ounces<13) return 120;
		return 260;
	}
	

	@Override
	public String toString() {
		return String.format("Soda isDiet: %b\n%s", this.getDiet(),super.toString());
				
	}



}
