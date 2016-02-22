package main_package;

public class Main {
	private static double ret_budget = Query.ask_for_input("please input monthly budget post-retirement:");//$10,000
	private static double ret_ssi = Query.ask_for_input("please input social security income:");//$2,642
	private static double inv_safe = Query.ask_for_input("please input annual return post-retirement:");//2%
	private static double ret_term = Query.ask_for_input("pleast input # of years retired:");//20
	private static double inv_risky = Query.ask_for_input("please input annual return pre-retirement:");//7%
	private static double lump_sum = Post.calc_post(ret_budget, ret_ssi, inv_safe, ret_term);//PGV
	private static double emp_term = Query.ask_for_input("please enter # years worked:");//40
	private static double emp_save = Pre.calc_emp_save(inv_risky, lump_sum, emp_term);//PGV

	public static void main(String[] args) {
		System.out.print("What you need saved:");
		System.out.printf("%.2f",lump_sum);
		System.out.println("");
		System.out.print("Amount to save each month:");
		System.out.printf("%.2f",emp_save);
		Query.user_input.close();
		
		}

}
	


