package creational.builder.http;

public class Main {
    public static void main(String[] args) {
        String url = "https://api.example.com/temp";
        // Simple GET
        HttpRequest get = new HttpRequest.Builder(url).build();
        System.out.println(get);

        // POST with body and custom timeout
        HttpRequest post  = new HttpRequest.Builder(url)
                .method("POST")
                .addHeader("Content-Type", "application/json")
                .body("{\"name\":\"k4ge\"")
                .timeout(5000)
                .build();
        System.out.println(post);

        // Authenticated PUT with query parameters
        HttpRequest put = new HttpRequest.Builder(url)
                .method("PUT")
                .addHeader("Authorization", "Bearer token123")
                .addHeader("Content-Type", "application/json")
                .addQueryParam("env", "production")
                .addQueryParam("version", "2")
                .body("{\"feature_flag\":true}")
                .timeout(10000)
                .build();
        System.out.println(put);


        // Director Pattern
        HttpRequestDirector director = new HttpRequestDirector();

        HttpRequest getD = director.buildSimpleGet("https://api.example.com/users");
        HttpRequest postD = director.buildAuthenticatedPost(
                "https://api.example.com/orders", "token123", "{\"item\":\"book\"}");
        HttpRequest internal = director.buildInternalServiceCall(
                "https://internal.service/health");

        System.out.println(getD);
        System.out.println(postD);
        System.out.println(internal);
    }
}
