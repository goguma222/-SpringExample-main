package com.devhouse.example2.log;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 자바 - 클래스/인터페이스/이넘/어테이션
 * - 어노테이션 : 여러 설정값, 기본사항들에 대해 어노테이션으로 해결중이다.
 * - 이넘 : 태깅
 * enum 이름 {
 *     A,B,C
 * }
 *
 * - 인터페이스 : 클래스처럼 뭔가 함수를 만들고 상속받고 할수 있는건 X, 다만 중간 다리역할 하는 아이고,
 * 가상의 함수를 만들어서 다른쪽에서 이 가상의 함수를 사용할수 있게 만들어 줌
 * - 클래스 : 우리가 많이 보는 그친구, 변수도, 함수도, 상속도 받을수 있는 친구.
 */

/**
 * TODO :
 * 자바 - 스터디, 깊게 하진 않으셔도 되고, 키워드 검색 및 스터디
 * 상속, public/private 등 접근자, interface와 abstract, 이넘의 역할 및 사용법, ( 이건 시간 있을때 ) 가비지 콜렉터.
 * override / overload 차이점
 */

@Mapper
@Repository
@MapperScan("com.devhouse.example2")
public interface LogMapper {

    /**
     * 가상의 함수를 생성한다 => 내용없이 생성한다 => 함수 이름만 가지고 생성함.
     * 인터페이스는 그런 의미 입니다.
     */
    public List<Map<String, Object>> getLogList();
}
