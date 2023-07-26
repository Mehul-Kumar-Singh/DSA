
public class minimum_speed_to_arrive_on_time {
    public static boolean isPossible(int[] dist, int speed, double hour) {
        double ans = 0;
        for (int i = 0; i < dist.length-1; i++) {
            double d = dist[i] * 1.0 / speed;
                ans = ans + Math.ceil(d);
        }
        // Consider the last train ride without ceil
          ans = ans + dist[dist.length-1]*1.0/speed;
        return ans <= hour;
    }

    public static int minSpeedOnTime(int[] dist, double hour) {
        int i = 1;
        int j = (int) 1e7;
        int minSpeed = -1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (isPossible(dist, mid, hour)) {
                minSpeed = mid;
                j = mid - 1;
            } else
                i = mid + 1;
        }
        return minSpeed;
    }
    public static void main(String[] args) {
    	int[] dist = {1,3,2};
    	double hour = 2.7;
    	int ans = minSpeedOnTime(dist,hour);
    	System.out.println(ans);
    }
}