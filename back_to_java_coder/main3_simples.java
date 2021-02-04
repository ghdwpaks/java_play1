package back_to_java_coder;

import java.util.*;
import java.util.regex.Pattern;



public class main3_simples {

	public static boolean func7_1_check_String(String para) {
	    try {
	        Double.parseDouble(para);
	        return true; //func7_1에서 판별하길, 숫자만 들어갔다는 뜻
	    } catch (NumberFormatException e) {
	        return false; //func7_1에서 판별하기, 문자가 포함됐다는 뜻
	    }
	}
	
	/*
	public static int func7_return_String(String para, int main_para) {
		int result = main_para;
		if (func7_1_check_String(para)) {
			main_para = Integer.parseInt(para);
		}
		return result;
	}
	*/
	
	public static int func8_only_num(int para, String para_name) {
		Scanner sc = new Scanner(System.in);
		String para_sup1 = "";
		while (true) {
			System.out.print(para_name + ">>");
			para_sup1 = sc.nextLine();
			if (func7_1_check_String(para_sup1)) {
				para = Integer.parseInt(para_sup1);
				break;
			} else {
				System.out.println("입력이 잘못됐습니다.");
				continue;
			}
		}
		return para;
	}
	
	public static String func8_only_eng(String para ,String para_name) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print(para_name + ">>");
			para = sc.nextLine();
			if (func8_only_eng_check_eng(para)) {
				break;
			}
			else {
				System.out.println("입력이 잘못됐습니다.");
			}
		}
		return para;
	}
	
	private static boolean func8_only_eng_check_eng(String word) {
        return Pattern.matches("^[a-zA-Z]*$", word);
    }
	
	public static void main(String[] args) throws NumberFormatException{
		/*
		 * 1. 일단은 String 형식으로 받고서
		 * 2. 숫자로 바꿀 수 있는지 판별하고
		 * 3. 괜찮다는것으로 판별되면 형변환시키는걸로!
		 */
		
		System.out.println("main3 started");
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		System.out.println(Pattern.matches("^[a-zA-Z]*$", word));
		
		
		
		String astr = "";
		
		System.out.println("astr = " + astr);
		astr = sc.nextLine();
		System.out.println("astr = " + astr);
		
		
		
		System.out.println("");
		
		int aint1 = 0;
		String aint1_sup1;
		System.out.println("aint1 = " + aint1);
		
		while (true) {
			aint1_sup1 = sc.nextLine();
			if (func7_1_check_String(aint1_sup1)) {
				aint1 = Integer.parseInt(aint1_sup1);
				break;
			} else {
				System.out.println("입력이 잘못됐습니다.");
				continue;
			}
			//aint1 = func7_return_String(aint1_sup1, aint1);
		}
		
		System.out.println("aint1 = " + aint1);
		
		
		
		

	}

}
