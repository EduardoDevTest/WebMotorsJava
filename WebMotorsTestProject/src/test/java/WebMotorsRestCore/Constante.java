package WebMotorsRestCore;

import io.restassured.http.ContentType;

public interface Constante {
	 String APP_BASE_URL = "http://desafioonline.webmotors.com.br/swagger/ui/index#/";
	 Integer APP_PORT = 80;
	 String APP_BASE_PATH = "";
	 
	 ContentType APP_CONTENT_TYPE = ContentType.JSON;
	 
	 Long MAX_TIMEOUT = 5000L;
}
