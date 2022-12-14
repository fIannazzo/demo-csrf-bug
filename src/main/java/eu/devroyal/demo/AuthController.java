package eu.devroyal.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class AuthController {


    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@RequestBody String loginRequest) {


        return ResponseEntity.ok("SUCCESS"
        );
    }

}

