package WebMotorsRestTeste;

import org.junit.Test;

import WebMotorsRestCore.BaseTestes;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import junit.framework.Assert;

public class TesteStatusCode {

	@Test
	public void validarStatusCodeSucessoModel() {
		Response response = RestAssured.request(Method.GET,
				"http://desafioonline.webmotors.com.br/swagger/ui/index#!/OnlineChallenge/OnlineChallenge_Model");
		Assert.assertTrue("sucesso", response.statusCode() == 200);

	}

	@Test
	public void validarStatusCodeInsucessoModel() {
		Response response = RestAssured.request(Method.GET,
				"http://desafioonline.webmotors.com.br/swagger/ui/index#!/OnlineChallenge/OnlineChallenge_Model");
		Assert.assertFalse("insucesso", response.statusCode() == 400);

	}

	@Test
	public void validarStatusCodeSucessoMake() {
		Response response = RestAssured.request(Method.GET,
				"http://desafioonline.webmotors.com.br/swagger/ui/index#!/OnlineChallenge/OnlineChallenge_Make");
		Assert.assertTrue("sucesso", response.statusCode() == 200);

	}

	@Test
	public void validarStatusCodeInsucessoMake() {
		Response response = RestAssured.request(Method.GET,
				"http://desafioonline.webmotors.com.br/swagger/ui/index#!/OnlineChallenge/OnlineChallenge_Make");
		Assert.assertFalse("insucesso", response.statusCode() == 400);

	}

	@Test
	public void validarStatusCodeSucessoVersion() {
		Response response = RestAssured.request(Method.GET,
				"http://desafioonline.webmotors.com.br/swagger/ui/index#!/OnlineChallenge/OnlineChallenge_Version");
		Assert.assertTrue("sucesso", response.statusCode() == 200);

	}

	@Test
	public void validarStatusCodeInsucessVersion() {
		Response response = RestAssured.request(Method.GET,
				"http://desafioonline.webmotors.com.br/swagger/ui/index#!/OnlineChallenge/OnlineChallenge_Version");
		Assert.assertFalse("insucesso", response.statusCode() == 400);

	}

	@Test
	public void validarStatusCodeSucessoVehicles() {
		Response response = RestAssured.request(Method.GET,
				"http://desafioonline.webmotors.com.br/swagger/ui/index#!/OnlineChallenge/OnlineChallenge_Vehicle");
		Assert.assertTrue("sucesso", response.statusCode() == 200);

	}

	@Test
	public void validarStatusCodeInsucessoVehicles() {
		Response response = RestAssured.request(Method.GET,
				"http://desafioonline.webmotors.com.br/swagger/ui/index#!/OnlineChallenge/OnlineChallenge_Vehiclehttp://desafioonline.webmotors.com.br/swagger/ui/index#!/OnlineChallenge/OnlineChallenge_Vehicle");
		Assert.assertFalse("insucesso", response.statusCode() == 400);

	}

}
