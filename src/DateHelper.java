import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {

	public static String  getDateFormat(Date d){
		SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
		return sf.format(d);
	}
}
