package back_to_java_coder;

import java.io.*;

public class main8_move_files {

	private StringBuffer buffer;
	private Process process;
	private BufferedReader bufferedReader;
	private StringBuffer readBuffer;
	
	public String inputCommand(String cmd) {
		buffer = new StringBuffer();
		buffer.append("cmd.exe");
		buffer.append("/c ");
		buffer.append(cmd);
		
		return buffer.toString();
	}
	
	public String execCommand(String cmd) {
		try {
			process = Runtime.getRuntime().exec(cmd);
			bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line = null;
			readBuffer = new StringBuffer();
			
			while((line = bufferedReader.readLine())!=null) {
				readBuffer.append(line);
				readBuffer.append("\n");
			}
			
			return readBuffer.toString();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		return null;
	}
	
    public String moveFile(String folderName, String fileName, String beforeFilePath, String afterFilePath) {
 
    String path = afterFilePath+"/"+folderName;
    String filePath = path+"/"+fileName;
 
    File dir = new File(path);
 
        if (!dir.exists()) { //폴더 없으면 폴더 생성
            dir.mkdirs();
        }
 
        try{
 
            File file = new File(beforeFilePath);
 
            if(file.renameTo(new File(filePath))){ //파일 이동
            return filePath; //성공시 성공 파일 경로 return
            }else{
                return null;
            }
 
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
 
    }
    
    public static void main(String[] args) {
    	
    	main8_move_files fileMove = new main8_move_files();
    	
    	//String folderName = "new";//폴더 생성할 이름
    	String folderName = "new";//폴더 생성할 이름
    	String fileName = "가수이미지11.jpg"; //바뀔 이름ㅁ
    	String beforeFilePath = "C:/tmp/upload/2015/06/25/앨범속지1.jpg"; //옮길 대상 경로
    	String afterFilePath = "C:\\Users\\hjm79\\바탕 화면\\music_workspace"; //옮겨질 경로
    	
    	String result = fileMove.moveFile(folderName, fileName, beforeFilePath, afterFilePath);
    	if(result != null){
    		System.out.println("SUCCESS: "+result);
    	}else{
    		System.out.println("FAIL");
    	}
    }
			 
		


	

}
