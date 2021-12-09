/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionforimpact;

/**
 *
 * @author Andrew_Trautmann
 */
import java.util.Collection;

/**
 * @author Werner
 *
 * Implement this Interface to produce a comma delimited list of numbers,
 * grouping the numbers into a range when they are sequential.
 *
 *
 * Sample Input: "1,3,6,7,8,12,13,14,15,21,22,23,24,31
 * Result: "1, 3, 6-8, 12-15, 21-24, 31"
 *
 * The code will be evaluated on
 *   - functionality
 *   - style
 *   - robustness
 *   - best practices
 *   - unit tests
 */
public interface NumberRangeSummarizer {

    //collect the input
    Collection<Integer> collect(String input);

    //get the summarized string
    String summarizeCollection(Collection<Integer> input);

}
