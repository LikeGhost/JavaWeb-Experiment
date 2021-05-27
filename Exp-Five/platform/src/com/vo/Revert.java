package com.vo;

public class Revert {
    private Integer revertId;
    private Integer messageId;
    private String content;
    private String writer;
    private String writerDate;

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

    public String getWriterDate() {
        return writerDate;
    }

    public void setWriterDate(String writerDate) {
        this.writerDate = writerDate;
    }

    @Override
    public String toString() {
        return "Revert{" +
                "revertId=" + revertId +
                ", messageId=" + messageId +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", writerDate='" + writerDate + '\'' +
                '}';
    }
}
