package test2312;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * ㅋㅏ드 뭉치
 * https://school.programmers.co.kr/learn/courses/30/lessons/159994
 */
public class Code06 {

    public static void main(String[] args) {
        String result1 = solution(new String[]{"i", "drink", "water"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"});
        String result2 = solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"});

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {

        Queue<String> cardQueue1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> cardQueue2 = new LinkedList<>(Arrays.asList(cards2));

        boolean result = true;

        for (String card : goal) {
            if (card.equals(cardQueue1.peek())) {
                cardQueue1.poll();
            } else if (card.equals(cardQueue2.peek())) {
                cardQueue2.poll();
            } else {
                result = false;
                break;
            }
        }

        return result ? "Yes" : "No";
    }

    /*
    이거 큐로 만들 필요 없었음
    그냥 인덱스로 해결 가능한... 문제였다네요

    int cardIdx1 = 0;
    int cardIdx2 = 0;

    for(int i=0; i<goal.length; i++){
        String target = goal[i];

        if(cardIdx1 < cards1.length && target.equals(cards1[cardIdx1]))
            cardIdx1 ++;
        else if (cardIdx2 < cards2.length && target.equals(cards2[cardIdx2]))
            cardIdx2++;
        else
            return "No";
    }

    return "Yes";
     */
}
