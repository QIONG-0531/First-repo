import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class Testz29 {
    //最小的k个数（建大小为k的大堆）
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (k > input.length || k <= 0 || input == null || input.length == 0) {
            return list;
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < input.length; i++) {
            if (k != 0) {
                heap.offer(input[i]);
                k--;
            } else {
                if (input[i] < heap.peek()) {
                    heap.poll();
                    heap.offer(input[i]);
                }
            }
        }
        Stack<Integer> stack = new Stack<>();
        while (heap.size() != 0) {
            stack.push(heap.poll());
        }
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }
//建小堆，然后将最小元素放进list中
    public ArrayList<Integer> GetLeastNumbers_Solution2(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (k > input.length || k <= 0 || input == null || input.length == 0) {
            return list;
        }
        buildBigHeap(input);
        int len = input.length;
        while (k != 0) {
            list.add(input[0]);
            int tmp = input[0];
            input[0] = input[len - 1];
            input[len - 1] = tmp;//先把最小的放到最后,然后调整
            adjustDown(input, 0, len - 1);
            len--;
            k--;
        }
        return list;
    }

    public void buildBigHeap(int[] array) {
        for (int i = (array.length - 1 - 1) / 2; i >= 0; i--) {
            adjustDown(array, i, array.length);
        }
    }

    public void adjustDown(int[] array, int parent, int len) {
        int child = parent * 2 + 1;
        if ((child + 1) < len && array[child + 1] < array[child]) {
            child++;
        }
        while (child < len) {
            if (array[child] < array[parent]) {
                int tmp = array[parent];
                array[parent] = array[child];
                array[child] = tmp;
                parent = child;
                child = parent * 2 + 1;
            } else {
                break;
            }
        }
    }
}
