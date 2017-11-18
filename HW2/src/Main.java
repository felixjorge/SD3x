import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;


public class Main {
	public static void main(String[] args) {
		// test Huffman
//		String input = "abcabacaa";
//		Huffman h = new Huffman(input);
//		String encoding = h.encode();
//		System.out.println(encoding);
//		String decoded = h.decode(encoding);
//		System.out.println(decoded);
		
		
		// test optimalGridPath
//		int[][] grid = new int[][]{
//			{5, 1, 1},
//			{20, 4, 7},
//			{30, 6, 3}
//		};
//		
//		int[][] min = new int[3][3];
//		List<GreedyDynamicAlgorithms.Direction> list = GreedyDynamicAlgorithms.optimalGridPath(grid);
//		for (GreedyDynamicAlgorithms.Direction dir : list) {
//			System.out.println(dir);
//		}
		
		
		// test optimalIntervals		
		// 1 blue 1 red
		GreedyDynamicAlgorithms.Interval red = new GreedyDynamicAlgorithms.Interval(1, 3);
		GreedyDynamicAlgorithms.Interval blue = new GreedyDynamicAlgorithms.Interval(0, 4);
		ArrayList<GreedyDynamicAlgorithms.Interval> reds = new ArrayList<>();
		ArrayList<GreedyDynamicAlgorithms.Interval> blues = new ArrayList<>();
		reds.add(red);
		blues.add(blue);
		
		int actualOptimal = GreedyDynamicAlgorithms.optimalIntervals(reds, blues);
		System.out.println(actualOptimal);
		
		// no possible solution
		red = new GreedyDynamicAlgorithms.Interval(5, 6);
		blue = new GreedyDynamicAlgorithms.Interval(0, 4);
		reds = new ArrayList<>();
		blues = new ArrayList<>();
		reds.add(red);
		blues.add(blue);		
		actualOptimal = GreedyDynamicAlgorithms.optimalIntervals(reds, blues);
		System.out.println(actualOptimal);
		
		// 7 red 4 blue
		GreedyDynamicAlgorithms.Interval red1 = new GreedyDynamicAlgorithms.Interval(0, 4);
		GreedyDynamicAlgorithms.Interval red2 = new GreedyDynamicAlgorithms.Interval(2, 5);
		GreedyDynamicAlgorithms.Interval red3 = new GreedyDynamicAlgorithms.Interval(4, 8);
		GreedyDynamicAlgorithms.Interval red4 = new GreedyDynamicAlgorithms.Interval(9, 10);
		GreedyDynamicAlgorithms.Interval red5 = new GreedyDynamicAlgorithms.Interval(9, 11);
		GreedyDynamicAlgorithms.Interval red6 = new GreedyDynamicAlgorithms.Interval(10, 12);
		GreedyDynamicAlgorithms.Interval red7 = new GreedyDynamicAlgorithms.Interval(11, 12);
		reds = new ArrayList<>();
		reds.add(red1);
		reds.add(red2);
		reds.add(red3);
		reds.add(red4);
		reds.add(red5);
		reds.add(red6);
		reds.add(red7);
		
		GreedyDynamicAlgorithms.Interval blue1 = new GreedyDynamicAlgorithms.Interval(0, 2);
		GreedyDynamicAlgorithms.Interval blue2 = new GreedyDynamicAlgorithms.Interval(5, 5);
		GreedyDynamicAlgorithms.Interval blue3 = new GreedyDynamicAlgorithms.Interval(7, 10);
		GreedyDynamicAlgorithms.Interval blue4 = new GreedyDynamicAlgorithms.Interval(11, 13);
		blues = new ArrayList<>();
		blues.add(blue1);
		blues.add(blue2);
		blues.add(blue3);
		blues.add(blue4);
		
		actualOptimal = GreedyDynamicAlgorithms.optimalIntervals(reds, blues);
		System.out.println(actualOptimal);
		
	}
	
	
}
