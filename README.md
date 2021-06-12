# API tests

This is RestAssured framework with Testng and maven built
Tests cannot be executed because endpoint given is just the sample.
Tests can be run for valid endpoint

Steps to run
1. git clone https://github.com/sshankaregowda/backend_api_tests.git
2. open cmd
3. navigate to project location 

Framework structure:

Base class - contains base url and base path. It also has test case parameters declared using @dataprovider
DeletePetRequest class - deletes the details for specific pet by pet id
GetPetIdRequest class - fetch the details for specific pet id and print the response
PostPetRequest class - post the pet details 
PutPetRequest class - updates the details of pet by pet id


