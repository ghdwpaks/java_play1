package back_to_java_coder;

import java.io.*;


public class main5_file_maker {

	public static String f6sj2(String str1, String str2) {
		return main2_simples.func6_String_just_2(str1,str2);
	}
	
	public static void func10_file_ops_shower(String filename) {
		System.out.println("\nfunc10 진입함!\n");
		File mfile = new File(filename);
         
        System.out.println("exists : " + mfile.exists());
        System.out.println("getAbsolutePath : " + mfile.getAbsolutePath());
        System.out.println("getName : " + mfile.getName());
        System.out.println("lastModified : " + mfile.lastModified());
        System.out.println("length : " + mfile.length());
        System.out.println("canRead : " + mfile.canRead());
        System.out.println("canWrite : " + mfile.canWrite());
        System.out.println("isFile : " + mfile.isFile());
        System.out.println("Directory : " + mfile.isDirectory());
		
        System.out.println("\nfunc10 탈출함\n");
	}
	
	public static boolean func11_file_maker(String filename) throws IOException {
		boolean result = false;
		
		String ow = "C:\\workspace\\eclipse_workspace\\back_to_java_coder\\src\\back_to_java_coder\\file_station\\";
		FileOutputStream output = new FileOutputStream(f6sj2(ow, filename));
		/*
		for(int i=1; i<11; i++) {
            String data = i+" 번째 줄입니다.\r\n";
            output.write(data.getBytes());
        }
        */
        output.close();
		
		return result;
	}
	
	public static void main(String[] args) throws IOException{
		System.out.println("file maker started!");
		String ow = "C:\\workspace\\eclipse_workspace\\back_to_java_coder\\src\\back_to_java_coder\\file_station\\";
		System.out.println("filepath = "+ f6sj2(ow,"test_text2.txt"));
		//파일의 path 무결성 확인됨
        func11_file_maker("test_text4.txt");
        func10_file_ops_shower(ow.concat("test_text2.txt"));
		
		
		System.out.println("file maker finish");
	}

}
