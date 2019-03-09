package Application;

import SearchEngine.Search;

public class App {

    public static void main(String[] args) {
        Search soma = new Search();

        try {
            soma.giveFeedback();
        } catch (Exception w) {
            System.out.println(w.getMessage());
        }

    }
}
