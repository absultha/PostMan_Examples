package restAPIBDD;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DeleteRequest {
	@Test
	public void DeleteCall() {
		
		RestAssured.given()
		            .baseUri("http://localhost:7000")
		            .when()
		            .delete("/employees/11")
	                .then()
	                .statusCode(200);
	                
	}
}
