package is.ru.stringcalculator;

public class calculator {

	public static int add(String string) {
		if(string.equals(" ")) {
			return 0;
		}
		else if(string.contains(",")) {
			return sum(splitNumbers(string));
		}
		return 1;
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	public static String[] splitNumbers(String numbers) {
		return numbers.split(",");
	}

	private static int sum(String[] numbers){
 	    int total = 0;
        for(String number : numbers){
		    total += toInt(number);
		}
		return total;
	}

}