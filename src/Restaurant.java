
public class Restaurant {
	// Private because we want to ensure we don't change the variables
	private String restaurantName;
	private Table[] tables;

	public Restaurant(String restaurant, int maxNumberOfTables) {
		restaurantName = restaurant;
		tables = new Table[maxNumberOfTables];
	}

	void addTable(Table table) {
		int i = 0;
		while (i < tables.length) {
			// Check if place is empty.
			if (tables[i] == null) {
				tables[i] = table;
				return;
				// Check if this is the last place for a table (if true send error that
				// restaurant is full)
			} else if (i == tables.length - 1) {
				System.out.println("Error: reastaurant is full of tables!");
			}
			i++;
		}
	}

	void printRestaurantInfo() {
		// Prints the first lines of the info
		System.out.println(
				restaurantName + " has a capacity of " + tables.length + " and contains the following tables:");
		System.out.println("----------------------------------");
		// Loops all the tables
		int i = 0;
		while (i < tables.length) {
			// Checks if tables is full
			if (tables[i] != null) {
				tables[i].getStatus();
			}
			i++;
		}
	}

	int getDirtiesOverallItem() {
		// First index for the table loop
		int i = 0;
		// Stores how many of that item type are dirty
		int[] dirtiesItem = new int[4];
		// Creates final conclusion of dirties item
		// Set to -1 so that there isn't an item in there
		int overallDirtiesItem = 0;
		// Loops thru tables
		while (i < tables.length) {
			// Checks if there is a table
			if (tables[i] != null) {
				// Second index for item loop
				int x = 0;
				// Loops thru items
				while (x < dirtiesItem.length) {
					if (tables[i].getItem(x)) {
						dirtiesItem[x]++;

					}
					x++;
				}

			}
			i++;
		}
		// New index for item tha's most dirty.
		int y = 0;
		// Loops thru dirtieItems
		while (y < dirtiesItem.length) {
			// Checks if it has a higher dirtyness then the highiest one.
			// If equal the first one is picked (So in this instance it's one instead of 3
			// because 1 is coming first)
			if (dirtiesItem[y] > dirtiesItem[overallDirtiesItem]) {
				overallDirtiesItem = y;
			}
			y++;
		}
		return overallDirtiesItem;
	}
}
