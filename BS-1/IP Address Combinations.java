
// Given a string of digits ip, generate all possible valid IP address combinations and return them in sorted order. IP addresses must follow the format A.B.C.D, where A, B, C, and D are integers between 0 and 255. Zero-prefixed numbers, such as 01 and 065, are not allowed, except for 0 itself.

import java.util.*;

class Solution {
    public String[] solve(String ip) {
        String[] result = new String[0];
        if (ip.length() < 7 || ip.length() > 15) {
            return result;
        }
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            nums[i] = ip.charAt(i) - '0';
        }
        if (nums[0] == 0) {
            return result;
        }
        List<String> list = new ArrayList<>();
        dfs(list, nums, 0, 0, 0);
        result = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        Arrays.sort(result);
        return result;
    }

    private void dfs(List<String> list, int[] nums, int i, int j, int k) {
        if (i == 4) {
            if (j == 3 && k == 3) {
                list.add(nums[0] + "." + nums[1] + "." + nums[2] + "." + nums[3]);
            }
            return;
        }
        if (j == 3) {
            if (k == 3) {
                return;
            }
            if (nums[i] > 255) {
                return;
            }
            dfs(list, nums, i + 1, 0, k + 1);
            return;
        }
        if (k == 3) {
            if (nums[i] > 255) {
                return;
            }
            dfs(list, nums, i + 1, j + 1, 0);
            return;
        }
        if (nums[i] > 255) {
            return;
        }
        dfs(list, nums, i + 1, j + 1, k + 1);
        if (j == 0) {
            dfs(list, nums, i + 1, j, k);
        }
    }
}