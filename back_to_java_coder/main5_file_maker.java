package back_to_java_coder;

import java.io.*;


public class main5_file_maker {

	public static String f6sj2(String str1, String str2) {
		return main2_simples.func6_String_just_2(str1,str2);
	}
	
	public static void func10_file_ops_shower(String filename, int func_num) {
		//System.out.println("\nfunc10 ������!\n");
		File mfile = new File(filename);
		switch (func_num) {
		case 1:
			System.out.println("1. �������翩��	exists : " + mfile.exists());
			break;
		case 2:
			System.out.println("2. ������ ������	getAbsolutePath : " + mfile.getAbsolutePath());
			break;
		case 3:
			System.out.println("3. ������ �̸�		getName : " + mfile.getName());	
			break;
		case 4:
			System.out.println("4. ��μ�����������	lastModified : " + mfile.lastModified()); //long
			break;
		case 5:
			System.out.println("5. ���ϱ���		length : " + mfile.length());
			break;
		case 6:
			System.out.println("6. �бⰡ�ɿ����Ǻ�	canRead : " + mfile.canRead()); //bool
			break;
		case 7:
			System.out.println("7. ���Ⱑ�ɿ����Ǻ� canWrite : " + mfile.canWrite());
			break;
		case 8:
			System.out.println("8. �������翩��	isFile : " + mfile.isFile());
			break;
		case 9:
			System.out.println("9. �������� �������� ����		Directory : " + mfile.isDirectory());
			break;
		default:
			break;
		}
        //System.out.println("\nfunc10 Ż����\n");
	}
	



	
	public static boolean func11_file_maker(String filename) throws IOException {
		boolean result = false;
		
		String ow = "C:\\workspace\\eclipse_workspace\\back_to_java_coder\\src\\back_to_java_coder\\file_station\\";
		FileOutputStream output = new FileOutputStream(f6sj2(ow, filename));
		String data = "reseted "+filename+"!"; 
		output.write(data.getBytes());
		/*
		for(int i=1; i<11; i++) {
            String data = i+" ��° ���Դϴ�.\r\n";
            output.write(data.getBytes());
        }
        */
		result = true;
        output.close();
		
		return result;
	}
	public void makeDIR(String path){
		try{
			File file = new File(path+"/test.txt");
			// test.txt ������ �ִ��� Ȯ��
			if(file.isFile()){
				System.out.println("������ �����մϴ�.");
				System.out.println(file.getCanonicalPath().toString());
				System.out.println();
			}else{
				System.out.println("������ �����ϴ�. ");
			}
		}catch(IOException E){}
	}
	
	public static boolean func12_check_file(String path)  throws IOException {
		File file = new File(path);
		return file.isFile();
	}
	
	public static void main(String[] args) throws IOException{
		System.out.println("file maker started!");
		String ow = "C:\\workspace\\eclipse_workspace\\back_to_java_coder\\src\\back_to_java_coder\\file_station\\";
		System.out.println("filepath = "+ f6sj2(ow,"test_text2.txt"));
		//������ path ���Ἲ Ȯ�ε�
        func11_file_maker("test_text1.txt");
        func10_file_ops_shower(ow.concat("test_text2.txt"),1);
		
		
		System.out.println("file maker finish");
	}

}
