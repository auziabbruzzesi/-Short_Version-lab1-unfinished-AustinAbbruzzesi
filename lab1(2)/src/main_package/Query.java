package main_package;
import java.util.*;
public class Query extends Main{
	static Scanner user_input = new Scanner(System.in);
	public static double ask_for_input(String request){
		System.out.print(request);
		double value = user_input.nextInt();
		return value;
	}
	

}
