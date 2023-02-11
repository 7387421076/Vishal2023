package Logicalprograms;

public class palindrome {
	public static void main(String[] args) {
		String str = "kaka";
		String rev= "";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev =rev+str.charAt(i);
		}
		System.out.println(str);
		System.out.println(rev);
		if(str.equals(rev)) {
		System.out.println("string is palindrome");
		
	}else
		System.out.println("string is not palindrome");
		
		
}

}
