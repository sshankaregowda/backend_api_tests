/*DeletePetRequest.java
This file is used to delete the pet by pet id
 */

package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

public class DeletePetRequest extends Base {

    //delete the api
    @Test(dataProvider = "id")
    public void deletePetIdApi(String id) {

        given()
                .when()
                .delete("/{petId}", id)
                .then()
                .statusCode(204)
                .assertThat()
                .header("Content-Type", containsString("application/json;"));
    }

}
