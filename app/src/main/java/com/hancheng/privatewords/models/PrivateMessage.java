package com.hancheng.privatewords.models;

import org.joda.time.DateTime;

import java.io.Serializable;

/**
 * Created by chan on 5/17/15.
 */
public class PrivateMessage implements Serializable {
    private static final long serialVersionUID = 0L;

    private int mId;
    private DateTime mSentTime;
    private DateTime mReceivedTime;
    private String mMessageContent;
    private int mLikedNumber;
    private int mUnLikedNumber;
    private User mUser;
    private int mPostedNumber;
    private int mCommentsNumber;

    public void setId(int id) {
        this.mId = id;
    }

    public int getId() {
        return mId;
    }

    public DateTime getSentTime() {
        return mSentTime;
    }

    public DateTime getReceivedTime() {
        return mReceivedTime;
    }

    public String getMessageContent() {
        return mMessageContent;
    }

    public void setSentTime(DateTime sentTime) {
        this.mSentTime = sentTime;
    }

    public void setReceivedTime(DateTime receivedTime) {
        this.mReceivedTime = receivedTime;
    }

    public void setMessageContent(String messageContent) {
        this.mMessageContent = messageContent;
    }

    public int getLikedNumber() {
        return mLikedNumber;
    }

    public int getUnLikedNumber() {
        return mUnLikedNumber;
    }

    public void setLikedNumber(int likedNumber) {
        this.mLikedNumber = likedNumber;
    }

    public void setUnLikedNumber(int unLikedNumber) {
        this.mUnLikedNumber = unLikedNumber;
    }

    public int getAbsLikedNumber() {
        return mLikedNumber - mUnLikedNumber;
    }

    public void setUser(User user) {
        mUser = user;
    }

    public User getUser() {
        return mUser;
    }

    public int getPostedNumber() {
        return mPostedNumber;
    }

    public void setPostedNumber(int postedNumber) {
        this.mPostedNumber = postedNumber;
    }


    public int getCommentsNumber() {
        return mCommentsNumber;
    }

    public void setCommentsNumber(int commentsNumber) {
        this.mCommentsNumber = commentsNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrivateMessage that = (PrivateMessage) o;

        if (mId != that.mId) return false;
        if (mLikedNumber != that.mLikedNumber) return false;
        if (mUnLikedNumber != that.mUnLikedNumber) return false;
        if (mPostedNumber != that.mPostedNumber) return false;
        if (mCommentsNumber != that.mCommentsNumber) return false;
        if (mSentTime != null ? !mSentTime.equals(that.mSentTime) : that.mSentTime != null)
            return false;
        if (mReceivedTime != null ? !mReceivedTime.equals(that.mReceivedTime) : that.mReceivedTime != null)
            return false;
        if (mMessageContent != null ? !mMessageContent.equals(that.mMessageContent) : that.mMessageContent != null)
            return false;
        return !(mUser != null ? !mUser.equals(that.mUser) : that.mUser != null);

    }

    @Override
    public int hashCode() {
        int result = mId;
        result = 31 * result + (mSentTime != null ? mSentTime.hashCode() : 0);
        result = 31 * result + (mReceivedTime != null ? mReceivedTime.hashCode() : 0);
        result = 31 * result + (mMessageContent != null ? mMessageContent.hashCode() : 0);
        result = 31 * result + mLikedNumber;
        result = 31 * result + mUnLikedNumber;
        result = 31 * result + (mUser != null ? mUser.hashCode() : 0);
        result = 31 * result + mPostedNumber;
        result = 31 * result + mCommentsNumber;
        return result;
    }
}
