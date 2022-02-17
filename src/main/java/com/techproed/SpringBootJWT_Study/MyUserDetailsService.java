package com.techproed.SpringBootJWT_Study;


import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {
// JWT icin MyUserDetailsService class mutlaka create edilmeli . loadUserByUsername method ile App'e user upload edilmeli

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
      // bu method App'e user'in username ve authorizes tanimladi-->cubuk adam tum vasiflariyla create edildi
        return new User("admin","nimda", new ArrayList<>());
        // ArrayList<>()--> collection type authorizes birden fazla ve sabit old icin depolayacak bir bos array create edildi

    }
}
