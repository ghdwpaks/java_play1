package back_to_java_coder;

import java.io.IOException;
import java.util.Scanner;



public class file_control_center {
	
	//func13_word_search_part_1
	private static boolean f13p1(String str,String str2) {
		boolean result = false;
        if(str.indexOf("welcome")!=-1) {
            result = true;
        }else {
            result = false;
        }
		return result;
	}
	
	private static boolean f13p2(String str1,String str2) {
		/*
		System.out.println("\nentered f13p2\n");
		System.out.println("f13p2 str1 = " + str1);
		System.out.println("f13p2 str2 = " + str2);
		System.out.println("contains : " + str1.contains(str2));
		System.out.println("\nfinished f13p2\n");
		*/
		return str1.contains(str2);
	}
	
	public static boolean func13_word_search(String str, String str2) {
		//str = 서치 당할 문장
		//str2 = 서치 할 단어
		f13p2(str, str2);
		if (f13p1(str, str2) && f13p2(str, str2)) return true; 
		else return false;
	}
	
	private static void modify() throws IOException {
		Scanner sc = new Scanner(System.in);
		String filename = "test_text1.txt";
		String filename_temp = "";
		System.out.print("어떤 파일을 수정하시겠습니까?\n>>");
		filename_temp = sc.nextLine();
		if(filename_temp != null || !(filename_temp.equals("")) || !(filename_temp.equals(null))) {
			filename = filename_temp;
		}
		
		main6_file_adder_and_modifier.func12_file_adder(filename);
		
		
	}
	private static void reset() throws IOException {
		
		main5_file_maker.func11_file_maker_reseter("test_text1.txt");
	}
	
	private static void create() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("private func, create 진입");
		System.out.println("어떤 파일을 만드시겠습니까?");
		String userans2 = sc.nextLine();
		if (func13_word_search(userans2, ".txt")) userans2 = userans2.replace(".txt", "");
		main5_file_maker.func11_file_maker_reseter(userans2+".txt");
	}
	

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String userans1 = "";
		while(true) {
		System.out.print(	"현재 작성된 코드는 기본적으로 test_text1.txt를 다룹니다.\n"
							+ "추가 수정은	m \n"
							+ "리셋은  	r \n"
							+ "파일생성은 	c \n>>");
		userans1 = sc.nextLine();
		System.out.println("userans1 = " + userans1);
		if (userans1.equals("m") || userans1.equals("modify")) {
			modify();
		} else if(userans1.equals("r") || userans1.equals("reset")) {
			reset();
		} else if(userans1.equals("c") || userans1.equals("create")) {
			create();
		}
		
		
		
		
		}
		
		
		
		
		

	}

}
