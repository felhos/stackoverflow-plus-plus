package com.codecool.stackoverflowtw.controller.dto;

import java.time.LocalDateTime;

public record AnswerDTO(int id, int user_id, int question_id, String body, LocalDateTime date) {
}
