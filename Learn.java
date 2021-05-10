package OOP;


import java.util.*;

/**
 * @author wuguanqun
 * @date 2021/5/10 10:45 上午
 */
public class Learn {
    /***
     * Arrays.sort 函数只支持 封装类型 如Integer 而不支持int
     */
    public static void sortDemo() {
        System.out.println("\n排序写法");
        Integer[] nums = new Integer[]{1, 2, 3, 1};
        System.out.println("排序前：" + Arrays.toString(nums));
        Arrays.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println("排序后：" + Arrays.toString(nums) + "\n");
    }

    /***
     * java 的堆由优先队列PriorityQueue实现, 可以自定义比较器
     */
    public static void heapqDemo() {
        System.out.println("\n堆写法");
        PriorityQueue<Integer> heapq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        // 添加元素
        System.out.println("添加1，2");
        heapq.add(1);
        heapq.add(2);
        System.out.println("查看堆：" + heapq.toString());

        // 查看堆顶元素
        int value = heapq.peek();
        System.out.println("堆顶元素：" + value);

        // 删除堆顶元素
        int removedValue = heapq.remove();
        System.out.println("要删除的元素为：" + removedValue);
        System.out.println("删除堆顶元素后：" + heapq.toString() + "\n");
    }

    /***
     * java 栈有两种实现方式，Stack和Deque
     */
    public static void stackDemo() {
        System.out.println("\n栈写法");
        Deque<Integer> stack = new LinkedList<>();
        // 入栈
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("压入1，2, 3");
        System.out.println("目前栈为：" + stack.toString());
        // 栈顶元素
        int value = stack.peek();
        System.out.println("栈顶元素为：" + value);
        // 出栈
        stack.pop();
        System.out.println("此时栈为：" + stack.toString());
    }

    public static void queueDemo() {
        System.out.println("\n队列写法");
        Deque<Integer> queue = new LinkedList<>();
        // 入栈
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("1，2, 3进入队列");
        System.out.println("目前队列为：" + queue.toString());
        // 镦首元素
        int value = queue.peek();
        System.out.println("队首元素为：" + value);
        // 出队列
        queue.poll();
        System.out.println("此时队列为：" + queue.toString());
    }

    public static void transDemo() {
        // 数组转列表
        String[] strArray = {"3", "2"};
        ArrayList< String> arrayList = new ArrayList<String>(strArray.length);
        Collections.addAll(arrayList, strArray);
        arrayList.add("1");
        System.out.println(arrayList);

    }

    public static void main(String[] args) {
        sortDemo();
        heapqDemo();
        stackDemo();
        queueDemo();
        transDemo();
    }

}
