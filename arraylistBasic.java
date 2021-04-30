import java.util.*;

public class arraylistBasic{
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Nexon");
		cars.add("Tiago");
		cars.add("Swift");
		cars.add("Creta");
		cars.add("Mustang");
		cars.add("Merecedes C Class");
		System.out.println(cars);
		System.out.println("Elements at 2nd Locations " +cars.get(1));

		cars.remove(5);
		System.out.println(cars);
		
	}
}