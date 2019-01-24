import java.util.*;

public class Main {
	public static void main(String[] args0) {
		ServiceLoader<TheService> svloader = ServiceLoader.load(TheService.class);
		for (TheService sv : svloader) {
			System.out.println(sv);
			sv.exec();
		}
	}
}
