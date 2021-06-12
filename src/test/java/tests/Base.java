/*Base.java
This file is used to load the Base URL and Base Path for each test case
This file contains id parameters
 */


package tests;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;


public class Base {

    //loads the base URL and PATH
    @BeforeClass
    public void beforeClass() {

        RestAssured.baseURI = "api.bigtincan.org";
        RestAssured.basePath = "/stories";

    }

    //setting id parameters
    @DataProvider(name = "id")
    public Object[][] createidTestData() {

        return new Object[][]{
                {"2"},
                {"4"},
                {"6"}
        };
    }


}
