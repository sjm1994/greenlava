package kr.kro.greenlava.demo.global.util.jwt;

import java.util.Date;
import java.util.HashMap;

import io.jsonwebtoken.Header;
import io.jsonwebtoken.JwsHeader;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtProvider {

	public static String generateToken(int jwtExpire_sec, SignatureAlgorithm alg, String apiKey , String apiSecret) throws Exception {

		Date expiration = new Date(System.currentTimeMillis() + (jwtExpire_sec * 1000));

		HashMap<String, Object> claimsMap = new HashMap<String, Object>();

		claimsMap.put("iss", apiKey);

		String token = Jwts.builder()
				.setHeaderParam(Header.TYPE, Header.JWT_TYPE)
				.setHeaderParam(JwsHeader.ALGORITHM, alg.getJcaName())
				.setClaims(claimsMap)
				.setExpiration(expiration)
				.signWith(alg, apiSecret.getBytes())
				.compact();

		return token;
	}

}
