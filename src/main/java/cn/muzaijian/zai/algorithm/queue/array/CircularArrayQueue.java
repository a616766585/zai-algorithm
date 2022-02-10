package cn.muzaijian.zai.algorithm.queue.array;

import java.util.Arrays;

public class CircularArrayQueue {

    /**
     * 指向队列开头
     */
    private int start;
    /**
     * 指向队列结尾
     */
    private int end;
    /**
     * 队列数组
     */
    private final String[] arr;

    /**
     * 队列元素个数
     */
    private int count;

    private int maxSize;

    public CircularArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new String[maxSize];
        this.start = -1;
        this.end = -1;
    }

    public boolean add(String node) {
        if (isFull()) {
            return false;
        }
        if (start == -1) {
            start++;
        }
        end = (end + 1) % arr.length;
        arr[end] = node;
        count++;
        return true;
    }

    public String remove() {
        if (isEmpty()) {
            return null;
        }
        String node = arr[start];
        arr[start++] = null;
        count--;
        return node;
    }

    @Override
    public String toString() {
        return "QueueArray{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public boolean isEmpty() {
        return (end + 1) % arr.length == start && count == 0;
    }

    public boolean isFull() {
        return (end + 1) % arr.length == start && count == maxSize;
    }
}
