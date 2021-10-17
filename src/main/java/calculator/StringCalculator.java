package calculator;

class StringCalculator {

    public int add(String input) {
    	//if input string is empty!
    	if (input.isEmpty()) {
			return 0;
		} else {
			ArrayList<String> negativeNumbers = new ArrayList<String>();
			//if there is a custom delimiter
			if(input.startsWith("//")) {
				String s2 = input.replace("//", "");
				String[] sample = s2.split("[\n]");
				String newDelimeter = sample[0];
				int sum1= 0;
				String[] test = s2.split("[\n,"+newDelimeter+"]");
				
				//check for negative number
				for(String s1: test) {
					if(s1.equals(""))
						continue;
					int num = Integer.parseInt(s1);
					if(num<0)
						negativeNumbers.add(s1);
				}
				if(negativeNumbers.size()>0) {
					throw new RuntimeException("negatives not allowed: " + String.join(", ",negativeNumbers));
				}
				for(String s:test) {
					if(s.equals(""))
						continue;
					sum1= sum1 + Integer.parseInt(s);
				}
				return sum1;
			}else {
				//when delimiter is ,
			int sum1= 0;
			String[] test = input.split("[\n,]");
			
			//check for negative number 
			for(String s1: test) {
				if(s1.equals(""))
					continue;
				int num = Integer.parseInt(s1);
				if(num<0)
					negativeNumbers.add(s1);
			}
			if(negativeNumbers.size()>0) {
				throw new RuntimeException("negatives not allowed: " + String.join(", ",negativeNumbers));
			}
			for(String s:test) {
				if(s.equals(""))
					continue;
				sum1= sum1 + Integer.parseInt(s);
			}
			return sum1;
			}
		}
    }

}