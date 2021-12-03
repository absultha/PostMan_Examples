package oAuth;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class oAuthRequest {
	@Test
	public void PostCall() {
		
		RestAssured.given()
		.auth()
		.oauth2("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")
		           .baseUri("https://api.github.com")
		            .contentType(ContentType.JSON)
					.accept(ContentType.JSON)
					.body(" {\n" + 
							"    \"name\": \"PostmanTest123\",\n" + 
							"    \"desription\": \"Test Repo\",\n" + 
							"    \"homepage\": \"https://github.com/\",\n" + 
							"    \"private\": false,\n" + 
							"    \"has_issues\": true,\n" + 
							"    \"has_projects\": true,\n" + 
							"    \"has_wiki\": true\n" + 
							"}")
		            .when()
		            .post("/user/repos")
	                .then()
	                .statusCode(201)
	                .log()
	                .all();
		
	}

}
