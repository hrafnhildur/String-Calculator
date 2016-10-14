package is.ru.stringcalculator;

public class calculator {

	public static int add(String string) {
		String del = ",";
		if(string.equals(" ")) {
			return 0;
		}
		else if(string.contains(",") || string.contains("\n")) {
			if(string.contains("\n")) {
				string = string.replaceAll("\n",",");
			}
			if(string.contains("//")) {
				del = Character.toString(string.charAt(2));
				string = string.replaceAll(",", del);
				string = string.replaceAll("//", "");
				string = string.replaceFirst(".", "");
				string = string.replaceFirst(".", "");
			}
			String[] arr = splitNumbers(string, del);
			for(String s : arr) {
				if( toInt(s) < 0) {
					noNegatives(arr);
					break;
				}
			}
			return sum(arr);
		}
		return toInt(string);
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	public static String[] splitNumbers(String n, String del) {
		String[] numbers = n.split(del);
		return numbers;
	}

	private static int sum(String[] numbers){
 	    int total = 0;
        for(String number : numbers){
        	if(toInt(number) < 1000) {
		    total += toInt(number);
		}
		}
		return total;
	}

	private static void noNegatives(String[] numbers) {
		String badNums = "";
		boolean neg = false;
		for(String s : numbers) {
			if(toInt(s) < 0) {
				neg = true;
				badNums += s + ",";
			}
		}
		if(neg) {
			throw new IllegalArgumentException("Negatives not allowed: " + badNums);
		}
	}

}