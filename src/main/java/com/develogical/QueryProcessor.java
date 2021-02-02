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
            System.out.println(query);
            String[] splitted = query.split(" ");
            String s1 = splitted[2];
            String s2 = splitted[4];

            int i1 = Integer.parseInt(s1);
            int i2 = Integer.parseInt(s2);
            int summer = i1 + i2;
            String reter = String.valueOf(summer);
            return reter;

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
            String s1;
            String s2;
            for (int i = 0; i<numbers.length; i++){
                if (numbers[i].equals("multiplied")){
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

        else if (query.toLowerCase().contains("banana")){
            return "yellow";
        }

        else if (query.toLowerCase().contains("Theresa May")){
            return "2016";
        }

        return "";
    }
}
