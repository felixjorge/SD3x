
import java.util.*;

public class GreedyDynamicAlgorithms {

	/**
	 * Goal: find the smallest number of red intervals to select, such that
	 * every blue interval overlaps with at least one of the selected red intervals.
	 * Output this number
	 * 
	 * @param red - the list of red intervals
	 * @param blue - the list blue intervals
	 * @return
	 */
	public static int optimalIntervals(ArrayList<Interval> red, ArrayList<Interval> blue) {
		//TODO
		return -1;
	}
	
	/**
	 * Goal: find any path of lowest cost from the top-left of the grid (grid[0][0])
	 * to the bottom right of the grid (grid[m-1][n-1]).  Output this sequence of directions
	 * 
	 * @param grid - the 2d grid containing the cost of each location in the grid.
	 * @return
	 */
	public static List<Direction> optimalGridPath(int[][] grid) {
		int m = grid.length; int n = grid[0].length;
		
		int[][] min = new int[m][n];
		int minPath = minPath(grid, 0, 0, min);
		System.out.println("min cost " + minPath);
		printArray(min);
		
		List<Direction> list = new ArrayList<>();
		int i = 0; int j = 0;
		while (true) {
			if (i == m-1 && j == n-1) break;
			if (!isValidSquare(grid, i, j+1) || min[i+1][j] < min[i][j+1]) {
				list.add(Direction.DOWN);
				i++;
			} else {
				list.add(Direction.RIGHT);
				j++;
			}
		}
		
		return list;
	}
	
	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static boolean isValidSquare(int[][] grid, int row, int col) {
//		System.out.println("call isvalid on " + row +  " " + col);
//		System.out.println("grid size " + grid.length + "x" + grid[0].length);
		return row < grid.length && col < grid[0].length;
	}
	
	public static int minPath(int[][] grid, int row, int col, int[][] min) {
		System.out.println("\tcall minPath on " + row + " " + col);
		if (!isValidSquare(grid, row, col)) { // invalid square
//			System.out.println("invalid " + row + " " + col);
			return Integer.MAX_VALUE;
		}
		
		if (row == grid.length - 1 && col == grid[0].length - 1) { // at bottom right
			min[row][col] = grid[row][col];
			return grid[row][col];
		} 
		
		if (min[row][col] == 0) {
//			int right = minPath(grid, row, col+1, min);
//			int down = minPath(grid, row+1, col, min);
//			System.out.println("right " + right + " down " + down);
//			if (right < down) {
//				min[row][col] = grid[row][col] + right;
//			} else {
//				min[row][col] = grid[row][col] + down;
//			}
			min[row][col] = grid[row][col] + Math.min(minPath(grid, row, col+1, min), minPath(grid, row+1, col, min));
		}
		
		return min[row][col];		
	}
	
	/**
	 * A simple Direction enum
	 * directions can be either DOWN or RIGHT
	 * You will output a list of these in the grid-path problem
	 */
	public static enum Direction {
		DOWN, RIGHT
	}

	/**
	 * A private Interval class to help with the interval question
	 */
	public static class Interval {
		
		int start;
		int finish;
		
		public Interval(int start, int finish) {
			this.start = start;
			this.finish = finish;
		}
		
		/**
		 * sorts a list of intervals by start time, you are free to use this on the first question
		 */
		public static void sortByStartTime(ArrayList<Interval> l) {
			Collections.sort(l, new Comparator<Interval>() {
				public int compare(Interval o1, Interval o2) {
					Interval i1 = (Interval) o1;
					Interval i2 = (Interval) o2;
					return i1.start - i2.start;
				}
			});
		}
		
		/**
		 * sorts a list of intervals by finish time, you are free to use this on the first question
		 */
		public static void sortByFinishTime(ArrayList<Interval> l) {
			Collections.sort(l, new Comparator<Interval>() {
				public int compare(Interval o1, Interval o2) {
					Interval i1 = (Interval) o1;
					Interval i2 = (Interval) o2;
					return i1.finish - i2.finish;
				}
			});
		}
	}
	
}
