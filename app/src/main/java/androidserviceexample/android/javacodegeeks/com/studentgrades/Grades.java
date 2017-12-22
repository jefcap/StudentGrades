package androidserviceexample.android.javacodegeeks.com.studentgrades;

/**
 * Created by jeffecap on 21/12/17.
 */

class Grades {

    private String mtoastText;
    private String mMath = "";
    private String mEnglish = "";
    private String mHistory = "";
    private String mBiology = "";

    //Constructor
    Grades(String math, String english, String history, String biology) {
        mMath = math;
        mEnglish = english;
        mHistory = history;
        mBiology = biology;
    }

    String getmMath() {
        return mMath;
    }

    void setmMath(String mMath) {
        this.mMath = mMath;
    }

    String getmEnglish() {
        return mEnglish;
    }

    void setmEnglish(String mEnglish) {
        this.mEnglish = mEnglish;
    }

    String getmHistory() {
        return mHistory;
    }

    void setmHistory(String mHistory) {
        this.mHistory = mHistory;
    }

    String getmBiology() {
        return mBiology;
    }

    void setmBiology(String mBiology) {
        this.mBiology = mBiology;
    }
}
