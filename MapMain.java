package Student;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {
	public static void main(String[] args) {
	
		Map<String, List<String>> states = new HashMap<>();
		states.put("Andhra Pradesh", Arrays.asList("Guntur","Vijayawada","Vizag"));
		states.put("Delhi", Arrays.asList("Bengalore","Chennai","Anderi"));
		states.put("Karnataka", Arrays.asList("Koramangala","Marahathalli","BMP"));
		for (Map.Entry<String, List<String>> entry : states.entrySet()) {
            String state = entry.getKey();
            List<String> cities = entry.getValue();

            System.out.println("State: " + state);
            System.out.println("Cities: " + cities);
        }
	}
	
	

}
