import java.util.Arrays;
class Solution {
    public long solution(int[] array, int height) {
        long result = Arrays.stream(array)
                .filter(value -> value > height)
                .count();
        return result;
    }
}