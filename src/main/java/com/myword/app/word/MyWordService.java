package com.myword.app.word;

import com.myword.app.word.dto.CreateMyWordDTO;
import com.myword.app.word.dto.UpdateMyWordDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;


public interface MyWordService {

    public ResponseEntity<?> findAll();
    public ResponseEntity<?> findById(UUID id);

    public ResponseEntity<?> findByTitle(String title);

    public ResponseEntity<?> findBySign(String sing);

    public ResponseEntity<?> update(UpdateMyWordDTO createMyWordDTO);

    public ResponseEntity<?> create(CreateMyWordDTO createMyWordDTO);

    public ResponseEntity<?> searchById(UUID id);

    public ResponseEntity<?> delete(UUID id);

    public ResponseEntity<?> findByStatus(String status);

    public ResponseEntity<?> findByCreation(LocalDateTime creation);
    public ResponseEntity<?> findByCreationBetween(LocalDateTime start, LocalDateTime end);

    public ResponseEntity<?> findByUpdated(LocalDateTime creation);
    public ResponseEntity<?> findByUpdatedBetween(LocalDateTime start, LocalDateTime end);
}
