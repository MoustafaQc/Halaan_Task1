import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Test1 {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://api.agify.io/";

        given().log().all().queryParam("name","meelad").when().get().
                then().log().all().assertThat().statusCode(200).
                body("count" , equalTo(21)).
                body("name",equalTo("meelad")).
                body("age" , equalTo(33));
    }
}
