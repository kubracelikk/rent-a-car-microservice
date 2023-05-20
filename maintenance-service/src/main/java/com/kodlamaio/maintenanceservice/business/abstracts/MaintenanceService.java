package com.kodlamaio.maintenanceservice.business.abstracts;

import com.kodlamaio.maintenanceservice.business.dto.requests.CreateMaintenanceRequest;
import com.kodlamaio.maintenanceservice.business.dto.requests.UpdateMaintenanceRequest;
import com.kodlamaio.maintenanceservice.business.dto.response.CreateMaintenanceResponse;
import com.kodlamaio.maintenanceservice.business.dto.response.GetAllMaintenancesResponse;
import com.kodlamaio.maintenanceservice.business.dto.response.GetMaintenanceResponse;
import com.kodlamaio.maintenanceservice.business.dto.response.UpdateMaintenanceResponse;

import java.util.List;
import java.util.UUID;

public interface MaintenanceService {
    List<GetAllMaintenancesResponse> getAll();

    GetMaintenanceResponse getById(UUID id);

    GetMaintenanceResponse returnCarFromMaintenance(UUID carId);

    CreateMaintenanceResponse add(CreateMaintenanceRequest request);

    UpdateMaintenanceResponse update(UUID id, UpdateMaintenanceRequest request);

    void delete(UUID id);
}
