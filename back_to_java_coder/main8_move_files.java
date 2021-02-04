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
 
        if (!dir.exists()) { //���� ������ ���� ����
            dir.mkdirs();
        }
 
        try{
 
            File file = new File(beforeFilePath);
 
            if(file.renameTo(new File(filePath))){ //���� �̵�
            return filePath; //������ ���� ���� ��� return
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
    	
    	//String folderName = "new";//���� ������ �̸�
    	String folderName = "new";//���� ������ �̸�
    	String fileName = "�����̹���11.jpg"; //�ٲ� �̸���
    	String beforeFilePath = "C:/tmp/upload/2015/06/25/�ٹ�����1.jpg"; //�ű� ��� ���
    	String afterFilePath = "C:\\Users\\hjm79\\���� ȭ��\\music_workspace"; //�Ű��� ���
    	
    	String result = fileMove.moveFile(folderName, fileName, beforeFilePath, afterFilePath);
    	if(result != null){
    		System.out.println("SUCCESS: "+result);
    	}else{
    		System.out.println("FAIL");
    	}
    }
			 
		


	

}
