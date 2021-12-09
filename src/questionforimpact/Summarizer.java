/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionforimpact;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Andrew_Trautmann
 */
public class Summarizer implements NumberRangeSummarizer{

    @Override
    public Collection<Integer> collect(String input) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        // Splitting the string values and adding it into an arraylist
        try {
            String numbers[] = input.split(",");
            for (int i = 0; i < numbers.length; i++) {
                Integer num = new Integer(numbers[i]);
                nums.add(num);
            }
        } catch (NumberFormatException e) {
            // Displaying tips on how to prevent the error from occuring
            System.out.println("Please only input numbers: \n"
                    + "Tips to avoid the error: \n"
                    + "Check that your input doesn't have multiple ',' seperator between the numbers\n"
                    + "Check that your input does not contain any non-numeric characters other than the ',' seperator\n"
                    + "Check to make sure that your input is not empty" );
            return null;            
        }
        return nums;        
    }

    @Override
    public String summarizeCollection(Collection<Integer> input) {
        
        String builder = "";        
        boolean firstLoop = true;
        int prev =0;
        
        for (int num : input) {
            if (firstLoop) {
                firstLoop = false;
                builder += num;
                prev = num;
            }else{
                if (num == (prev+1) && !builder.substring(builder.length()-1, builder.length()).equals("-")) {
                    builder += "-";
                }else if (!(num == (prev+1)) && builder.substring(builder.length()-1, builder.length()).equals("-")) {
                    builder += prev + ", " + num;
                }else if (!(num == (prev+1))) {
                    builder += ", " + num;                     
                }
                prev = num;
            }
        }
        return builder;        
    }    
}
