package Engine;

import java.io.Reader;
import java.nio.file.Path;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.IOException;
import java.nio.file.Files;



public class Read {

    public Read() {


    }

    public List<String[]> readFileAndParse(Path csvFile) {
        List<String[]> records=null;
        try {
            CSVParser parser = new CSVParserBuilder()
                    .withSeparator(',')
                    .withIgnoreQuotations(true)
                    .build();
            Reader reader = Files.newBufferedReader(csvFile);
            CSVReader csvReader = new CSVReaderBuilder(reader)
                    .withSkipLines(1)
                    .withCSVParser(parser)
                    .build();
            records = csvReader.readAll();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return records;
    }

}
