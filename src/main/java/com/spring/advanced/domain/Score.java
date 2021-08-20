package com.spring.advanced.domain;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Score {
    private String subject;
    private String score;

    public Score(){}
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Bean
    public Score percent(){
        Score score = new Score();
        score.setSubject("English");
        score.setScore("100");
        return score;
    }
}
