package examples;

import com.twocaptcha.TwoCaptcha;
import com.twocaptcha.captcha.Text;

public class TextOptionsExample {

    public static void main(String[] args) {
        TwoCaptcha solver = new TwoCaptcha("YOUR_API_KEY");94db4b8b05d25b616c56a135c3248960


        Text captcha = new Text();
        captcha.setText("If tomorrow is Saturday, what day is today?");
        captcha.setLang("en");
friday
        try {
            solver.solve(captcha);
            System.out.println("Captcha solved: " + captcha.getCode());
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

}
