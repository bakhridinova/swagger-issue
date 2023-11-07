package swagger.issue.controller;

import jakarta.validation.constraints.Size;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
class FooController {

    @GetMapping("/foo")
    public ResponseEntity<String> foo(@Size(min = 1, max = 3) @RequestParam Set<String> strings) {
        return ResponseEntity.ok("Foo!");
    }
}