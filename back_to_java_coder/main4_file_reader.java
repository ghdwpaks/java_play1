package back_to_java_coder;

import java.io.*;
import back_to_java_coder.*;

public class main4_file_reader {

	public static int func9_countLines(String filename) throws IOException {
	    InputStream is = new BufferedInputStream(new FileInputStream(filename));
	    try {
	        byte[] c = new byte[1024];
	        int count = 0;
	        int readChars = 0;
	        boolean empty = true;
	        while ((readChars = is.read(c)) != -1) {
	            empty = false;
	            for (int i = 0; i < readChars; ++i) {
	                if (c[i] == '\n') {
	                    ++count;
	                }
	            }
	        }
	        return (count == 0 && !empty) ? 1 : count;
	    } finally {
	        is.close();
	    }
	}
	
	public static String f6sj2(String str1, String str2) {
		return main2_simples.func6_String_just_2(str1,str2);
	}
	public static void main(String[] args) throws IOException {
		System.out.println("file reader has been started!");
		
		
		//our_workspace
		String ow = "C:\\workspace\\\\eclipse_workspace\\back_to_java_coder\\src\\back_to_java_coder\\file_station\\";
		
		//main_c = main3_simples.func8_only_num(main_c, "main_c");
		
		byte[] b = new byte[1024];
		
		//FileInputStream input = new FileInputStream("C:\\workspace\\eclipse_workspace\\back_to_java_coder\\src\\back_to_java_coder\\file_station\\test_text1.txt");
        FileInputStream read = new FileInputStream(f6sj2(ow,"test_text1.txt"));
        BufferedReader bf = new BufferedReader(new FileReader(f6sj2(ow,"test_text1.txt")));
        read.read(b);
        
        System.out.println(new String(b));
        
        while(true) {
            String line = bf.readLine();
            if (line==null) break;
            System.out.println(line);
        }
        System.out.println("");
        
        BufferedReader bf2 = new BufferedReader(new FileReader(f6sj2(ow,"test_text1.txt")));
        String con = "";
        String[] con_div_line = new String[func9_countLines(f6sj2(ow,"test_text1.txt"))];
        System.out.println("con_div_line.length = " + con_div_line.length);
        //System.out.println("con made");
        int i = 0;
        while(true) {
        	
        	String line2 = bf2.readLine();
        	//System.out.println("line2 = " + line2);
        	//System.out.println("line2 made");
        	if (line2 == null) {
        		//System.out.println("entered if line");
				break;
			}
        	//System.out.println("jumped if line");
        	con = f6sj2(con, line2);
        	con = f6sj2(con, "\n");
        	con_div_line[i] = line2;
        	//System.out.println("line2 = " + line2);
        	//System.out.println("con = " + con);
        	i++;
        }
        System.out.println("con:\n" + con);
        
        for (int j = 0; j < con_div_line.length; j++) {
			System.out.println("con_div_line["+j+"] = " + con_div_line[j]);
		}
        
        
        
        
        
        read.close();
		
        
        
		
		
		
		
		System.out.println("exit file reader");
	}

}
