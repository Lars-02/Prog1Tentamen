
public class Table {
	// Private because we want to ensure we don't change the variables
	private String name;
	private boolean[] dirtyItems;

	Table(String name) {
		// Set 4 slots in array
		dirtyItems = new boolean[4];
		// Sets name
		this.name = name;
	}

	// No public because we only use one package (This is for everything)
	String getName() {
		return name;
	}

	// Retruns if the item is dirty or not
	boolean getItem(int itemNR) {
		return dirtyItems[itemNR];
	}

	void cleanItem(int itemNR) {
		dirtyItems[itemNR] = false;
	}

	void dirtyItem(int itemNR) {
		dirtyItems[itemNR] = true;
	}

	void cleanWholeTable() {
		int i = 0;
		// Loop thru whole table and clean.
		while (i < dirtyItems.length) {
			dirtyItems[i] = false;
			i++;
		}
	}

	int getNumberOfDirtyItems() {
		int totalDirtyItems = 0;
		int i = 0;
		// If item is dirty +1 for the total.
		while (i < dirtyItems.length) {
			if (dirtyItems[i]) {
				totalDirtyItems++;

			}
			i++;
		}
		// Sends totalDirtyItems.
		return totalDirtyItems;
	}

	void getStatus() {
		System.out.println(name + " currently has " + getNumberOfDirtyItems() + " dirty items.");
	}
}
