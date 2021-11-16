package com.xu.pojo;

import java.util.Date;
public class article {
    private int id;
    private String author;
    private String title;
    private String introduction;
    private String content;
    private Date create_time;
    private String themes;

    public article(int id, String author, String title, String introduction, String content, Date create_time,String themes) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.introduction = introduction;
        this.content = content;
        this.create_time = create_time;
        this.themes=themes;
    }

    public article() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getThemes() {
        return themes;
    }

    public void setThemes(String themes) {
        this.themes = themes;
    }

    @Override
    public String toString() {
        return "article{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", introduction='" + introduction + '\'' +
                ", content='" + content + '\'' +
                ", create_time=" + create_time +
                ", themes='" + themes + '\'' +
                '}';
    }
}
