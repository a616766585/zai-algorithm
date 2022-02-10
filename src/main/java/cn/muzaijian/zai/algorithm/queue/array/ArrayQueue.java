package cn.muzaijian.zai.algorithm.queue.array;

import java.util.Arrays;

public class ArrayQueue {
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

    public ArrayQueue(int maxSize) {
        arr = new String[maxSize];
        this.start = -1;
        this.end = -1;
    }

    public boolean add(String node) {
        if (isFull()) {
            throw new RuntimeException("Queue is full!");
        }
        if (start == -1) {
            start++;
        }
        arr[++end] = node;
        return true;
    }

    public String remove() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        }
        String node = arr[start];
        arr[start++] = null;
        return node;
    }

    @Override
    public String toString() {
        return "QueueArray{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public boolean isEmpty() {
        return start == end;
    }

    public boolean isFull() {
        return end >= arr.length - 1;
    }
}
