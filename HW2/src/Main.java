
public class Main {
	public static void main(String[] args) {
		String input = "abcabacaa";
		Huffman h = new Huffman(input);
		String encoding = h.encode();
		System.out.println(encoding);
		String decoded = h.decode(encoding);
		System.out.println(decoded);
	}
	
	
}
