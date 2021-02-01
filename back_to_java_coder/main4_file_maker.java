package back_to_java_coder;

import java.io.*;
import back_to_java_coder.*;

public class main4_file_maker {

	public static void main(String[] args) throws IOException {
		System.out.println("file maker has been started!");
		
		String our_workspace = "C:\\workspace\\\\eclipse_workspace\\back_to_java_coder\\src\\back_to_java_coder\\";
		
		//main_c = main3_simples.func8_only_num(main_c, "main_c");
		
		byte[] b = new byte[1024];
		
        FileInputStream input = new FileInputStream(main2_simples.func6_String_just_2(our_workspace, "file_station\\test_text1.txt"));
        
        input.read(b);
        
        System.out.println(new String(b));
        
        input.close();
		
        System.out.println("div1");
        
        FileInputStream input2 = new FileInputStream("C:\\workspace\\eclipse_workspace\\back_to_java_coder\\src\\back_to_java_coder\\file_station\\test_text1.txt");
        
        input2.read(b);
        
        System.out.println(new String(b));
        
        input2.close();
		
		
		
		
		System.out.println("exit file maker");
	}

}
