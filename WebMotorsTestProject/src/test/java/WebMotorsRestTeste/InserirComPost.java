package WebMotorsRestTeste;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import io.restassured.RestAssured;

public class InserirComPost {

	@Test
	public void inserirDados() {

		given()
			.log().all()
				.contentType("application/json")
				.body("{\"marca\": \"HONDA\",\r\n" + "\"Modelo\": \"City\",\r\n" + "\"linha\": \"cvt\",\r\n"
						+ "\"estoque\": \"trinta unidades\"\r\n" + "}")
			.when()
				.post("http://desafioonline.webmotors.com.br/swagger/ui/index#!/OnlineChallenge")
				.then().log().all();
			//	.statusCode(201);

	}
}
