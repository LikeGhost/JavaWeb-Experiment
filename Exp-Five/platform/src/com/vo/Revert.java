package com.vo;

import java.util.Date;

public class Revert {
    private Integer revertId;
    private Integer messageId;
    private String content;
    private String writer;
    private Date writeDate;

    public Integer getRevertId() {
        return revertId;
    }

    public void setRevertId(Integer revertId) {
        this.revertId = revertId;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    @Override
    public String toString() {
        return "Revert{" +
                "revertId=" + revertId +
                ", messageId=" + messageId +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", writerDate='" + writeDate + '\'' +
                '}';
    }
}
