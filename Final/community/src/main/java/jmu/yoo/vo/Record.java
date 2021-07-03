package jmu.yoo.vo;


public class Record {

  private long rId;
  private long mId;
  private long cId;
  private long rIsOutCity;
  private long rIsFromForei;
  private long rIsHosehold;
  private java.sql.Timestamp rNowTime;


  public long getRId() {
    return rId;
  }

  public void setRId(long rId) {
    this.rId = rId;
  }


  public long getMId() {
    return mId;
  }

  public void setMId(long mId) {
    this.mId = mId;
  }


  public long getCId() {
    return cId;
  }

  public void setCId(long cId) {
    this.cId = cId;
  }


  public long getRIsOutCity() {
    return rIsOutCity;
  }

  public void setRIsOutCity(long rIsOutCity) {
    this.rIsOutCity = rIsOutCity;
  }


  public long getRIsFromForei() {
    return rIsFromForei;
  }

  public void setRIsFromForei(long rIsFromForei) {
    this.rIsFromForei = rIsFromForei;
  }


  public long getRIsHosehold() {
    return rIsHosehold;
  }

  public void setRIsHosehold(long rIsHosehold) {
    this.rIsHosehold = rIsHosehold;
  }


  public java.sql.Timestamp getRNowTime() {
    return rNowTime;
  }

  public void setRNowTime(java.sql.Timestamp rNowTime) {
    this.rNowTime = rNowTime;
  }

  @Override
  public String toString() {
    return "Record{" +
            "rId=" + rId +
            ", mId=" + mId +
            ", cId=" + cId +
            ", rIsOutCity=" + rIsOutCity +
            ", rIsFromForei=" + rIsFromForei +
            ", rIsHosehold=" + rIsHosehold +
            ", rNowTime=" + rNowTime +
            '}';
  }
}
