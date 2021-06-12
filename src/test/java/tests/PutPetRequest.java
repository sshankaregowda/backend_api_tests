/*PutPetRequest.java
This file is used to update the details of pet
 */

package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class PutPetRequest extends Base{

    public static Map<String,String> map = new HashMap<String,String>();

    //set the put body
    @Parameters({ "petName","petId" })
    @BeforeTest
    public void putPetdata(String name,String id){

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
                .put("/{petId}",id)
                .then()
                .statusCode(200)
                .assertThat()
                .header("Content-Type", containsString("application/json;"));

    }

}
