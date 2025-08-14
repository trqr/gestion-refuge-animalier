package com.gestion_refuge.refuge_animalier.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.stereotype.Component;
import java.util.Date;


@Component
public class JwtUtil {
    private static final String SECRET = "admin";
    private static final Algorithm ALGORITHM = Algorithm.HMAC256(SECRET);

    public String generateToken(String email) {
        return JWT.create()
                .withSubject(email)
                .withIssuedAt(new Date())
                .withExpiresAt(new Date(System.currentTimeMillis() + 1000 * 1400 * 30))
                .sign(ALGORITHM);
    }

    public String extractEmail(String token) {
        DecodedJWT decodedJWT = JWT.require(ALGORITHM).build().verify(token);
        return decodedJWT.getSubject();
    }


    public boolean validateToken(String token, String username) {
        try {
            DecodedJWT decodedJWT = JWT.require(ALGORITHM).build().verify(token);
            return decodedJWT.getSubject().equals(username) && !isTokenExpired(decodedJWT);
        } catch (Exception e) {
            return false;
        }
    }

    private boolean isTokenExpired(DecodedJWT decodedJWT) {
        return decodedJWT.getExpiresAt().before(new Date());
    }
}
