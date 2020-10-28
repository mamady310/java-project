import java.lang.StrictMath;
import java.text.NumberFormat;
public class Main {

 
    public static void main(String[] args) {
       NumberFormat percent = NumberFormat.getPercentInstance();
       String result =percent.format(.50);

       System.out.println(result);

}
}