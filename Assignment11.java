// Assignment: 11
// Name: Sherwin Wang
// StudentID: 1224486887
// Lecture: M W F 10:10 AM - 11:00 AM
// Description: Assignment 11 main class

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