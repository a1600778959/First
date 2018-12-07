package com.example.lenovo.first;

class Question {
    private int mTextresID;
    private boolean mAnswerTURE;
    public Question(int mTextresID, boolean mAnswerTURE){
        this.mTextresID=mTextresID;
        this.mAnswerTURE=mAnswerTURE;
    }

    public int getTextresID() {
        return mTextresID;
    }

    public void setTextresID(int textresID) {
        mTextresID = textresID;
    }

    public boolean isAnswerTURE() {
        return mAnswerTURE;
    }

    public void setAnswerTURE(boolean answerTURE) {
        mAnswerTURE = answerTURE;
    }
}
