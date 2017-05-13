package com.libapp.entity;

import javax.persistence.*;

/**
 * Created by akshayshivanne on 4/24/2017.
 */


@Entity
@Table(name="tbl_author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int authorId;

    @Column(name="authorName")
    private String authorName;

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
