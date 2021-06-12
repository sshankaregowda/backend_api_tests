/*GetRequest.java
This file is used to get the details
 */

package tests;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class GetRequest extends Base{

    //get the details and print
    @Test
    public void getApi() {
        Response response =
                given()
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .assertThat()
                        .header("Content-Type", containsString("application/json;"))
                        .extract().response();
        String jsonAsString = response.asString();
        System.out.println(jsonAsString);
    }

}
