package com.spiri.my;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyComparator {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<Board>();
        list.add(new Board(1, "Hong Gil Dong", "2016-01-02"));
        list.add(new Board(2, "Anyone", "2017-03-05"));
        list.add(new Board(3, "Kim Young Hee", "2015-12-15"));
        list.add(new Board(4, "Kim Chul Soo", "2016-10-05"));

        /**
         * Sort by date : Comparator
         * Board{num=3, name='Kim Young Hee', date='2015-12-15'}
         * Board{num=1, name='Hong Gil Dong', date='2016-01-02'}
         * Board{num=4, name='Kim Chul Soo', date='2016-10-05'}
         * Board{num=2, name='Anyone', date='2017-03-05'}
         */
        Collections.sort(list, new Comparator<Board>() {
            @Override
            public int compare(Board o1, Board o2) {
                // DESC : * -1
                return o1.getDate().compareTo(o2.getDate())*-1;
            }
        });

        System.out.println("Sort by date : Comparator");
        for (Board board : list) {
            System.out.println(board);
        }
    }
}

class Board {
    private int num;
    private String name = "";
    private String date = "";

    public Board(int num, String name, String date) {
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
        return "Board{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
