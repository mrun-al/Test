import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

    public static void main(String[] args) {

        String time12HourFormat = "03:45 PM";

    
        SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm a");
        SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm");

        try {
            
            Date date = inputFormat.parse(time12HourFormat);

            
            String militaryTime = outputFormat.format(date);

            
            System.out.println("Input time (12-hour format): " + time12HourFormat);
            System.out.println("Converted time (24-hour format): " + militaryTime);
        }catch (ParseException e) {
            e.printStackTrace();
        }
    }
}