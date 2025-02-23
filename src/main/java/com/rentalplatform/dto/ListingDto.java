package com.rentalplatform.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rentalplatform.entity.ListingType;
import com.rentalplatform.entity.ReviewEntity;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

@Builder
@Data
public class ListingDto implements Serializable {
    private Long id;
    private String title;
    private String description;
    private Double price;
    private String address;
    private ListingType type;
    private String ownerUsername;
    @JsonProperty("created_at")
    private Instant createdAt;
    @JsonProperty("next_available_date_for_booking")
    private Instant nextAvailableDateForBooking;
    private List<ReviewDto> reviews;
}
