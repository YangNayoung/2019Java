import java.io.*;
import java.util.*;

public class Phone {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		FileWriter fw = null;
		File f = new File(“Phone.txt”);
		try {
			fw = new FileWriter(f); 
			System.out.println("전화번호 입력프로그램입니다.");
			while(true) {
				System.out.println("name PhoneNumber>> ");
				String line = scanner.nextLine();
				if(line.contentEquals("그만")) 
					break;
				fw.write(line +"\r\n");
			}
			System.out.println(f.getPath()+"에 저장되었습니다.");
			
			scanner.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
