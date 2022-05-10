package com.kovalchuk.EnergyConsumptions.security;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JWTTokenHelper {
	
	@Value("${jwt.auth.app}")
	private String appName;
	
	@Value("${jwt.auth.secret_key}")
	private String secretKey;
	
	@Value("${jwt.auth.expires_in}")
	private int expiresIn;
	
	private SignatureAlgorithm SIGNATURE_ALGORITHM = SignatureAlgorithm.HS256;
	
	private Date generateExpirationDate() {
		return new Date(new Date().getTime() + expiresIn * 1000);
	}
	
	private Claims getAllClaimsFromToken(String token) {
		Claims claims;

		try {
			claims = Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody();
		} catch (Exception e) {
			claims = null;
		}
		return claims;
	}
		
	private Date getExpirationDate(String token) {
		Date exiprationDate;
		try {
			final Claims claims = this.getAllClaimsFromToken(token);
			exiprationDate = claims.getExpiration();
		} catch(Exception e) {
			exiprationDate = null;
		}
		return exiprationDate;
	}
	
	private boolean isTokenExpired(String token) {
		return getExpirationDate(token).before(new Date());
	}
	
	public String getUsernameFromToken(String token) {
		String username;
		try {
			final Claims claims = this.getAllClaimsFromToken(token);
			username = claims.getSubject();
		} catch (Exception e) {
			username = null;
		}
		return username;
	}
	
	public Date getIssuedAtDateFromToken(String token) {

		Date issuedAtDate;

		try {
			final Claims claims = this.getAllClaimsFromToken(token);
			issuedAtDate = claims.getIssuedAt();
		} catch (Exception e) {
			issuedAtDate = null;
		}

		return issuedAtDate;

	}
	
	public String generateToken(String username) throws InvalidKeySpecException, NoSuchAlgorithmException{
		
		return Jwts.builder()
				.setIssuer(appName)
				.setSubject(username)
				.setIssuedAt(new Date())
				.setExpiration(generateExpirationDate())
				.signWith(SIGNATURE_ALGORITHM, secretKey)
				.compact();
		
	}
	
	public Boolean validateToken(String token, UserDetails userDetails) {
		
		final String username = getUsernameFromToken(token);
		
		return (username != null &&
				username.equals(userDetails.getUsername()) &&
				!isTokenExpired(token));	
	}
	
	public String getToken(HttpServletRequest request) {
	
		String authHeader = request.getHeader("Authorization");
		
		if(authHeader != null && authHeader.startsWith("Bearer ")) {
			return authHeader.substring(7);
		}
		
		return null;
		
	}
 
}
