package com.rentalplatform.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rentalplatform.entity.ListingType;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Builder
@Data
public class ListingDto {
    private Long id;
    private String title;
    private String description;
    private Double price;
    private ListingType type;
    private String ownerUsername;
    @JsonProperty("created_at")
    private Instant createdAt;
}
