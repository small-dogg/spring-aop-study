package com.smalldogg.study.aop.internalcall;

import com.smalldogg.study.aop.internalcall.aop.CallLogAspect;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Slf4j
@Import(CallLogAspect.class)
@SpringBootTest(properties = "spring.main.allow-circular-references=true")
//Spring Boot 2.6 기준 순환 참조를 기본적으로 금지하도록 변경되어, 강제로 순환 참조를 허용하도록 변경함
class CallServiceV1Test {

    @Autowired CallServiceV1 callServiceV1;

//    @Test
//    void external() {
//        callServiceV1.external();
//    }

}