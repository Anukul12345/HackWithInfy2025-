import java.util.*;

public class maxEvents {
    public static int maxAttend(int [][]events){
        Arrays.sort(events, Comparator.comparingInt(a -> a[0]));
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        int day = 1, i = 0, n = events.length, res = 0;

         int lastDay = 0;
        for (int[] event : events) {
            lastDay = Math.max(lastDay, event[1]);
        }

        while (day <= lastDay) {
           
            while (i < n && events[i][0] == day) {
                minHeap.offer(events[i][1]);
                i++;
            }

            while (!minHeap.isEmpty() && minHeap.peek() < day) {
                minHeap.poll();
            }

            if (!minHeap.isEmpty()) {
                minHeap.poll();
                res++;
            }

            day++;
        }

        return res;
    
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int [][]events=new int[n][2];
        for(int i=0; i<n; i++){
            events[i][0]=sc.nextInt();
            events[i][1]=sc.nextInt();
        }
        System.out.println(maxAttend(events));
        

    }
}
