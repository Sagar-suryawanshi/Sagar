package Simple;

public class LongestString2 {
	public static void main(String[] args) {
		String string="“It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distributionqqqqqqqqqqqqqqqqqqq of letters, as opposed to using 'Content here, content here', making it look like readable English"
				;
		String word="",large="";
		String[] words=new String [100];
		
		int length=0;
		
		string=string+"";
		
		for(int i=0; i<string.length();i++) {
			if(string.charAt(i)!=' ') {
				word=word+string.charAt(i);
			}
			else {
				words[length]=word;
				length++;
				word="";
			}
		}
		for(int j=0;j<length;j++) {
			if(large.length()<words[j].length()) {
				large=words[j];
			}
			
		}
		System.out.println("largest word="+large);
	}

}
