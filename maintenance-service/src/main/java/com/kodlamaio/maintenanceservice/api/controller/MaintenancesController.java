package com.kodlamaio.maintenanceservice.api.controller;


import com.kodlamaio.maintenanceservice.business.abstracts.MaintenanceService;
import com.kodlamaio.maintenanceservice.business.dto.requests.CreateMaintenanceRequest;
import com.kodlamaio.maintenanceservice.business.dto.requests.UpdateMaintenanceRequest;
import com.kodlamaio.maintenanceservice.business.dto.response.CreateMaintenanceResponse;
import com.kodlamaio.maintenanceservice.business.dto.response.GetAllMaintenancesResponse;
import com.kodlamaio.maintenanceservice.business.dto.response.GetMaintenanceResponse;
import com.kodlamaio.maintenanceservice.business.dto.response.UpdateMaintenanceResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/api/maintenances")
public class MaintenancesController {
    private final MaintenanceService service;

    @GetMapping
    public List<GetAllMaintenancesResponse> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public GetMaintenanceResponse getById(@PathVariable UUID id) {
        return service.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateMaintenanceResponse add(@Valid @RequestBody CreateMaintenanceRequest request) {
        return service.add(request);
    }

    @PutMapping("/return") //
    public GetMaintenanceResponse returnCarFromMaintenance(@RequestParam UUID carId) {
        return service.returnCarFromMaintenance(carId);
    }

    @PutMapping("/{id}")
    public UpdateMaintenanceResponse update(@PathVariable UUID id, @Valid @RequestBody UpdateMaintenanceRequest request) {
        return service.update(id, request);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable UUID id) {
        service.delete(id);
    }
}

//PathVariable: url de /cars7/ gibi görünür(*** daha kullanılabilir ***).
//RequestParam: url de /cars?includeMaintenance=true gibi görünür.

