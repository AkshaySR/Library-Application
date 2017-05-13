package com.libapp.entity;

import javax.persistence.*;

/**
 * Created by akshayshivanne on 4/24/2017.
 */


@Entity
@Table(name="tbl_book")
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookId;


    @Column(name="title")
    private String title;


    private int pubid;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPubid() {
        return pubid;
    }

    public void setPubid(int pubid) {
        this.pubid = pubid;
    }


}
