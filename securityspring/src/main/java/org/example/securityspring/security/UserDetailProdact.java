package org.example.securityspring.security;

import org.example.securityspring.model.User;
import org.example.securityspring.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailProdact implements UserDetailsService {
    @Autowired
    UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepo.findByemail(email);
        if (user == null) {
            throw new UsernameNotFoundException(email);
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPassword(),user.getRoles());
    }
}
