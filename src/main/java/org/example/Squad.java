package org.example;

public class Squad {
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
}
