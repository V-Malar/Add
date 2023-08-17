package ipop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(31);
		numbers.add(22);
		numbers.add(14);
		numbers.add(43);
		numbers.add(24);
		numbers.add(15);

		System.out.println("Original list before sorting : \n" + numbers);

		Collections.sort(numbers);

		System.out.println("List after sorting : \n" + numbers);

		Collections.sort(numbers, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 % 10 < o2 % 10) {
					return 1;
				}
				return -1;
			}
		});
		System.out.println("List after using Comparator : \n" + numbers);
	}

}
