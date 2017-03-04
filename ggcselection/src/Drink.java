/**
 * @author: Quan Tran
 *
 */

import java.util.Comparator;

public abstract class Drink extends NameComparator {
	private String  name;
	protected int ounces;
	public Drink(String name, String ounces){
		this.setName(name);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOunces() {
		return ounces;
	}
	public abstract void setOunces(int ounces);
	
	public void setOunces(String strOunces){
		int i,j,ou=12;
		StringBuilder dgit=new StringBuilder("");
		for (i=0;i<strOunces.length();i++){
			char c=strOunces.charAt(i);
			if ('0'<=c&&c<='9')	dgit.append(strOunces.charAt(i));
		}
		if (dgit.length()<3) ou=12;
		else {
			ou=0;
			for (j=2;j<dgit.length();j+=3)
				ou=(ou*10)+(dgit.charAt(j)-'0');
		}
		setOunces(ou);
	}
	public abstract int findCalories();

	
	@Override
	public String toString() {
		return String.format("Name: %s\nOunces: %d\nCalories: %d\n",this.name,this.ounces,this.findCalories());
	}

}
