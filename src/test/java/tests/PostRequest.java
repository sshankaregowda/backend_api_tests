/*PostRequest.java
This file is used to post the details
 */

package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class PostRequest extends Base{
    public static Map<String, String> map = new HashMap<String, String>();

    //set post body
    @Parameters({"postName", "postId"})
    @BeforeTest
    public void postdata(String name, String id) {

        map.put("name", name);
        map.put("id", id);

    }

    //post the details
    @Test
    public void postApi() {

        given().
                contentType("application/json")
                .body(map)
                .when()
                .post()
                .then()
                .statusCode(201)
                .assertThat()
                .header("Content-Type", containsString("application/json;"));
    }

}
