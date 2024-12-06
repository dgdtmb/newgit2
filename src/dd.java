import java.util.Locale;
import java.util.ResourceBundle;

public class InternationalizationExample {
    public static void main(String[] args) {
        // Locale 설정
        Locale koreanLocale = new Locale("ko");
        Locale japaneseLocale = new Locale("ja");

        // 리소스 번들 로드
        ResourceBundle bundle = ResourceBundle.getBundle("messages", koreanLocale);

        // 메시지 출력
        System.out.println(bundle.getString("greeting")); // 안녕하세요
        System.out.println(bundle.getString("farewell")); // 안녕히 가세요
    }
}