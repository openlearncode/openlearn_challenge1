
public class DateValidator{
    public static boolean isValid(String value){
    	
        //Check if the input is 10 characters long
        //DD/MM/YYYY
        if(value.length() != 10){
    		return false;
    	}

        //Check if it contains slashes
        //If it does i can proceed.
    	if(!value.contains("/")){
    		return false;
    	}

        //Cut the date into three pieces
    	String [] pieces = value.split("/");

        //Check if I got 3 pieces as expected
    	if(pieces.length != 3){
    		return false;
    	}

    	//Check that all the pieces are numeric

        //Piece 1 must be between 1-31 because it's DD (Day)

        //Piece 2 must be between 01-12 because it's MM (Month)

        int month = Integer.parseInt(pieces[1]);
        if(month < 1 || month > 12){
            return false;
        }

        //Piece 3 Must be Between 2022-1900 

        int year = Integer.parseInt(pieces[2]);
        if(year < 1900 || year > 2022){
            return false;
        }

        //If you want to you can check if its a leap year.

        boolean isLeapYear = false;



    	return true;
    }
}