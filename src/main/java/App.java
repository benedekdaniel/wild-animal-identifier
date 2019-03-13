
import searchengine.Menu;


public class App {

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




