
public class Main {
	public static void main(String[] args) {
		String input = "abc";
		Huffman h = new Huffman(input);
		String encoding = h.encode();
		System.out.println(encoding);
	}
	
	
}
