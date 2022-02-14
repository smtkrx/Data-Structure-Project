import java.util.*;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Objects;

class SpecialCustomer implements Comparable<SpecialCustomer> {
    private String name;
    private double point;

    public SpecialCustomer(String name, int point) {
        this.name = name;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }
    public boolean equals(Object pnts) {
        if (this == pnts) return true;
        if (pnts == null || getClass() != pnts.getClass()) return false;
        SpecialCustomer cstmr = (SpecialCustomer) pnts;
        return Double.compare(cstmr.point, point) == 0 && Objects.equals(name, cstmr.name);
    }
    public int hashCode() {
        return Objects.hash(name, point);
    }
    public String toString() {
        return "Name: "+ "Points: ";
    }
    public int compareTo(SpecialCustomer cstmr) {
        if(this.getPoint() > cstmr.getPoint()) {
            return 1;
        } else if (this.getPoint() < cstmr.getPoint()) {
            return -1;
        } else {
            return 0;
        }
    }
}