import java.util.function.Function;
import java.util.Map;

public class Receiver {

public static String overload(Function f) {
	return "function " + f.apply("a");
}

public static String overload(Map m) {
	return "map";
}

}
