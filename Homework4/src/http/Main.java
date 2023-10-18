package http;

public class Main {
    public static void main(String[] args) {

        WebService web = new WebService();
        HttpClient http = new HttpClient(web);
        System.out.println(http.get("137.10.10.1"));

    }
}
