package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        else if (query.toLowerCase().contains("cars")){
            return "fast";
        }

        else if (query.toLowerCase().contains("what is your name")){
            return "CameraTeam";
        }

        else if (query.toLowerCase().contains("plus")){
            String[] numbers = query.split(" ");
            String s1 = "1";
            String s2 = "1";
            for (int i = 0; i<numbers.length; i++){
                if (numbers[i].equals("plus")){
                    s1 = numbers[i-1];
                    s2 = numbers[i+1];
                    break;
                }
            }

            int i1 = Integer.parseInt(s1);
            int i2 = Integer.parseInt(s2);
            int i3 = i1 + i2;

            return Integer.toString(i3);
        }


        else if (query.toLowerCase().contains("largest")){
            String nquery = query.replaceAll(",","");
            String[] numbers = query.split(" ");
		    int largest = Integer.parseInt(numbers[8]);
		    for(int i = 8; i <  numbers.length ; i++ ) {
			    largest = Math.max(largest,Integer.parseInt(numbers[i]));
		    }
		    return Integer.toString(largest);

        }

        else if (query.toLowerCase().contains("multiplied")) {
            String[] numbers = query.split(" ");
            String s1 = "1";
            String s2 = "1";
            for (int i = 0; i<numbers.length; i++){
                if (numbers[i].equals("multiplied")){
                    s1 = numbers[i-1];
                    s2 = numbers[i+1];
                    break;
                }
            }

            int i1 = Integer.parseInt(s1);
            int i2 = Integer.parseInt(s2);
            int i3 = i1 * i2;

            return Integer.toString(i3);
        }

        else if (query.toLowerCase().contains("minus")) {
            String[] numbers = query.split(" ");
            String s1 = "1";
            String s2 = "1";
            for (int i = 0; i<numbers.length; i++){
                if (numbers[i].equals("minus")){
                    s1 = numbers[i-1];
                    s2 = numbers[i+1];
                    break;
                }
            }

            int i1 = Integer.parseInt(s1);
            int i2 = Integer.parseInt(s2);
            int i3 = i1 - i2;

            return Integer.toString(i3);
        }

        else if (query.toLowerCase().contains("banana")){
            return "yellow";
        }

        else if (query.toLowerCase().contains("strawberry")){
            return "red";
        }

        else if (query.toLowerCase().contains("Theresa May")){
            return "2016";
        }

        else if (query.toLowerCase().contains("James Bond")){
            return "Sean Connery";
        }

        if (query.toLowerCase().contains("cube")) {
			String querync = query.replaceAll(",", "");
			String[] numbers = querync.split(" ");
			String result = "";
			Boolean first = true;
			for (int i = 12; i < numbers.length; i++) {
				int number = Integer.parseInt(numbers[i]);
				
				double sq = Math.sqrt(number);
				if (((sq - Math.floor(sq)) == 0)) {
					
					for (int j = 0; j <= number; j++) {
						int cube = j * j * j;
						
						if (cube == number){
							if (first) {
								result = result.concat(Integer.toString(number));
								first = false;
							} else {
								result = result.concat(", " + Integer.toString(number));
								
							}
								
							
						}
					}
					
					
					
				}
				
			}
			System.out.println(result);
			
		}

        return "";
    }
}
