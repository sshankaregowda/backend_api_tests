/*GetIdRequest.java
This file is used to get the details for specific id
 */

package tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class GetIdRequest extends Base {

    //get details for id
    @Test(dataProvider = "id")
    public void getIdApi(String id) {

        given()
                .when()
                .get("/{id}", id)
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
                        .get("/{id}", id).
                        then().
                        contentType(ContentType.JSON).
                        extract().response();
        String jsonAsString = response.asString();
        System.out.println(jsonAsString);

    }

}
