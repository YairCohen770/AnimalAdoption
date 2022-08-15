package AnimalAdoption.ObjectDepartment;

public class Token {

	public String token_type;
	public Integer expires_in;
	public String access_token;

	public Token(){

	}

	public Token(String token_type, Integer expires_in, String access_token) {
		this.token_type = token_type;
		this.expires_in = expires_in;
		this.access_token = access_token;
	}

	public String getToken_type() {
		return token_type;
	}

	public Integer getExpires_in() {
		return expires_in;
	}

	public String getAccess_token() {
		return access_token;
	}
}
