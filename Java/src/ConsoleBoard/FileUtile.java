package ConsoleBoard;

import java.io.FileOutputStream;

public class FileUtile {

	// 파일 경로
	// 회원 리스트
	private static String memberpath = "C:/Users/knr0110/git/review/Java/src/ConsoleBoard/memberlist.txt";
	// 로그
	private static String logpath = "C:/Users/knr0110/git/review/Java/src/ConsoleBoard/logpath.txt";

	// 파일 저장 메서드
	public static void fileSave(int type, int contents) throws Exception {
			//type : 저장파일 구분용
		
		FileOutputStream outputStream = null;// 선언만
		
		if(type==1) {
			outputStream = new FileOutputStream(memberpath);
			for(Member member : ConsoleProgram.memberlist) {
				String outstring = member.getUserNumber() +", "+member.getId()+", "+member.getPassword()
				+", "+member.getEmail()+", "+member.getName()+", "+member.getPoint()+"\n";
			
				outputStream.write(outstring.getBytes());
			}
			
			outputStream.flush();
			outputStream.close();
		}
		
		if(type==0) {
			outputStream =  new FileOutputStream(logpath);
			
			String outString = contents+"\n";
			outputStream.write(outString.getBytes());
			
			outputStream.flush();
			outputStream.close();
			
		}
		
	}//end of fileSave
	
}
