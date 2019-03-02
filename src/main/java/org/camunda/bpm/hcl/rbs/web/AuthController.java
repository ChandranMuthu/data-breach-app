package org.camunda.bpm.hcl.rbs.web;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.camunda.bpm.hcl.rbs.domain.User;
import org.camunda.bpm.hcl.rbs.repository.UserRepository;
import org.camunda.bpm.hcl.rbs.request.AuthenticationRequest;
import org.camunda.bpm.hcl.rbs.security.jwt.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtTokenProvider jwtTokenProvider;

    @Autowired
    UserRepository userRepository;

    @PostMapping("/signin")
    public ResponseEntity<Map<String,Object>> signin(@RequestBody AuthenticationRequest data) {

        try {
            String username = data.getUsername();
            User user = this.userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("Username " + username + "not found"));
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, data.getPassword()));
            String token = jwtTokenProvider.createToken(username, Arrays.asList(user.getRole().getRoleName()));

            Map<String, Object> model = new HashMap<>();
            model.put("username", username);
            model.put("token", token);
            return ResponseEntity.ok(model);
        } catch (AuthenticationException e) {
            throw new BadCredentialsException("Invalid username/password supplied");
        }
    }
}
