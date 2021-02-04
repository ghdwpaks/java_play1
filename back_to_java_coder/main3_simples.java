package back_to_java_coder;

import java.util.*;
import java.util.regex.Pattern;



public class main3_simples {

	public static boolean func7_1_check_String(String para) {
	    try {
	        Double.parseDouble(para);
	        return true; //func7_1���� �Ǻ��ϱ�, ���ڸ� ���ٴ� ��
	    } catch (NumberFormatException e) {
	        return false; //func7_1���� �Ǻ��ϱ�, ���ڰ� ���Եƴٴ� ��
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
				System.out.println("�Է��� �߸��ƽ��ϴ�.");
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
				System.out.println("�Է��� �߸��ƽ��ϴ�.");
			}
		}
		return para;
	}
	
	private static boolean func8_only_eng_check_eng(String word) {
        return Pattern.matches("^[a-zA-Z]*$", word);
    }
	
	public static void main(String[] args) throws NumberFormatException{
		/*
		 * 1. �ϴ��� String �������� �ް�
		 * 2. ���ڷ� �ٲ� �� �ִ��� �Ǻ��ϰ�
		 * 3. �����ٴ°����� �Ǻ��Ǹ� ����ȯ��Ű�°ɷ�!
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
				System.out.println("�Է��� �߸��ƽ��ϴ�.");
				continue;
			}
			//aint1 = func7_return_String(aint1_sup1, aint1);
		}
		
		System.out.println("aint1 = " + aint1);
		
		
		
		

	}

}
