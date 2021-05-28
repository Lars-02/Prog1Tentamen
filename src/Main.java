
public class Main {

	public static void main(String[] args) {
		// create a restaurant with name "La Bosega" and a maximum of 45 tables.
		Restaurant laBosega = new Restaurant("La Bosega", 45);

		// add 3 new tables to the restaurant with the following names:
		// "Bar-Seat Five","Vikingtable, seat 11","Lounge 4"
		Table barSeat = new Table("Bar-Seat Five");
		Table vikingTable = new Table("Vikingtable, seat 11");
		Table lounge4 = new Table("Lounge 4");
		laBosega.addTable(barSeat);
		laBosega.addTable(vikingTable);
		laBosega.addTable(lounge4);

		// Register items 1 and 3 on the bar seat as dirty
		// Register items 0, 1 and 3 on the viking seat as dirty
		// Register items 1, 2 and 3 on the lounge seat as dirty
		barSeat.dirtyItem(1);
		barSeat.dirtyItem(3);

		vikingTable.dirtyItem(0);
		vikingTable.dirtyItem(1);
		vikingTable.dirtyItem(3);

		lounge4.dirtyItem(1);
		lounge4.dirtyItem(2);
		lounge4.dirtyItem(3);

		// print the restaurant information
		laBosega.printRestaurantInfo();

		// print the overall dirtiest item here
		System.out.print("The item most likely to be dirty is item number: ");
		System.out.println(laBosega.getDirtiesOverallItem());
		// I am getting the result 1 because there are as many 1 items dirty as 3 items.

		System.out.println(); // for readability

		// Clean Items
		System.out.println("Cleaning all items on lounge 4");
		lounge4.cleanWholeTable();
		System.out.println("Cleaning the knife on Bar-Seat Five");
		barSeat.cleanItem(1);

		System.out.println(); // for readability

		// print the restaurant information
		laBosega.printRestaurantInfo();

		// print the overall dirtiest item here
		System.out.print("The item most likely to be dirty is item number: ");
		System.out.println(laBosega.getDirtiesOverallItem());
	}

}
