package androidserviceexample.android.javacodegeeks.com.studentgrades;

/**
 * Created by jeffecap on 21/12/17.
 */

public class Grades {

    private String mtoastText;
    private String mMath = "";
    private String mEnglish = "";
    private String mHistory = "";
    private String mBiology = "";

    //Constructor
    public Grades(String toastText, String math, String  english, String  history, String  biology) {
        mtoastText = toastText;
        mMath = math;
        mEnglish = english;
        mHistory = history;
        mBiology = biology;
    }

    public String getMtoastText() {
        return mtoastText;
    }

    public void setMtoastText(String mtoastText) {
        this.mtoastText = mtoastText;
    }

    public String getmMath() {
        return mMath;
    }

    public void setmMath(String mMath) {
        this.mMath = mMath;
    }

    public String getmEnglish() {
        return mEnglish;
    }

    public void setmEnglish(String mEnglish) {
        this.mEnglish = mEnglish;
    }

    public String getmHistory() {
        return mHistory;
    }

    public void setmHistory(String mHistory) {
        this.mHistory = mHistory;
    }

    public String getmBiology() {
        return mBiology;
    }

    public void setmBiology(String mBiology) {
        this.mBiology = mBiology;
    }
}
