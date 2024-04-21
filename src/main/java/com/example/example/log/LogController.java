package com.devhouse.example2.log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 호출 흐름도 : 컨트롤러로 들어와서 서비스한테 요청하고, 서비스가 맵퍼한테 데이터 요청해서, 맵퍼가 마이바티스한테 데이터를 받아오고
 * 그걸 서비스한테 전달하면, 서비스는 잘 가공해서 컨트롤러한테 준다.
 *
 * 역순으로 작업을 한거임 - 데이터 주고받는 부분을 먼저 함 ( 맵퍼, 맵퍼.xml 단을 먼저함 ) -> 서비스단 -> 컨트롤러단 까지 내려옴
 * 정순으로 - 컨트롤러 만들고 -> 서비스 가공단 만들면서 -> 필요한 데이터 받아오는 부분 만듬.
 */

@RestController
@RequestMapping("/log")
public class LogController {

    @Autowired
    com.devhouse.example2.log.LogService logService;

    /**
     * RestController -> 객체 또는 Map/List 로 리턴하면, 이걸 자동으로 JSON 화 해서 보여줌
     * => 서비스 단에서 Map으로 리턴 하고 있었음. 이걸 그대로 리턴하면 되겠죠 ?
     *
     * 접근자 리턴타입 이름() { 내용 }
     */
    // http://localhost:6064/log/getLogList.api
    @GetMapping("/getLogList.api")
    public Map<String, Object> getLogList() {
        // 로그 서비스에 있는 함수에 의해, 맵데이터를 받아오고
        Map<String, Object> result = logService.getLogInfos();

        // 리턴하게 되면, 받아온 값을 자동으로 JSON 화 해서 보여줌
        return result;
    }
}
