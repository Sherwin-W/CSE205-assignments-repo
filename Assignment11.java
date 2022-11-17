// ADD YOUR HEADER

public class Assignment11 {

	public static void main(String[] args) {
		Solver solver = new Solver();
		solver.readGrid();

		System.out.println("Original grid: ");
		solver.printGrid();

		solver.depthFirstSearch();

		System.out.println("Grid after increment: ");
		solver.printGrid();
	}
}