package is.ru.stringcalculator;

public class calculator {

	public static int add(String string) {
		if(string.equals(" ")) {
			return 0;
		}
		else if(string.contains(",")) {
			String[] numbers = (splitNumbers(string, ","));
			return sum(numbers);
		}
		else if(string.contains("\n")) {
			String[] numbers = (splitNumbers(string, "\n"));
			return sum(numbers);
		}
		return Integer.parseInt(string);
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	public static String[] splitNumbers(String numbers, String splitter) {
		return numbers.split(splitter);
	}

	private static int sum(String[] numbers){
 	    int total = 0;
        for(String number : numbers){
		    total += toInt(number);
		}
		return total;
	}

}