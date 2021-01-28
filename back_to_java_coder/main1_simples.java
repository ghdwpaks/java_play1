package back_to_java_coder;
import java.util.*;

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
	
	
	public static void main(String[] args) {
		//배열을 인자갑으로 받거나 return 형식이 배열인 메소드도 만들어보기
		System.out.println("program started!");
		String main_a;
		Scanner sc = new Scanner(System.in);
		System.out.print("문장 main_a >>");
		main_a = sc.next();
		System.out.println("a = " + main_a);
		
		String	abc;
		System.out.print("abc >>");
		abc = sc.next();
		System.out.println("abc = " + abc);
		
		String main_b = "";
		main_b = func2_sum_strings(main_a, abc);
		System.out.println("main_b = " + main_b);
		
		int main_c = 0, main_d = 0;
		System.out.print("숫자 main_c >>");
		main_c = sc.nextInt();
		System.out.print("숫자 main_d >>");
		main_d = sc.nextInt();
		int main_e =func3_add_nums(main_c, main_d);
		System.out.println("main_e = " + main_e);
		

	}

}
