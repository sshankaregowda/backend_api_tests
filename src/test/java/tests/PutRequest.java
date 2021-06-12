/*PutRequest.java
This file is used to update the details
 */

package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class PutRequest extends Base{

    public static Map<String,String> map = new HashMap<String,String>();

    //set the put body
    @Parameters({ "putName","putId" })
    @BeforeTest
    public void putdata(String name,String id){

          map.put("name",name);
          map.put("id",id);

    }

    //update the details
    @Test(dataProvider = "id")
    public void putApi(String id) {

        given()
                .contentType("application/json")
                .body(map)
                .when()
                .put("/{id}",id)
                .then()
                .statusCode(200)
                .assertThat()
                .header("Content-Type", containsString("application/json;"));

    }

}
