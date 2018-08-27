package com.example.bookappointment.domain;

public class Book {
    private long bookId; // 图书Id
    private String bookName; // 图书名称
    private int number; // 馆藏数量
    private String introd; // 简介


    public long getBookId() {
        return bookId;
    }
    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getIntrod() {
        return introd;
    }
    public void setIntrod(String introd) {
        this.introd = introd;
    }

    @Override
    public String toString() {
        return "Book [bookId=" + bookId + ", bookName=" + bookName + ", number=" + number + ", introd=" + introd + "]";
    }
}
