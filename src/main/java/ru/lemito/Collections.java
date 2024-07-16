package ru.lemito;

import java.util.*;

public class Collections {
    public static void Intersaction() {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        HashSet<Integer> A = new HashSet<>();
        for (int i = 0; i < n1; i++) {
            A.add(sc.nextInt());
        }
        int n2 = sc.nextInt();
        HashSet<Integer> B = new HashSet<>();
        for (int i = 0; i < n2; i++) {
            B.add(sc.nextInt());
        }

        for (int x : A) {
            if (B.contains(x)) {
                System.out.println(x + " ");
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        // обычный список
        System.out.println("ArrayList");
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 10; ++i) {
            arr.add(i, i);
        }

        for (Integer elem : arr) {
            System.out.print(elem + " ");
        }

        System.out.println(arr.get(4));
        // =================
        // LinkedList [связный список] (может быть и Queue)
        System.out.println("LinkedList");
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(0, 12);
        list.add(1, 2);
        list.add(1, 7);
        list.add(1, 712);
        System.out.println(list);
        list.addFirst(17);
        list.addLast(34);
        System.out.println(list);
        // ==================
        // HashSet (без сортировки)
        System.out.println("HashSet");
        HashSet<Integer> hs = new HashSet<>();
        hs.add(5);
        hs.add(4);
        hs.add(3);
        hs.add(1);
        System.out.println(hs);
        hs.add(5);
        System.out.println(hs);
        // ==================
        // TreeSet (с сортировкой)
        System.out.println("TreeSet");
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(901);
        ts.add(-78);
        ts.add(5);
        ts.add(1382);
        ts.add(34);
        ts.add(901);
        ts.add(-7);
        System.out.println(ts);
        // ==================
        // HashMap
        System.out.println("HashMap");
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Vova", 4);
        hm.put("Petya", 3);
        hm.put("Vanya", 5);
        System.out.println(hm);
        for (Map.Entry<String, Integer> elem : hm.entrySet()) {
            System.out.printf("%s:%s ", elem.getKey(), elem.getValue());
        }
        // ==================
        // TreeMap (хз в чем разница между HashMap)
        System.out.println("HashMap");
        TreeMap<String, Integer> tm = new TreeMap<>();
        hm.put("Vova", 4);
        hm.put("Petya", 3);
        hm.put("Vanya", 5);
        System.out.println(hm);
        for (Map.Entry<String, Integer> elem : tm.entrySet()) {
            System.out.printf("%s:%s ", elem.getKey(), elem.getValue());
        }
        // ==================
        // Stack
        System.out.println("Stack");
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st);
        // ==================
        // Queue (но тут Dequeue)
        /**
         * вот тут прикол - в Java нет единой реализации очереди как в C++, поэтому их
         * сделали 3(!!!) штуки: PriorityQueue(наследуется от Queue), LinkedList и
         * ArrayDeque (дек)
         **/
        System.out.println("Queue");
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(1);
        ad.add(2);
        ad.add(3);
        System.out.println(ad);
        ad.add(5);
        System.out.println(ad);
        System.out.println(ad.pop());
        // ==================

    }
}
