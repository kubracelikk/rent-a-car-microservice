package com.kodlamaio.rentalservice.api.clients;

import com.kodlamaio.commonpackage.utils.dto.ClientResponse;
import com.kodlamaio.commonpackage.utils.dto.GetBrandResponse;
import com.kodlamaio.commonpackage.utils.dto.GetCarResponse;
import com.kodlamaio.commonpackage.utils.dto.GetModelResponse;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

@FeignClient(name = "inventory-service", fallback = CarClientFallback.class)
public interface CarClient {
    @GetMapping(value = "/api/cars/check-car-available/{carId}")
    @Retry(name = "check-car-availability")
    ClientResponse checkIfCarAvailable(@PathVariable UUID carId);

    @GetMapping(value = "/api/cars/{carId}")
    GetCarResponse getById(@PathVariable UUID carId);

    @GetMapping(value = "/api/models/{modelId}")
    GetModelResponse modelGetById(@PathVariable UUID modelId);

    @GetMapping(value = "/api/brands/{brandId}")
    GetBrandResponse brandGetById(@PathVariable UUID brandId);

}
