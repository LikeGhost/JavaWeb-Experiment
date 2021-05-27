package com.vo;

import java.util.Date;

public class Message {
    private Integer messageId;
    private String title;
    private String content;
    private String writer;
    private Date writerDate;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Date getWriterDate() {
        return writerDate;
    }

    public void setWriterDate(Date writerDate) {
        this.writerDate = writerDate;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageId=" + messageId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", writerDate=" + writerDate +
                '}';
    }
}
