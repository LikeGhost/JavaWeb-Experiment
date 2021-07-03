package jmu.yoo.vo;


public class Member {

  private long mId;
  private String mName;
  private String mPhone;
  private String mSex;
  private long mAge;
  private String mHouseNumber;
  private String mWorkUnit;
  private String mCarNumber;
  private long mIsHousehold;
  private long cId;


  public long getMId() {
    return mId;
  }

  public void setMId(long mId) {
    this.mId = mId;
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
    this.mAge = mAge;
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


  public long getMIsHousehold() {
    return mIsHousehold;
  }

  public void setMIsHousehold(long mIsHousehold) {
    this.mIsHousehold = mIsHousehold;
  }


  public long getCId() {
    return cId;
  }

  public void setCId(long cId) {
    this.cId = cId;
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
