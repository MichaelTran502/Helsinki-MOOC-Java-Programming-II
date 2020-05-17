
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        
        ArrayList<String> lines = new ArrayList<>();
        
        // Add each line to array list
        try {
            Files.lines(Paths.get("literacy.csv")).forEach(line -> lines.add(line));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        //System.out.println(lines.get(0));
        
        lines.stream()
                .sorted((x,y) -> {
                    String[] xSplit = x.split(",");
                    String[] ySplit = y.split(",");
                    
                    double xLit = Double.valueOf(xSplit[5]);
                    double yLit = Double.valueOf(ySplit[5]);
                    
                    
                    
                    if (xLit > yLit) {
                        return 1;
                    } else if (xLit < yLit) {
                        return -1;
                    } else {
                        return 0;
                    }
                        
                
                }).map(line -> line.split(","))
                .forEach(line -> System.out.println(line[3] + " (" + line[4] + 
                        ")," + line[2].replace(" (%)", "") + ", " + line[5]));
                
       
    }       
}
