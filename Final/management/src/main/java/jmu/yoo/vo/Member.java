package jmu.yoo.vo;


public class Member {

  private int mId;
  private String mName;
  private String mPhone;
  private String mSex;
  private int mAge;
  private String mHouseNumber;
  private String mWorkUnit;
  private String mCarNumber;
  private boolean mIsHousehold;
  private int cId;


  public int getMId() {
    return mId;
  }

  public void setMId(int mId) {
    this.mId =  mId;
  }


  public String getMName() {
    return mName;
  }

  public void setMName(String mName) {
    this.mName = mName;
  }


  public String getMPhone() {
    return mPhone;
  }

  public void setMPhone(String mPhone) {
    this.mPhone = mPhone;
  }


  public String getMSex() {
    return mSex;
  }

  public void setMSex(String mSex) {
    this.mSex = mSex;
  }


  public long getMAge() {
    return mAge;
  }

  public void setMAge(long mAge) {
    this.mAge = (int) mAge;
  }


  public String getMHouseNumber() {
    return mHouseNumber;
  }

  public void setMHouseNumber(String mHouseNumber) {
    this.mHouseNumber = mHouseNumber;
  }


  public String getMWorkUnit() {
    return mWorkUnit;
  }

  public void setMWorkUnit(String mWorkUnit) {
    this.mWorkUnit = mWorkUnit;
  }


  public String getMCarNumber() {
    return mCarNumber;
  }

  public void setMCarNumber(String mCarNumber) {
    this.mCarNumber = mCarNumber;
  }


  public boolean getMIsHousehold() {
    return mIsHousehold;
  }

  public void setMIsHousehold(boolean mIsHousehold) {
    this.mIsHousehold =  mIsHousehold;
  }


  public long getCId() {
    return cId;
  }

  public void setCId(long cId) {
    this.cId = (int) cId;
  }

  @Override
  public String toString() {
    return "Members{" +
            "mId=" + mId +
            ", mName='" + mName + '\'' +
            ", mPhone='" + mPhone + '\'' +
            ", mSex='" + mSex + '\'' +
            ", mAge=" + mAge +
            ", mHouseNumber='" + mHouseNumber + '\'' +
            ", mWorkUnit='" + mWorkUnit + '\'' +
            ", mCarNumber='" + mCarNumber + '\'' +
            ", mIsHousehold=" + mIsHousehold +
            ", cId=" + cId +
            '}';
  }
}
