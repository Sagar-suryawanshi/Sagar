package Simple;

public class JaggArr {
	
	private static final String Interger = null;

	public static void main(String[] args) {
		
		Object[] jaggedArray= {2,4,10,new Object[] {12,4,new Object[] {100,99},4},new Object[] {3,2,99},0};
		
		int MaxNumber =findMaxNumber(jaggedArray);
		
		System.out.println("maximum number="+MaxNumber);
	}

	public static int findMaxNumber(Object[] jaggedArray) {
		int MaxNumber=Integer.MIN_VALUE;
		for(Object element:jaggedArray) {
			
			if(element instanceof Object[]) {
				int subMax=findMaxNumber((Object[])element);
				MaxNumber=Math.max( MaxNumber,subMax);
			}
			else if(element instanceof Integer) {
				int num=(Integer) element;
				MaxNumber=Math.max(MaxNumber, num);
			}
		}
		
		return MaxNumber;
	}

}
