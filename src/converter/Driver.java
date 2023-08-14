package converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) throws IOException {
		// The mapper object is used to convert objects into Json Strings
		ObjectMapper mapper = new ObjectMapper();
		
		// Place the prompt in the first quote bracket, and the desired response in the second quote bracket
		TuningData t1 = new TuningData("", "");
		TuningData t2 = new TuningData("", "");
		TuningData t3 = new TuningData("", "");
		TuningData t4 = new TuningData("", "");
		TuningData t5 = new TuningData("", "");
		TuningData t6 = new TuningData("", "");
		TuningData t7 = new TuningData("", "");
		TuningData t8 = new TuningData("", "");
		TuningData t9 = new TuningData("", "");
		TuningData t10 = new TuningData("", "");
		
		// All tuning data will be stored within the Array List
		ArrayList<TuningData> myData = new ArrayList<>();
		myData.add(t1);
		myData.add(t2);
		myData.add(t3);
		myData.add(t4);
		myData.add(t5);
		myData.add(t6);
		myData.add(t7);
		myData.add(t8);
		myData.add(t9);
		myData.add(t10);
		
		// Writing the JSON formatted object into a file, must create a folder to store the created json file
		String allMyData = mapper.writeValueAsString(myData);
		
		// This will write the tuning data to a file
		mapper.writeValue(new File("Your File Path here"), allMyData);
		
		System.out.println(myData);
		
		

	}

}
