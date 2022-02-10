package cn.muzaijian.zai.algorithm.queue.array;

public class Main {
    public static void main(String[] args) {

//        System.out.println("--------------------- 一次性数组队列 ---------------------");
//
//        ArrayQueue arrayQueue = new ArrayQueue(5);
//
//        arrayQueue.add("张三");
//        System.out.println(arrayQueue);
//        arrayQueue.add("李四");
//        System.out.println(arrayQueue);
//        arrayQueue.add("王五");
//        System.out.println(arrayQueue.remove());
//        System.out.println(arrayQueue.remove());
//        System.out.println(arrayQueue);
//        arrayQueue.add("赵六");
//        System.out.println(arrayQueue);
//        arrayQueue.add("田七");
//        System.out.println(arrayQueue);
//        arrayQueue.add("王八");
//        System.out.println(arrayQueue);
//
//        System.out.println("--------------------- 一次性数组队列 ---------------------");

        System.out.println("--------------------- 循环数组队列 ---------------------");

        CircularArrayQueue circularArrayQueue = new CircularArrayQueue(5);

        circularArrayQueue.add("张三");
        System.out.println(circularArrayQueue);
        circularArrayQueue.add("李四");
        System.out.println(circularArrayQueue);
        circularArrayQueue.add("王五");
        System.out.println(circularArrayQueue);
        circularArrayQueue.add("赵六");
        System.out.println(circularArrayQueue);
        circularArrayQueue.add("田七");
        System.out.println(circularArrayQueue);
        System.out.println(circularArrayQueue.remove());
        circularArrayQueue.add("王八");
        System.out.println(circularArrayQueue);

        System.out.println("--------------------- 循环数组队列 ---------------------");
    }


}
