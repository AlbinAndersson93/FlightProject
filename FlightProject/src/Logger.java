import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Logger {
	
	
	final static String logpath = "c:/dump/log/";
	
	
	public static void sendToLog(String anyLogText, String itemToLog) {
		String output_anyLogText = "";
		String logIdName = "";
		LocalDateTime ld = LocalDateTime.now();
		
		logIdName = genLogIDname();
		output_anyLogText = anyLogText;

		try {
			PrintWriter out = new PrintWriter(logpath + logIdName + ".txt");
			out.println(ld.toString()+ ":" + "itemToLog: [ " + itemToLog + " ] : " + output_anyLogText);		
			out.flush();
			out.close();
		}
		catch (Exception e) {
			e.getMessage();
		}

	}
	
	public static String genLogIDname() {
		String tmp = ""; LocalDateTime ld = LocalDateTime.now();
		tmp = ld.toString(); tmp = tmp.replaceAll(":", "-"); tmp = tmp.replaceAll(" ","_");
		return tmp.toString();
	}
	

}
