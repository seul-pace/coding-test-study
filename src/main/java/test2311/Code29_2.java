package test2311;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 가장 가까운 같은 글자
 * https://school.programmers.co.kr/learn/courses/30/lessons/142086
 */
public class Code29_2 {

    public static void main(String[] args) {
        int[] result = solution("banana");
        for (int i : result) {
            System.out.print(i + ", ");
        }
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];

        // 들어온 문자열을 나눈다
        String[] array = s.split("");
        // string을 하나하나 체크하고 넣어줄 list
        List<String > strArray = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            // string 존재 여부 체크
            if (strArray.contains(array[i])) {
                // 존재하면 여태까지 들어있던 list를 string으로 바꿔주고
                String joinStrArray = String.join("", strArray);
                // 마지막 인덱스를 찾아서
                int index = joinStrArray.lastIndexOf(array[i]);
                // 현재 인덱스와 차이를 구한다
                answer[i] = i - index;
            } else {
                // 없으면 걍 -1
                answer[i] = -1;
            }
            strArray.add(array[i]);
        }

        /*
        근데 이런 방법이 있었음...
        진짜 똑똑하다;
        굳이 split 하지 않고 index 별로 charAt으로 가져오고,

        map 특성을 이용해서 해당 문자는 가장 마지막 index가 value로 들어가게 하고,
        getOrDefault로 만들어서
        없으면 현재 index - (현재 index + 1)이니까 무조건 -1 나와 ㅇ.ㅇ,,

        천재임;

        차이는 value로 들어간 마지막 index를 현재 인덱스에서 빼주는 방식
        와우

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            answer[i] = i-map.getOrDefault(ch,i+1);
            map.put(ch,i);
        }
*/
        return answer;
    }
}
