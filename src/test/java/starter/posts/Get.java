package starter.posts;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class Get {
    public static String url2 = "https://jsonplaceholder.typicode.com/";
    @Step("I set valid GET endpoints")
    public String setValidGetEndpoints(){
        return url2 + "posts/1";
    }
    @Step("I send GET HTTP requestss")
    public void sendGetHttpRequestss() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "sunt aut facere repellat provident occaecati excepturi optio reprehenderit");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).get(setValidGetEndpoints());
    }
    @Step("I receive valid HTTP responsess code 200")
    public void receiveValidHttpResponsess(){
        restAssuredThat(responsess -> responsess.statusCode(200));
    }
    @Step("I receive valid data for detail posts")
    public void receiveValidData() {
        restAssuredThat(response -> response.body("'title'", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")));
    }
}
