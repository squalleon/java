package com.spiri.my;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyComparable {
    public static void main(String[] args) {
        List<Board2> list = new ArrayList<Board2>();
        list.add(new Board2(1, "Hong Gil Dong", "2016-01-02"));
        list.add(new Board2(2, "Anyone", "2017-03-05"));
        list.add(new Board2(3, "Kim Young Hee", "2015-12-15"));
        list.add(new Board2(4, "Kim Chul Soo", "2016-10-05"));

        /**
         * Sort by name : Comparable
         * Board2{num=2, name='Anyone', date='2017-03-05'}
         * Board2{num=1, name='Hong Gil Dong', date='2016-01-02'}
         * Board2{num=4, name='Kim Chul Soo', date='2016-10-05'}
         * Board2{num=3, name='Kim Young Hee', date='2015-12-15'}
         */
        Collections.sort(list);

        System.out.println("Sort by name : Comparable");
        for (Board2 board2 : list) {
            System.out.println(board2);
        }
    }
}

class Board2 implements Comparable<Board2> {
    private int num;
    private String name = "";
    private String date = "";

    public Board2(int num, String name, String date) {
        this.num = num;
        this.name = name;
        this.date = date;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Board2{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    @Override
    public int compareTo(Board2 board2) {
        // DESC : * -1
        return this.name.compareTo(board2.name);
    }

}

