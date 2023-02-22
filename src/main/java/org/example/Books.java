package org.example;

public class Books implements  Comparable<Books> {
    private int ibsn;
    private String bookName;

    public int getIbsn() {
        return ibsn;
    }

    public void setIbsn(int ibsn) {
        this.ibsn = ibsn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Books (int ibsn, String bookName) {
        this.ibsn = ibsn;
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Books{" +
                "ibsn=" + ibsn +
                ", bookName='" + bookName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Books o) {
        if (this.getIbsn() > o.getIbsn()){
            return 1;
        } else if (this.getIbsn() < o.getIbsn() ) {
            return -1;
        }
        return 0;
    }
}
