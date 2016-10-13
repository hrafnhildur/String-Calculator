package is.ru.stringcalculator;

public class calculator {

	public static int add(String string) {
		if(string.equals(" ")) {
			return 0;
		}
		else if(string.contains(",") || string.contains("\n")) {
			if(string.contains("\n")) {
				string = string.replaceAll("\n",",");
			}
			String[] arr = splitNumbers(string);
			return sum(arr);
		}
		return Integer.parseInt(string);
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	public static String[] splitNumbers(String n) {
		String[] numbers = n.split(",");
		return numbers;
	}

	private static int sum(String[] numbers){
 	    int total = 0;
        for(String number : numbers){
		    total += toInt(number);
		}
		return total;
	}

}