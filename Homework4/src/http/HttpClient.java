package http;
import java.util.regex.*;

public class HttpClient {
    WebService service;


    public HttpClient(WebService service) {
        this.service = service;
    }

    public String get(String url) {
        if (url.matches("((0|1\\d{0,2}|2([0-4][0-9]|5[0-5]))\\.){3}(0|1\\d{0,2}|2([0-4][0-9]|5[0-5]))"))
        {
            if (url.matches("127.\\d{0,2}.\\d{0,2}.\\d{0,2}")) {
                return service.localhost();
            }
            return service.getContent(url);
        }
        else
            throw new RuntimeException("IP error");

    }
}
