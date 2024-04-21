package com.example.example.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 주소구조
 * - 메인주소/컨트롤러맵핑주소/함수맵핑주소
 * - 메인주소 : 로컬에서 키면 localhost:내가설정한 포트
 *
 * - application.properties 에 있고, port 라는 녀석임.
 * - localhost:16830
 *
 * - localhost:16830/cmm/test.api
 */

@RestController
@RequestMapping("/cmm")
public class testController {

    public Logger logger = LoggerFactory.getLogger(this.getClass());

    /*
    *
    * 컨트롤러 생성시 규칙
    * - 앞에 대문자
    * - 뒤에 소문자고, 특이점 있을때 대문자 변경
    * - TestController
    *
    * 함수
    * - 앞에 소문자
    * - 특이점 일때 대문자
    * - testFunction
    *
    * 변수명도
    * - 소문자로 시작
    *
    * */

    /**
     *
     * 함수 만드는 방법
     * - 앞에 타입 붙임 : public / private - 오픈되어 있는지, 함수가 클래스 안에 갇혀있는지 등 표시
     * - 뒤에 리턴 타입 : String, Int, Void 등
     * - 이름
     *
     *
     */

    // 함수 생성 예제
    public void test() {
        String test = "1";
        String test2 = "test";

        int testNum = 1;
        int testNum2 = 10;

        Boolean test22 = false; // true : false

        Double db1 = 1.0;

        // 사칙연산
        int cnt1 = 5;
        int cnt2 = 10;

        // 덧셈
        int sum = cnt1 + cnt2;

        // 마이너스
        int minus = cnt1 - cnt2;

        // 곱셈
        int gob = cnt1 * cnt2;

        // 나누기
        int nanu = cnt1 / cnt2;

        // 나머지
        int name = cnt1 % cnt2;

        // -------------------------------------------------------

        // if 문
        if(cnt1 != 10) {
            logger.info("is CNT !!!");
        }

        // for 문
        // 배열 만드는 부분임
        ArrayList<Integer> intArray = new ArrayList<>();
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        intArray.add(4);

        for(int cnt: intArray) {
            logger.info("cnt " + cnt);
        }

        // while
        // 조건에 맞는한 계속 돔
        while(cnt1 < 10) {
            cnt1 = cnt1 + 1;
        }

        // switch
        switch (cnt1) {
            case 0:
                logger.info("isTest");
                break;
            default:
                break;
        }


    }

    @GetMapping("/test.api")
    public Map<String, Object> showMap() {
        int testCnt = 0;
        while(testCnt < 10) {
            testCnt = testCnt + 1;
        }

        Map<String, Object> test = new HashMap<>();
        test.put("test", "test");

        return test;
    }

    @GetMapping("/test2.api")
    public Map<String, Object> showMap2() {
        int testCnt1 = 0;
        while(testCnt1 < 20) {
            testCnt1 = testCnt1 + 1;
        }

        Map<String, Object> test2 = new HashMap<>();
        test2.put("key", "value");

        return test2;
    }
}

// 주소구조
// - 메인주소 / 컨트롤맵핑주소 / 함수맵핑주소

