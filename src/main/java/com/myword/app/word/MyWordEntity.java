package com.myword.app.word;

import com.myword.app.status.EStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "my_word")
public class MyWordEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Size(max = 120)
    private String title;
    @NotBlank
    @Size(max = 777)
    private String content;
    @Size(max = 120)
    private String sign;
    private EStatus status;
    @Column(updatable = false)
    private LocalDateTime creation;
    private LocalDateTime updated;
    private LocalDateTime lastUpdated;

    public MyWordEntity() {
    }


    public MyWordEntity(String title, String content, String sign, EStatus status, LocalDateTime creation, LocalDateTime updated, LocalDateTime lastUpdated) {
        this.title = title;
        this.content = content;
        this.sign = sign;
        this.status = status;
        this.creation = creation;
        this.updated = updated;
        this.lastUpdated = lastUpdated;
    }

    public MyWordEntity(UUID id, String title, String content, String sign, EStatus status, LocalDateTime creation, LocalDateTime updated, LocalDateTime lastUpdated) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.sign = sign;
        this.status = status;
        this.creation = creation;
        this.updated = updated;
        this.lastUpdated = lastUpdated;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public EStatus getStatus() {
        return status;
    }

    public void setStatus(EStatus status) {
        this.status = status;
    }

    public LocalDateTime getCreation() {
        return creation;
    }

    public void setCreation(LocalDateTime creation) {
        this.creation = creation;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }
}
