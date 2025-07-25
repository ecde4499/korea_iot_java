package org.example.z_project.phr_solution.repository;

import org.example.z_project.phr_solution.dto.health_record.response.RecordListResponseDto;
import org.example.z_project.phr_solution.entity.HealthRecord;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HealthRecordRepository {
    private List<HealthRecord> healthRecords = new ArrayList<>();
    private static final HealthRecordRepository instance = new HealthRecordRepository();

    private HealthRecordRepository() {}

    public static HealthRecordRepository getInstance() {
        return instance;
    }

    public void save(HealthRecord record) {
        healthRecords.add(record);
    }

    public List<HealthRecord> findAll() {
        return new ArrayList<>(healthRecords);
    }

    public Optional<HealthRecord> findById(Long id) {
        return healthRecords.stream()
                .filter(record -> record.getId().equals(id))
                .findFirst();
    }

    public void delete(HealthRecord record) {
        healthRecords.remove(record);
    }
}
