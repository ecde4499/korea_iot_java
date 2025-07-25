package org.example.z_project.phr_solution.service;

import org.example.z_project.phr_solution.dto.patient.request.PatientCreateRequestDto;
import org.example.z_project.phr_solution.dto.patient.request.PatientUpdateRequestDto;
import org.example.z_project.phr_solution.dto.patient.response.PatientDetailResponseDto;
import org.example.z_project.phr_solution.dto.patient.response.PatientListResponseDto;

import java.util.List;

public interface PatientService {
    // CR(전체/단건)UD
    void registerPatient(PatientCreateRequestDto dto);
    List<PatientListResponseDto> listAllPatient();
    PatientDetailResponseDto getPatientById(Long id);
    void updatePatient(Long id, PatientUpdateRequestDto dto);
    void deletePatient(Long id);
}
