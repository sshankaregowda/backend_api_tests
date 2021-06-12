/*GetPetIdRequest.java
This file is used to get the details of pet by pet id
 */

package tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class GetPetIdRequest extends Base {

    //get details for pet by petId
    @Test(dataProvider = "id")
    public void getPetIdApi(String id) {

        given()
                .when()
                .get("/{petId}", id)
                .then()
                .statusCode(200)
                .assertThat()
                .header("Content-Type", containsString("application/json"));
    }

    //print the response
    @Test(dataProvider = "id")
    public void getresponse(String id) {
        Response response =

                given()
                        .when()
                        .get("/{petId}", id).
                        then().
                        contentType(ContentType.JSON).
                        extract().response();
        String jsonAsString = response.asString();
        System.out.println(jsonAsString);

    }

}
