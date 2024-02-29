package com.myword.app.word;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/word")
public class MyWordController {
    @GetMapping("/")
    public ResponseEntity<?> listWords(){
        return ResponseEntity.ok("Todo Correcto");
    }
}
