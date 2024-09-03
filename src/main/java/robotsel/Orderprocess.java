package robotsel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Orderprocess {
		
	public void datasave(String name, String number) {
		
		String filePath = "src/main/resources/static/data/order_data.txt";
		
		File file = new File(filePath);
        file.getParentFile().mkdirs();
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write("Name: " + name);
            writer.newLine();
            writer.write("Number: " + number);
            writer.newLine();
            writer.write("-------------------");
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
	
}
