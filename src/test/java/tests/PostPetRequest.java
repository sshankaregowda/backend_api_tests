/*PostPetRequest.java
This file is used to post the details of pet
 */

package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class PostPetRequest extends Base{
    public static Map<String, String> map = new HashMap<String, String>();

    //set post body
    @Parameters({"petName", "petId"})
    @BeforeTest
    public void postPetData(String name, String id) {

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
