package org.example;

public class Squad implements Comparable<Squad> {
    private int squadNo;
    private String stack;

    @Override
    public String toString() {
        return "Squad{" +
                "squadNo=" + squadNo +
                ", stack='" + stack + '\'' +
                '}';
    }



    public int getSquadNo() {
        return squadNo;
    }

    public void setSquadNo(int squadNo) {
        this.squadNo = squadNo;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public Squad(int squadNo, String stack) {
        this.squadNo = squadNo;
        this.stack = stack;
    }

    @Override
    public int compareTo(Squad o1) {
      return Integer.compare(this.getSquadNo(), o1.getSquadNo());
        }
}
