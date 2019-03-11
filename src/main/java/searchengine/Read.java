package searchengine;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Read {

   public Path gettingFilePath() {
       String documentsPath = System.getProperty("user.dir");

       Path documentsDirectory = Paths.get(documentsPath);

       String filename = "findAnAnimal.csv";

       return documentsDirectory.resolve(filename);
   }



}
