package useful_funcs;

import java.util.Scanner;

public class safe_input_int {

	public static boolean func7_1_check_String(String para) {
	    try {
	        Double.parseDouble(para);
	        return true; //func7_1에서 판별하길, 숫자만 들어갔다는 뜻
	    } catch (NumberFormatException e) {
	        return false; //func7_1에서 판별하기, 문자가 포함됐다는 뜻
	    }
	}
	
	public static int func8_only_num(int para, String para_name) {
		Scanner sc = new Scanner(System.in);
		String para_sup1 = "";
		while (true) {
			System.out.print(para_name + ">>");
			para_sup1 = sc.next();
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
	
	public static void main(String[] args) {
		

	}

}
