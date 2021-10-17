package calculator;

class StringCalculator {

    public int add(String input) {
    	if (input.isEmpty()) {
			return 0;
		} else {
			int sum1= 0;
			String[] test = input.split(",");
			for(String s:test) {
				sum1= sum1 + Integer.parseInt(s);
			}
			return sum1;
		}
        
    }

}