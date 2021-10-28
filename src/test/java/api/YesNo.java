package api;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class YesNo extends BaseTest{
	@Test(description = "Body Assertion")
	public void bodyAssertion() throws InterruptedException {
		{
			when().get("https://yesno.wtf/api").then().body("answer", equalTo("yes"));

		}
	}

	@Test(description = "Get Value From Response")
	public void getValueFromResponse() throws InterruptedException {
		{
			Response response = when().get("https://yesno.wtf/api").then().extract().response();
			String Answer = response.path("answer");
			System.out.println(Answer);

		}
	}


	}


