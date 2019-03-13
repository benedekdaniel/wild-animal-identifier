
import searchengine.Menu;


public class App {

    /**
     * The menu of the queries
     * Creating instance of Menu and running
     * query
     *
     * @param args main application
     */

    public static void main(String[] args) {

        String command = "";
        do {
            try {

                Menu query = new Menu();

                command = query.getBackQuery();

            } catch (Exception e) {
                System.out.println("Program could not run");
            }
        } while(!command.equals("3"));
    }

}




