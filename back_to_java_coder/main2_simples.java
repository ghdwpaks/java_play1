package back_to_java_coder;

import java.util.*;
import back_to_java_coder.main1_simples;

public class main2_simples {
	
	
	public static String func6_String_arr(String str[]) {
		String result_str = "";
		for (int i = 0; i < str.length; i++) {
			result_str = result_str.concat(str[i]);
			if (str.length-1 != i) {
				result_str = result_str.concat(".");
			}
		}
		
		return result_str; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//main1_simples main1_funcs = new main1_simples();
		
		System.out.println("Hello world!");
		
		System.out.println("main2 has been started");
		Scanner sc = new Scanner(System.in);
		String names[] = new String[5];
		for (int i = 0; i < names.length; i++) {
		   System.out.print("name["+i+"]>>");
		   names[i] = sc.next();
		}
		/*
			for (int i = 0; i < names.length; i++) {
			   System.out.println("name["+ i +"] = " + names[i]);
			}
		 */
		System.out.println("�Էµ� �̸����� . �� �����Ͽ� �� �������� �����ϸ�  ������ �����ϴ�.");
		String main2_res1 = func6_String_arr(names);
		System.out.println("main2_res1 = " + main2_res1);
		
		int ages[] = new int[5];
		System.out.println("���ڵ��� �Է����ּ���.");
		for (int i = 0; i < ages.length; i++) {
			System.out.print("ages["+i+"]>>" );
			ages[i] = sc.nextInt();
		}
		
		System.out.println("���ڵ��� ���� ���� ������ �����ϴ�.");
		int main2_res2 = main1_simples.func4_multiplication(ages);
		System.out.println("main2_res2 = " + main2_res2);
		
	}

}
