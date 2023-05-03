package kr.kro.greenlava.demo.global.constant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Constant {

	public static String JWT_KEY;
	public static String JWT_SECRET;
	
	@Value("${jwt.key}")
	public void setJWT_KEY(String JWT_KEY) {
		Constant.JWT_KEY = JWT_KEY;
	}

	@Value("${jwt.secret}")
	public void setJWT_SECRET(String JWT_SECRET) {
		Constant.JWT_SECRET = JWT_SECRET;
	}

}
