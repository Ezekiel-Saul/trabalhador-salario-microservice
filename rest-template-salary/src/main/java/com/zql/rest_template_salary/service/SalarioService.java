package com.zql.rest_template_salary.service;

import com.zql.rest_template_salary.DTO.SalarioDTO;
import com.zql.rest_template_salary.DTO.TrabalhadorDTO;
import com.zql.rest_template_salary.Entity.Salario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalarioService {

    public double calculateSalario(TrabalhadorDTO trabalhadorDTO) {
        // Example: Base hourly rate varies by role
        double hourlyRate = switch (trabalhadorDTO.getFuncao().toLowerCase()) {
            case "manager" -> 50.0;
            case "developer" -> 30.0;
            case "intern" -> 15.0;
            default -> 20.0;
        };

        return hourlyRate * trabalhadorDTO.getHorasCount();
    }
}






