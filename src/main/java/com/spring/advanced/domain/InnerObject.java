package com.spring.advanced.domain;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(0)
public class InnerObject {


    @Component
    @Order(1)
    private static class InnerObject2 extends ParentObject{


        @Component
        @Order(2)
        private static class InnerObject3 {

        }
    }

}
