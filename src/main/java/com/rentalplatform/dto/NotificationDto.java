package com.rentalplatform.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Builder
@Data
public class NotificationDto {
    private Long id;
    private String message;
    private boolean isRead;
    private String username;
    @JsonProperty("created_at")
    private Instant createdAt;
}
