package jmu.yoo.vo;


public class Record {

  private int rId;
  private int mId;
  private int cId;
  private boolean rIsOutCity;
  private boolean rIsFromForei;
  private boolean rIsHosehold;
  private String rNowTime;


  public long getRId() {
    return rId;
  }

  public void setRId(long rId) {
    this.rId = (int) rId;
  }


  public long getMId() {
    return mId;
  }

  public void setMId(long mId) {
    this.mId = (int) mId;
  }


  public long getCId() {
    return cId;
  }

  public void setCId(long cId) {
    this.cId = (int) cId;
  }


  public boolean getRIsOutCity() {
    return rIsOutCity;
  }

  public void setRIsOutCity(boolean rIsOutCity) {
    this.rIsOutCity = rIsOutCity;
  }


  public boolean getRIsFromForei() {
    return rIsFromForei;
  }

  public void setRIsFromForei(boolean rIsFromForei) {
    this.rIsFromForei = rIsFromForei;
  }


  public boolean getRIsHosehold() {
    return rIsHosehold;
  }

  public void setRIsHosehold(boolean rIsHosehold) {
    this.rIsHosehold =  rIsHosehold;
  }


  public String getRNowTime() {
    return rNowTime;
  }

  public void setRNowTime(String rNowTime) {
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
