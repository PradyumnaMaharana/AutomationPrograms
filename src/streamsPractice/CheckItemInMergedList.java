package streamsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;

public class CheckItemInMergedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ajay");
		names.add("Sonu");
		names.add("Ram");
		List<String> names1 = Arrays.asList("Sita", "Arjun", "Hanuman");
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		// Check if Ram is present in the new merged stream
		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("ram"));
		Assert.assertTrue(flag);
		System.out.println(flag);
	}

}
