package util;

import java.util.HashSet;

public class MyInteger implements Comparable<MyInteger>{
    private Integer num;
    private int countOfDifferentNums;

    private void CalculateCountOfDifferentNums() {
        HashSet<Integer> numsInNum = new HashSet<>();
        int tempNum = num;
        while (tempNum > 0) {
            numsInNum.add(tempNum % 10);
            tempNum /= 10;
        }
        countOfDifferentNums = numsInNum.size();
    }

    public MyInteger(Integer num) {
        this.num = num;
        CalculateCountOfDifferentNums();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
        CalculateCountOfDifferentNums();
    }

    @Override
    public int compareTo(MyInteger o) {
        int compare = Integer.compare(this.countOfDifferentNums, o.countOfDifferentNums);
        return compare == 0 ? Integer.compare(this.num, o.num) : compare;
    }

    @Override
    public String toString() {
        return "MyInteger{" +
                "num=" + num +
                ", countOfDifferentNums=" + countOfDifferentNums +
                '}';
    }
}
