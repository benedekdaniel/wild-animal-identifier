package utilities;

import java.util.Arrays;
import java.util.List;

public class ListUtility {

    /**
     * The contains all function
     * Gives back boolean value based on user input
     * and String list of animal properties
     *
     *
     * @param list
     * @param conditionList the user input list (the set of queries given)
     * @return result (booelan)
     */

    public static boolean containsAll(List<String> list, List<String> conditionList) {
        boolean result = false;
        for (String condition : conditionList) {
            boolean contains = false;
            for (String element : list) {

                /*Slicing by ; delimiter for countries, colors etc.
                  Looping through both arrays. If animal list
                  contains condition (user input list element) contains = true
                  true returned

                */
                List<String> splitElement = Arrays.asList(element.split(";"));
                if (splitElement.contains(condition)) {
                    contains = true;
                    break;
                }
            }
            result = contains;
            if (!result) break;
        }

        return result;
    }
}
