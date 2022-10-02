public class NumberValidator{
	
	private static final char [] NUMBERS = {'0','1','2','3','4','5','4','7','8','9','.'};

	public static boolean isValid(String value){
	    char [] outer = value.toCharArray();
	    for(int i = 0;i<outer.length;i++){
	    	char c = outer[i];
	    	boolean found = false;

        	for(int j = 0;j<NUMBERS.length;j++){
        		char innerc = NUMBERS[j];
        		if(c == innerc){
        			found = true;
        		}
	        }

	        if(!found){
	        	return false;
	        }
	    }
	    return true;
	}
}