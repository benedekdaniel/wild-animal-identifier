package searchengine;

import animal.Animal;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class AnimalParser {


    public void getBackAnimals() throws IOException {

        try {

            Read reader = new Read();

            CSVParser csvParser = CSVParser.parse(reader.gettingFilePath()
                    , Charset.defaultCharset(),
                    CSVFormat.DEFAULT.withHeader("type", "noun", "scientificnoun")
            );

            Stream<CSVRecord> csvRecordStream = StreamSupport.stream(csvParser.spliterator(), false);

            List<Animal> animalList = csvRecordStream
                    .skip(1)
                    .map(CSVRecord::toMap)
                    .map(Animal::new)
                    .collect(Collectors.toList());

            for (Animal s : animalList) {
                System.out.println(s);
            }
        } catch (IOException e){
            System.out.println(e);
        }
    }
}
