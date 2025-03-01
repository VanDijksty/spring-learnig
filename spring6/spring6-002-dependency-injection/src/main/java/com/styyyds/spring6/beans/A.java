package com.styyyds.spring6.beans;

import java.net.URI;
import java.net.URL;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class A {
    private byte b;
    private short s;
    private int i;
    private long l;
    private float f;
    private double d;
    private boolean flag;
    private char c;

    private Byte b1;
    private Short s1;
    private Integer i1;
    private Long l1;
    private Float f1;
    private Double d1;
    private Boolean flag1;
    private Character c1;

    private String s2;

    private Date date;

    private Season season;

    private URI uri;

    private URL url;

    private LocalDate localDate;

    private Locale locale;

    private Class clazz;

    @Override
    public String toString() {
        return "A{" +
                "b=" + b +
                ", s=" + s +
                ", i=" + i +
                ", l=" + l +
                ", f=" + f +
                ", d=" + d +
                ", flag=" + flag +
                ", c=" + c +
                ", b1=" + b1 +
                ", s1=" + s1 +
                ", i1=" + i1 +
                ", l1=" + l1 +
                ", f1=" + f1 +
                ", d1=" + d1 +
                ", flag1=" + flag1 +
                ", c1=" + c1 +
                ", s2='" + s2 + '\'' +
                ", date=" + date +
                ", season=" + season +
                ", uri=" + uri +
                ", url=" + url +
                ", localDate=" + localDate +
                ", locale=" + locale +
                ", clazz=" + clazz +
                '}';
    }

    public byte getB() {
        return b;
    }

    public void setB(byte b) {
        this.b = b;
    }

    public short getS() {
        return s;
    }

    public void setS(short s) {
        this.s = s;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public long getL() {
        return l;
    }

    public void setL(long l) {
        this.l = l;
    }

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public Byte getB1() {
        return b1;
    }

    public void setB1(Byte b1) {
        this.b1 = b1;
    }

    public Short getS1() {
        return s1;
    }

    public void setS1(Short s1) {
        this.s1 = s1;
    }

    public Integer getI1() {
        return i1;
    }

    public void setI1(Integer i1) {
        this.i1 = i1;
    }

    public Long getL1() {
        return l1;
    }

    public void setL1(Long l1) {
        this.l1 = l1;
    }

    public Float getF1() {
        return f1;
    }

    public void setF1(Float f1) {
        this.f1 = f1;
    }

    public Double getD1() {
        return d1;
    }

    public void setD1(Double d1) {
        this.d1 = d1;
    }

    public Boolean getFlag1() {
        return flag1;
    }

    public void setFlag1(Boolean flag1) {
        this.flag1 = flag1;
    }

    public Character getC1() {
        return c1;
    }

    public void setC1(Character c1) {
        this.c1 = c1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public URI getUri() {
        return uri;
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    enum Season{
        SPRING,SUMMER,AUTUMN,WINTER
    }


}
