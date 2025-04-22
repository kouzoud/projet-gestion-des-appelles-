package org.example.securityspring.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class PlainTextAuthProvider implements AuthenticationProvider {

    @Override
    public Authentication authenticate(Authentication authentication)
            throws AuthenticationException {

        String username = authentication.getName();
        String password = authentication.getCredentials().toString();

        // Vérification en texte brut (DÉCONSEILLÉ en production)
        if ("admin".equals(username) && "admin123".equals(password)) {
            return new UsernamePasswordAuthenticationToken(
                    username,
                    password,
                    Collections.singletonList(new SimpleGrantedAuthority("ROLE_ADMIN"))
            );
        }
        else if ("user".equals(username) && "password".equals(password)) {
            return new UsernamePasswordAuthenticationToken(
                    username,
                    password,
                    Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"))
            );
        }

        throw new AuthenticationException("Invalid credentials") {};
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class
                .isAssignableFrom(authentication);
    }
}