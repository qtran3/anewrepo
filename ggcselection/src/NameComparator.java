
/**
 * @author: Quan Tran
 *
 */

import java.util.Comparator;

public class NameComparator implements Comparator<Drink>{

	@Override
	public int compare(Drink o1, Drink o2) {
		return (o1.getName().toLowerCase()
					.compareTo(
						o2.getName().toLowerCase()));
	}

}
