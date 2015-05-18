package com.hancheng.privatewords.models;

/**
 * Created by chan on 5/17/15.
 */
public class User {

    private int mId;
    private String mUserName;
    private int mPostedNumber;
    private PrivateMessage mPrivateMessage;

    public void setId(int id) {
        this.mId = id;
    }

    public int getId() {
        return mId;
    }

    public String getUserName() {
        return mUserName;
    }

    public int getPostedNumber() {
        return mPostedNumber;
    }

    public PrivateMessage getPrivateMessage() {
        return mPrivateMessage;
    }

    public void setUserName(String userName) {
        this.mUserName = userName;
    }

    public void setPostedNumber(int postedNumber) {
        this.mPostedNumber = postedNumber;
    }

    public void setPrivateMessage(PrivateMessage privateMessage) {
        this.mPrivateMessage = privateMessage;
    }
}
