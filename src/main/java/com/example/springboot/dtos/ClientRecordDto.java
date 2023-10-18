package com.example.springboot.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ClientRecordDto(@NotBlank String name, @NotNull String login, @NotNull String password) {
}
