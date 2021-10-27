
public class QuickSort {
	
	String words[];
	int length;

	public static void main(String[] args) {

		QuickSort sorter = new QuickSort();
		// the strings need to be sorted are put inside this array
		String[] wordlist = { "right", "subdued", "trick", "crayon", "punishment", "silk", "describe", "royal",
				"prevent", "slope" };
		sorter.quickSort(wordlist);

		// displaying sorted list
		for (String word : wordlist) {
			System.out.print(word);
			System.out.print(", ");
		}
	}

	
	void quickSort(String array[]) {
		if (array == null || array.length == 0) {
			return;
		}
		this.words = array;
		this.length = array.length;
		order(0, length - 1);
	}

	//method to analyze list and keep sorting the words in the list
	// to the correct in regards to the pivot point (Smith J, 2018)
	void order(int low, int high) {
		int i = low;
		int j = high;
		//pivot keeps changing with sublists
		String pivot = this.words[low + (high - low) / 2];

		while (i <= j) {
			while (this.words[i].compareToIgnoreCase(pivot) < 0) {
				i++;
			}

			while (this.words[j].compareToIgnoreCase(pivot) > 0) {
				j--;
			}

			if (i <= j) {
				swap(i, j);
				i++;
				j--;
			}
		}
		
		if (low < j) {
			order(low, j);
		}
		if (i < high) {
			order(i, high);
		}
	}

	//method swaps values in the list
	void swap(int i, int j) {
		String temp = this.words[i];
		this.words[i] = this.words[j];
		this.words[j] = temp;
	}

}
/**References:
 * Smith J, 2018, Stack Overflow, viewed 05 October 2021,<https://stackoverflow.com/questions/29294982/using-quicksort-on-a-string-array>.
 */
	