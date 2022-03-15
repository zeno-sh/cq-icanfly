package com.zeno.cqicanfly.utils;

import java.util.*;

/**
 * @Author zeno
 * @Date 2022/3/15
 */
public class RamPager<T> {

    private List<T> list;
    private int pageSize;

    /**
     * @param list     原始数据
     * @param pageSize 每页条数
     */

    public RamPager(List<T> list, int pageSize) {
        this.list = list;
        this.pageSize = pageSize;
    }

    /**
     * 获取某页数据，从第1页开始
     *
     * @param pageNum 第几页
     * @return 分页数据
     */
    public List<T> page(int pageNum) {

        if (pageNum < 1) {
            pageNum = 1;
        }
        int from = (pageNum - 1) * pageSize;
        int to = Math.min(pageNum * pageSize, list.size());
        if (from > to) {
            from = to;
        }
        return list.subList(from, to);
    }

    /**
     * 获取总页数
     */
    public int getPageCount() {

        if (pageSize == 0) {

            return 0;
        }
        return list.size() % pageSize == 0 ? (list.size() / pageSize) : (list.size() / pageSize + 1);
    }

    /**
     * 元素迭代器
     */
    public Iterator<List<T>> iterator() {

        return new Itr();
    }

    private class Itr implements Iterator<List<T>> {

        int page = 1;

        Itr() {

        }

        public boolean hasNext() {

            return page <= getPageCount();
        }

        public List<T> next() {

            int i = page;
            if (i > getPageCount())
                return new ArrayList<>();

            page = i + 1;
            return RamPager.this.page(i);
        }
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println("原始数据是：" + list);

        int pageSize = 2;
        System.out.println("每页大小是：" + pageSize);

        RamPager<Integer> pager = new RamPager<>(list, pageSize);
        System.out.println("总页数是: " + pager.getPageCount());

        System.out.println("<- - - - - - - - - - - - - ->");

        // 无需感知页码情况下使用
//        Iterator<List<Integer>> iterator = pager.iterator();
//        while (iterator.hasNext()) {
//
//            List<Integer> next = iterator.next();
//            System.out.println("next: " + next);
//        }
//
//        System.out.println("<- - - - - - - - - - - - - ->");
        // 需要指定页码情况使用，页码从第一页开始，且小于等于总页数！
        for (int i = 1; i <= pager.getPageCount(); i++) {

            List<Integer> page = pager.page(i);
            System.out.println("第 " + i + " 页数据是:" + page);
        }
    }
}
