package Simple;

public class LogestString {
	public static void main(String[] args) {
		String string="dummy text of the printing and typesetting industry";
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
