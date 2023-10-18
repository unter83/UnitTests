package http;

public class WebService {

    public String getContent(String url) {
        return "Hello! This is " + url + " address";
    }

    public String localhost() {
        return "Hello! This is localhost";
    }
}
