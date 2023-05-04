package com.codecool.stackoverflowtw.dao;

import com.codecool.stackoverflowtw.controller.dto.QuestionDTO;
import com.codecool.stackoverflowtw.dao.model.Question;
import org.springframework.cglib.core.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

public interface QuestionsDAO extends JpaRepository<Question, Integer> {
    @Modifying
    @Query(value = "SELECT q.id,q.title,q.body,q.date_created, u.id,u.username, COUNT(a) " +
            "FROM questions q " +
            "JOIN users u on u.id = q.user_id " +
            "LEFT JOIN answers a on q.id = a.question_id " +
            "GROUP BY q.id, q.title , q.body, q.date_created, u.id, u.username " +
            "ORDER BY :column ", nativeQuery = true)
    List<Object[]> findQuestionsWithAnswersCounts(@Param("column") String column);


    default List<QuestionDTO> findQuestionsWithAnswersCount(String column) {
        System.out.println(column);
        List<Object[]> results = findQuestionsWithAnswersCounts("q.id ASC");
        return results.stream().map(tuple -> new QuestionDTO(
                        (int) tuple[0],
                        (String) tuple[1],
                        (String) tuple[2],
                        ((java.sql.Date) tuple[3]).toLocalDate().atStartOfDay(),
                        (int) tuple[4],
                        (String) tuple[5],
                        Integer.parseInt(tuple[6].toString())))
                .collect(Collectors.toList());

    }
}