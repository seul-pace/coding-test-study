import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CodeStudy0305_1 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new String[][]{{"MO 12:00 WE 14:30", "MO 12:00", "MO 15:00", "MO 18:00"}, {"TU 09:00", "TU 10:00", "TU 15:00", "TU 18:00"}, {"WE 09:00", "WE 12:00", "WE 15:00", "WE 18:00"}, {"TH 09:30", "TH 11:30", "TH 15:00", "TH 18:00"}, {"FR 15:00", "FR 15:00", "FR 15:00", "FR 15:00"}});
        System.out.println(result);
    }

    public static class Solution {
        public Solution() {}

        public int solution(String[][] schedule) {
            /*
            {
                {"MO 12:00 WE 14:30", "MO 12:00", "MO 15:00", "MO 18:00"},
                {"TU 09:00", "TU 10:00", "TU 15:00", "TU 18:00"},
                {"WE 09:00", "WE 12:00", "WE 15:00", "WE 18:00"},
                {"TH 09:30", "TH 11:30", "TH 15:00", "TH 18:00"},
                {"FR 15:00", "FR 15:00", "FR 15:00", "FR 15:00"}}

                서로 하나 씩 겹치는 경우가 생기면?

                일단 모두 겹치는 걸 제외하고 곱하기를 해서 가짓수를 구하고,
                되는 애들끼리 구해서 곱해야 하네
             */
            int answer = -1;

            /*
            a클래스 1번부터 포문 돌려
            뭔가 겹치는 애가 있어! 그러면 걘 빼 넘어가
            겹치는 애 있어
            */
            List<List<Schedule>> list = new ArrayList<>();

            // 과목 별 스케쥴 구분 및 정리
            for (int i=0; i<schedule.length; i++) {
                List<Schedule> scheduleList = new ArrayList<>();

                for (int j=0; j<schedule[i].length; j++) {
                    String daySchedule = schedule[i][j];
                    String[] splitDaySchedule = daySchedule.split(" ");

                    if (splitDaySchedule.length <= 2) {
                        scheduleList.add(new Schedule(splitDaySchedule[0], splitDaySchedule[1], null, null));
                    } else {
                        scheduleList.add(new Schedule(splitDaySchedule));
                    }
                }

                list.add(scheduleList);
            }

            // 겹치는지 확인
            for (int i=0; i<list.size(); i++) {
                // 비교가 되는 과목의 스케쥴 리스트
                List<Schedule> scheduleList = list.get(i);

                for (int j=0; j<list.size(); j++) {
                    if (i==j) continue; // 동일한 것은 비교 넘어가기
                    // 비교할 리스트
                    List<Schedule> compareList = list.get(j);

                    for (Schedule s : scheduleList) {
                        for (Schedule compareS : compareList) {
                            boolean dayCheck = false;
                            // 시작일자가 같은지 확인
                            if (s.getDay().equals(compareS.getDay())) {
                                dayCheck = true;
                            } else {
                                // 시작일자가 달라도 추가 강의 시간이 겹칠 수 있음
                                if (s.getPlusDay() != null
                                        && (s.getPlusDay().equals(compareS.getDay())) || s.getPlusDay().equals(compareS.getPlusDay())) {
                                    dayCheck = true;
                                }
                            }

                            if (dayCheck) {
                                // 시간 겹치는지 확인

                                // 시간 겹치면 숫자 갖고 있다가 곱하기
                            }
                        }
                    }
                }
            }
            /*
            {"MO 12:00 WE 14:30", "MO 12:00", "MO 15:00", "MO 18:00"},
                {"TU 09:00", "TU 10:00", "TU 15:00", "TU 18:00"},
                {"WE 09:00", "WE 12:00", "WE 15:00", "WE 18:00"},
                {"TH 09:30", "TH 11:30", "TH 15:00", "TH 18:00"},
                {"FR 15:00", "FR 15:00", "FR 15:00", "FR 15:00"}}
             */

            return answer;
        }

        public static class Schedule {
            private String day;         // 강의 요일
            private String time;        // 강의 시간
            private String plusDay;     // 추가 강의 요일 (없을 수 있음)
            private String plusTime;    // 추가 강의 시간 (없을 수 있음)
            private boolean isOverlap = false;  // 겹치기 여부

            public Schedule(String day, String time, String plusDay, String plusTime) {
                this.day = day;
                this.time = time;
                this.plusDay = plusDay;
                this.plusTime = plusTime;
            }

            public Schedule(String[] splitDaySchedule) {
                this.day = splitDaySchedule[0];
                this.time = splitDaySchedule[1];
                this.plusDay = splitDaySchedule[2];
                this.plusTime = splitDaySchedule[3];
            }

            public String getDay() {
                return this.day;
            }
            public String getTime() {
                return this.time;
            }
            public String getPlusDay() {
                return this.plusDay;
            }
            public String getPlusTime() {
                return this.plusTime;
            }
        }
    }
}
