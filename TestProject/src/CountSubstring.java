
public class CountSubstring {

	public static void main(String[] args) {
		String pattern = "man";
		String str = "dmaninman";
		
		int count = 0;
		int pLen = pattern.length();
		int sLen = str.length();
		
		for(int i=0;i<=sLen-pLen;i++) {
			if(pattern.equalsIgnoreCase(str.substring(i, i+pLen)))
				count++;
		}
//		String ss = "hello.hi.nome.be";
//		String[] len = ss.split("\\.");
//		System.out.println(len.length);
		
		System.out.println("Count is "+count);
		

	}

}
