
package com.devcraze.awesome_library.util;

import java.util.Arrays;
public class CustomArrayUtil {
    public static int mostFrequent(int arr[], int n) {
        Arrays.sort(arr);
        int max_count = 1, res = arr[0];
        int curr_count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1])
                curr_count++;
            else {
                if (curr_count > max_count) {
                    max_count = curr_count;
                    res = arr[i - 1];
                }
                curr_count = 1;
            }
        }
        if (curr_count > max_count) {
            max_count = curr_count;
            res = arr[n - 1];
        }
        return res;
    }
}