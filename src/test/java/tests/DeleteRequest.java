/*DeleteRequest.java
This file is used to delete the specific id
 */

package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

public class DeleteRequest extends Base {

    //delete the api
    @Test(dataProvider = "id")
    public void deleteIdApi(String id) {

        given()
                .when()
                .delete("/{id}", id)
                .then()
                .statusCode(204)
                .assertThat()
                .header("Content-Type", containsString("application/json;"));
    }

}
