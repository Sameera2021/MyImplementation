package com.example.myimplementation;

public class Data {
    private int id ;
    private String OTPkey ;
    private String filePath ;

    public Data(int id, String OTPkey, String filePath) {
        this.id = id;
        this.OTPkey = OTPkey;
        this.filePath = filePath;
    }

    public Data(String OTPkey, String filePath) {
        this.OTPkey = OTPkey;
        this.filePath = filePath;
    }

    public int getId() {
        return id;
    }

    public String getOTPkey() {
        return OTPkey;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOTPkey(String OTPkey) {
        this.OTPkey = OTPkey;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
