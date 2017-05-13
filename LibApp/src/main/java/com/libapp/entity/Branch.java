package com.libapp.entity;

import javax.persistence.*;

/**
 * Created by akshayshivanne on 4/24/2017.
 */


@Entity
@Table(name="tbl_library_branch")
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int branchId;

    @Column(name="branchName")
    private String branchName;

    @Column(name="branchAddress")
    private String branchAddress;


    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }
}
