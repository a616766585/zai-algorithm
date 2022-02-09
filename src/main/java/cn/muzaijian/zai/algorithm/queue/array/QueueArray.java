package cn.muzaijian.zai.algorithm.queue.array;

import java.util.Arrays;

public class QueueArray {
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
    private String[] arr;
    /**
     * 队列最大
     */
    private int maxSize;

    public QueueArray(int maxSize) {
        this.maxSize = maxSize;
        arr = new String[maxSize];
        this.start = -1;
        this.end = -1;
    }

    public boolean add(String node) {
        if (start >= arr.length - 1)
            start++;
        return true;
    }

    public boolean remove() {
        return true;
    }

    @Override
    public String toString() {
        return "QueueArray{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
