package com.spring.advanced.editor;

import com.spring.advanced.domain.Score;
import com.spring.advanced.editor.MyPropertyEditorSupport;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

import java.beans.PropertyEditor;


public class MyResourceEditorRegistrar implements PropertyEditorRegistrar {

    public void registerCustomEditors(PropertyEditorRegistry registry) {
        MyPropertyEditorSupport baseEditor = new MyPropertyEditorSupport();
        doRegisterEditor(registry, Score.class, baseEditor);
    }



    private void doRegisterEditor(PropertyEditorRegistry registry, Class<?> requiredType, PropertyEditor editor) {

        registry.registerCustomEditor(requiredType, editor);

    }
}
