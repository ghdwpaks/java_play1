package back_to_java_coder;
import java.io.*;
import java.util.*;

public class main6_file_adder_and_modifier {
	
	public static String f6sj2(String str1, String str2) {
		return main2_simples.func6_String_just_2(str1,str2);
	}
	
	public static boolean func12_file_adder(String filename) throws IOException {
		System.out.println("filename = " + filename);
		String[] arr_filename = filename.split(".txt",2);
		//for (int i = 0; i < arr_filename.length; i++) System.out.println("arr_filename["+i+"] : "+arr_filename[i]);
		System.out.println("���ϼ��� �޼ҵ带 ������׽��ϴ�.\nŻ�� ��ɾ�� exit�Դϴ�.");
		System.out.println("���� �������� ���� �̸��� "+arr_filename[0]+" �Դϴ�.");
		Scanner sc = new Scanner(System.in);
		boolean result = false;
		String ow = "C:\\workspace\\eclipse_workspace\\back_to_java_coder\\src\\back_to_java_coder\\file_station\\";
		FileWriter adder = new FileWriter(f6sj2(ow,filename), true);
		String input = "";
        while(true) {
        	input = sc.next();
        	//System.out.println("input = " + input);
        	//System.out.println("input == exit ? " + (input == "exit"));
        	if(input.equals("exit")) {
        		break;
        	}
        	adder.write(input+"\n");
        	
        }
        System.out.println("���ϼ��� �޼ҵ带 �����մϴ�.");
        adder.close();
        
		return result;
	}
	
	
	public static void main(String[] args) throws IOException {
		/*
		Scanner sc = new Scanner(System.in);
		String ans1 = "";
		ans1 = sc.next();
		System.out.println("ans1 = " + ans1);
		System.out.println("ans1 == exit ? " + (ans1 == "exit"));
		System.out.println("ans1.equals(exit) ? " + ans1.equals("exit"));
		*/
		
		func12_file_adder("test_text1.txt");
		

	}

}
