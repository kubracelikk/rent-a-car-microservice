package com.kodlamaio.maintenanceservice.business.dto.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateMaintenanceRequest {
    @NotNull
    private UUID carId;
    @NotBlank
    @Size(min = 2, max = 1000)
    private String information;
}
