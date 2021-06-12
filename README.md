# Bigtincan

This is RestAssured framework with Testng and maven built
Tests cannot be executed because endpoint given is just the sample.
Tests can be run for valid endpoint

Steps to run
1. git clone https://github.com/sshankaregowda/Bigtincan.git
2. open cmd
3. navigate to project location and run "mvn clean test"
4. see the results

Framework structure:

Base class - contains base url and base path. It also has test case parameters declared using @dataprovider
DeleteRequest class - deletes the details for specific id
GetIdRequest class - fetch the details for specific id and print the response
GetRequest class - fetch the details and print the response
PostRequest class - post the details 
PutRequest class - updates the details for specific id


