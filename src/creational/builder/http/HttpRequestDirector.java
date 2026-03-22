package creational.builder.http;

public class HttpRequestDirector {
    public HttpRequest buildSimpleGet(String url){
        return new HttpRequest.Builder(url)
                .method("GET")
                .timeout(3000)
                .build();
    }

    public HttpRequest buildAuthenticatedPost(String url, String token, String body) {
        return new HttpRequest.Builder(url)
                .method("POST")
                .addHeader("Authorization", "Bearer " + token)
                .addHeader("Content-Type", "application/json")
                .body(body)
                .timeout(10000)
                .build();
    }

    public HttpRequest buildInternalServiceCall(String url) {
        return new HttpRequest.Builder(url)
                .method("GET")
                .addHeader("X-Internal-Service", "true")
                .addHeader("X-Trace-Id", java.util.UUID.randomUUID().toString())
                .timeout(5000)
                .build();
    }
}
