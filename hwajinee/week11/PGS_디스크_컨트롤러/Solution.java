package week11.PGS_디스크_컨트롤러;

import java.util.*;

/*
    Task {
       int no - 작업 번호
       int callTime - 작업 요청시각
       int duration - 작업 소요시간
    }

    우선순위 기준
     1. 소요시간이 짧은 것
     2. 요청 시각이 빠른 것
     3. 작업 번호가 작은 것


    작업을 하는 도중에는 다른 작업으로 변경할 수 없음.
    즉, 작업을 마친 시점에, 우선순위를 고려해 다음 작업을 선택한다.

    참고로, 작업을 마친 시점에 새로운 작업이 들어오는 경우,
    새로 들어온 작업도 우선순위 고려 대상에 포함한다.

 */
public class Solution {
    public int solution(int[][] jobs) {

        Arrays.sort(jobs, (a, b) -> a[0] - b[0]); // callTime 기준으로 정렬

        Queue<Task> pq = new PriorityQueue<>();

        int time = 0;
        int index = 0;

        int[] returnArr = new int[jobs.length];

        int count = 0;
        while(count < jobs.length){
            while(index < jobs.length && jobs[index][0] <= time) {
                pq.add(new Task(index, jobs[index][0], jobs[index][1]));
                index++;
            }

            if(pq.isEmpty()) {
                time = jobs[index][0];
                continue;
            }

            Task cur = pq.remove();
            time += cur.duration;
            returnArr[cur.no] = time - cur.callTime;
            count++;
        }

        int sum = 0;
        for(int t : returnArr) {
            sum += t;
        }

        return sum / jobs.length;
    }

    class Task implements Comparable<Task> {
        int no;
        int callTime;
        int duration;
        Task(int no, int callTime, int duration) {
            this.no = no;
            this.callTime = callTime;
            this.duration = duration;
        }
        @Override
        public int compareTo(Task o) {
            if(this.duration != o.duration){
                return this.duration - o.duration;
            } else if(this.callTime != o.callTime) {
                return this.callTime - o.callTime;
            } else {
                return this.no - o.no;
            }
        }
    }

    public static void main(String[] args) {
        int[][] jobs = {{0, 3}, {1, 9}, {3, 5}};
        Solution solution = new Solution();
        System.out.println(solution.solution(jobs));
    }
}
