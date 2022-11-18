import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solver {

	// ********************** ADD YOUR CODE HERE **********************
	Stack<Node> stack;
	int[][] grid;
	int height;
	int width;
	int increment;
	ArrayList<Node> visited;

	public Solver(){
		stack = new Stack<Node>();
		grid = new int[height][width];
		visited = new ArrayList<Node>();
		this.increment = increment;
	}

	public void depthFirstSearch(){
		Node place = new Node(0, 0);
		stack.push(place);
		visited.add(place);
		while(!stack.isEmpty()){

			if(place.getX() < grid.length-1){
				place = new Node(place.getX() + 1, place.getY());
				if(isVisited(place) == false){
					stack.push(place);
				}
			}
			if(place.getY() < grid[0].length-1){
				place = new Node(place.getX(), place.getY() + 1);
				if(isVisited(place) == false){
					stack.push(place);
				}
			}
			if(place.getX() > 0){
				place = new Node(place.getX() - 1, place.getY());
				if(isVisited(place) == false){
					stack.push(place);
				}
			}
			if(place.getY() > 0){
				place = new Node(place.getX(), place.getY() - 1);
				if(isVisited(place) == false){
					stack.push(place);
				}
			}

			place = stack.pop();
			grid[place.getX()][place.getY()] += increment;
			visited.add(place);
		}
	}

	public boolean isVisited(Node node){
		if(this.visited.contains(node)){
			return true;
		}
		else{
			return false;
		}
	}


	// ************************************************************************************
	// ************** Utility method to read grid from user input *************************
	// ************************************************************************************
	public void readGrid() {

		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Height of the grid: ");
			String line = reader.readLine();
			height = Integer.parseInt(line);

			System.out.println("Width of the grid: ");
			line = reader.readLine();
			width = Integer.parseInt(line);
			grid = new int[height][width];

			System.out.println("Increment Factor: ");
			line = reader.readLine();
			increment = Integer.parseInt(line);

			System.out.println("Now enter the grid row by row:");

			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					line = reader.readLine();
					grid[i][j] = Integer.parseInt(line);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// ************************************************************************************
	// ************** Utility method to print grid ****************************************
	// ************************************************************************************
	public void printGrid() {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {

				System.out.print(grid[i][j]);
				System.out.print('	');
			}
			System.out.println();
		}

		System.out.println();
	}

}
