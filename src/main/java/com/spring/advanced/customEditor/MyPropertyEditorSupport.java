package com.spring.advanced.customEditor;

import com.spring.advanced.domain.Score;
import org.springframework.util.StringUtils;

import java.beans.PropertyEditorSupport;


public class MyPropertyEditorSupport extends PropertyEditorSupport {

    public void setAsText(String text) {
        if (StringUtils.hasText(text)) {
            String[] split = text.split("-");
            Score score = new Score();
            score.setScore(split[0]);
            score.setSubject(split[1]);
            this.setValue(score);

        }
    }
}
