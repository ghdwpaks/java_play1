package useful_funcs;

import java.util.Scanner;

public class safe_input_int {

	public static boolean func7_1_check_String(String para) {
	    try {
	        Double.parseDouble(para);
	        return true; //func7_1���� �Ǻ��ϱ�, ���ڸ� ���ٴ� ��
	    } catch (NumberFormatException e) {
	        return false; //func7_1���� �Ǻ��ϱ�, ���ڰ� ���Եƴٴ� ��
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
				System.out.println("�Է��� �߸��ƽ��ϴ�.");
				continue;
			}
		}
		return para;
	}
	
	public static void main(String[] args) {
		

	}

}
