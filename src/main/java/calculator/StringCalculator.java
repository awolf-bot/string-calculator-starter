package calculator;

class StringCalculator {

    public int add(String input) {
    	if (input.isEmpty()) {
			return 0;
		} else {
			if(input.startsWith("//")) {
				String s2 = input.replace("//", "");
				System.out.println(s2);
				String[] sample = s2.split("[\n]");
				String newDelimeter = sample[0];
				System.out.println(Arrays.toString(sample)+" "+newDelimeter);
				int sum1= 0;
				String[] test = s2.split("[\n,"+newDelimeter+"]");
				System.out.println(Arrays.toString(test));
				for(String s:test) {
					if(s.equals(""))
						continue;
					sum1= sum1 + Integer.parseInt(s);
				}
				return sum1;
			}else {
			int sum1= 0;
			String[] test = input.split("[\n,]");
			System.out.println(Arrays.toString(test));
			for(String s:test) {
				if(s.equals(""))
					continue;
				sum1= sum1 + Integer.parseInt(s);
			}
			return sum1;
			}
    }

}