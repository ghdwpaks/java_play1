package back_to_java_coder;
import java.util.*;
import back_to_java_coder.main3_simples;

public class main1_simples {
	
	
	public static void func1() {
		System.out.println("here is func1");
	}
	
	public static String func2_sum_strings(String a, String b) {
		String result_string = "temp_result_string";
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("result_string = " + result_string);
		
		//메서드 사용법 알아오기
		
		
		return result_string;
	}
	
	public static int func3_add_nums(int a, int b) {
		int result_int = 0;
		result_int = result_int + a + b;
		
		
		return result_int;
	}
	
	public static int func4_multiplication(int arr_num[]) {
		int int_result = 0;
		int arr_lang = arr_num.length;
		for (int i = 0; i < arr_lang; i++) int_result = int_result + arr_num[i];
		return int_result;
	}
	
	public static int[] fun5_multiplication_return_arr(int arr_num[]) {
		int arr_num_re[] = new int[arr_num.length];
		for (int i = 0; i < arr_num_re.length; i++) {
			arr_num_re[i] = arr_num[i] * 2;
		}
		return arr_num_re;
	}
	
	
	public static void main(String[] args) {
		//강제형변환
		System.out.println("program started!");
		String main_a;
		Scanner sc = new Scanner(System.in);
		System.out.print("문장 main_a >>");
		main_a = sc.next();
		System.out.println("a = " + main_a);
		System.out.println("");
		
		String	abc;
		System.out.print("문장 abc >>");
		abc = sc.next();
		System.out.println("abc = " + abc);
		System.out.println("");
		
		String main_b = "";
		main_b = func2_sum_strings(main_a, abc);
		System.out.println("main_b = " + main_b);
		System.out.println("");
		
		int main_c = 0, main_d = 0;
		main_c = main3_simples.func8_only_num(main_c, "main_c");
		main_d = main3_simples.func8_only_num(main_d, "main_d");
		/*
		System.out.print("숫자 main_c >>");
		main_c = sc.nextInt();
		System.out.print("숫자 main_d >>");
		main_d = sc.nextInt();
		 */
		int main_e =func3_add_nums(main_c, main_d);
		System.out.println("main_e = " + main_e);
		System.out.println("");
		
		int main_f = 43, main_g = 23;
		int arr_num[] = new int[5];
		arr_num[0] = main_c; System.out.println("main_c = " + main_c);
		arr_num[1] = main_d; System.out.println("main_d = " + main_d);
		arr_num[2] = main_e; System.out.println("main_e = " + main_e);
		arr_num[3] = main_f; System.out.println("main_f = " + main_f);
		arr_num[4] = main_g; System.out.println("main_g = " + main_g);
		int main_re_1 = func4_multiplication(arr_num);
		System.out.println("main_re_1 = " + main_re_1);
		System.out.println("");
		
		int main_re_arr_1[] = fun5_multiplication_return_arr(arr_num);
		for (int i = 0; i < main_re_arr_1.length; i++) {
			System.out.println("main_re_arr_1["+i+"] = " + main_re_arr_1[i]);
		}
		System.out.println("");
		
		
		
		

	}

}
