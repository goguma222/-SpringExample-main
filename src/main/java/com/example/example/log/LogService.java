
package com.devhouse.example2.log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LogService {

    @Autowired
    com.devhouse.example2.log.LogMapper logMapper;

    /**
     * 자바에서 함수를 만드는 규칙
     * 접근자 리턴값 함수명() { 내용 }
     */
    public Map<String, Object> getLogInfos() {
        // 결과담을 맵 미리 만듬 : 이 값을 리턴 예정
        // 맵, 또는 리스트 등, 배열을 담는 친구들은 초기화를 안한채 담으려 하면 오류가 나서 프로그램이 죽음.
        Map<String, Object> resultMap = new HashMap<>();

        // logMapper 에서 로그 리스트 가져오는 함수를 호출.
        List<Map<String, Object>> getLogLists = logMapper.getLogList();

        /**
         * 1] DB에서 오류가 나서 반환을 안했을수도 있고,
         * 2] MyBatis 의 변덕, 또는 오류로 안갔다 줬을수도 있고,
         * 3] DB 가 갑자기 죽었을수도 있고,
         * 4] 타임아웃이 걸리거나 기타, 알수없는 이유로 데이터가 안올수 있다.
         *
         * == null 이라고 함
         */
        // 이 아이가 null 이 아니고, 비어있지 않다면, resultMap 에 "data" 라는 키로 매핑
        if(getLogLists != null && !getLogLists.isEmpty()) {
            resultMap.put("data", getLogLists);
        }

        // 결과 맵 리턴
        return resultMap;
    }
}
