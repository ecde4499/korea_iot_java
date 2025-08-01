package org.example.z_project.phr_solution.controller;

import org.example.z_project.phr_solution.dto.health_record.request.RecordCreateRequestDto;
import org.example.z_project.phr_solution.dto.health_record.response.RecordListResponseDto;
import org.example.z_project.phr_solution.service.HealthRecordService;
import org.example.z_project.phr_solution.service.implement.HealthRecordServiceImpl;

import java.util.List;

public class HealthRecordController {
    private HealthRecordService healthRecordService;

    public HealthRecordController () {
        this.healthRecordService = new HealthRecordServiceImpl();
    }

    public void createRecord(RecordCreateRequestDto dto) {
        healthRecordService.createRecord(dto);
    }

    public List<RecordListResponseDto> getAllRecord () {
        return healthRecordService.getAllRecord();
    }

    // 필터링 (검색 기능)
    public List<RecordListResponseDto> filterRecordByDiagnosis(String diagnosis) {
        return healthRecordService.filterRecordsByDiagnosis(diagnosis);
    }

    public void deleteRecord(Long id) {
        healthRecordService.deleteRecord(id);
    }
}
