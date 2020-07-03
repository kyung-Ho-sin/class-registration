package com.steveleejava.user.login;

import java.util.Date;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtService {
	
	private final static String secretKey = "DFDSC223=4KXA";
	
	

	static public String createToken(UserDto userDto) {
		int expireMin = 60;
		JwtBuilder builder = Jwts.builder();
		
    builder.setHeaderParam("typ", "JWT"); 
//    builder.setSubject("Jwt")
//    				.setExpiration(new Date(System.currentTimeMillis() + 1000 * 6000 * expireMin))
//            .claim("User", userDto.getMailId())
//            .claim("role", userDto.getType());
    builder.signWith(SignatureAlgorithm.HS256, secretKey.getBytes());

		return builder.compact();
	}
	
	

	static public String checkTocken(String jwt) {
		Jwts.parser().setSigningKey(secretKey.getBytes()).parseClaimsJws(jwt);
		
		return "success";
	}
	
	

	static public Claims detailTocken(String jwt) {
    Jws<Claims> claims = null;
    
    try {
    	claims = Jwts.parser().setSigningKey(secretKey.getBytes()).parseClaimsJws(jwt);
    } catch (final Exception e) {
    	throw new RuntimeException();
    }

    return claims.getBody();		
	}	
}
