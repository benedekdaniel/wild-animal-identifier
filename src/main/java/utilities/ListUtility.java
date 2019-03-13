package utilities;

import java.util.Arrays;
import java.util.List;

public class ListUtility {



    public static boolean containsAll(List<String> list, List<String> conditionList) {
        boolean result = false;
        for (String condition : conditionList) {
            boolean contains = false;
            for (String element : list) {
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
