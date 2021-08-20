package com.spring.advanced.customSchema;

import com.spring.advanced.domain.Score;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSimpleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class CustomSchemaBeanDefinitionParser extends AbstractSimpleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(Element element) {
        return Score.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {

        String subject = element.getAttribute("subject");
        String score = element.getAttribute("score");

        if(StringUtils.hasText(subject)){
            builder.addPropertyValue("subject", subject);
        }
        if(StringUtils.hasText(score)){
            builder.addPropertyValue("score", score);
        }
    }
}
