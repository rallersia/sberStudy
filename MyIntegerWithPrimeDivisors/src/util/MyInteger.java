package util;

import java.util.Objects;

public class MyInteger implements Comparable<MyInteger>{
    private Integer num;
    private int countOfPrimeDivisors;

    private void calculateCountOfPrimeDivisors() {
        countOfPrimeDivisors = 1;
        int currentNum = num;
        int i = 2;
        int minPossibleDivisor = 0;
        while (i < Math.ceil(Math.sqrt(currentNum))) {
            if (currentNum % i != 0) {
                i++;
            } else {
                currentNum /= i;
                if (minPossibleDivisor != i) {
                    countOfPrimeDivisors++;
                    minPossibleDivisor = i;
                }
            }
        }
    }
    public MyInteger(Integer num) {
        this.num = num;
        calculateCountOfPrimeDivisors();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
        calculateCountOfPrimeDivisors();
    }

    @Override
    public int compareTo(MyInteger o) {
        int compare = Integer.compare(this.countOfPrimeDivisors, o.countOfPrimeDivisors);
        return compare == 0 ? Integer.compare(this.num, o.num) : compare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyInteger myInteger = (MyInteger) o;
        return Objects.equals(num, myInteger.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }

    @Override
    public String toString() {
        return "MyInteger{" +
                "num=" + num +
                ", countOfPrimeDivisors=" + countOfPrimeDivisors +
                '}';
    }
}
