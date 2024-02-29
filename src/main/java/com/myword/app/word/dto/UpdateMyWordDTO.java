package com.myword.app.word.dto;

import com.myword.app.status.EStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;
import java.util.UUID;

public class UpdateMyWordDTO {

    @NotBlank
    private UUID id;
    @Size(max = 120)
    private String title;
    @NotBlank
    @Size(max = 777)
    private String content;
    @Size(max = 120)
    private String sign;
    private EStatus status;
    private LocalDateTime updated;

    public UpdateMyWordDTO() {
    }

    public UpdateMyWordDTO(UUID id, String title, String content, String sign, EStatus status, LocalDateTime updated) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.sign = sign;
        this.status = status;
        this.updated = updated;
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

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }
}
