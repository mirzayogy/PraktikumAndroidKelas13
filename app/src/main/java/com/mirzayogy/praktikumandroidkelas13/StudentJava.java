package com.mirzayogy.praktikumandroidkelas13;

import android.os.Parcel;
import android.os.Parcelable;

public class StudentJava implements Parcelable {
    private String npm;
    private String nama;
    private double ipk;
    private String phoneNumber;

    public StudentJava(String npm, String nama, double ipk, String phoneNumber) {
        this.npm = npm;
        this.nama = nama;
        this.ipk = ipk;
        this.phoneNumber = phoneNumber;
    }

    protected StudentJava(Parcel in) {
        npm = in.readString();
        nama = in.readString();
        ipk = in.readDouble();
        phoneNumber = in.readString();
    }

    public static final Creator<StudentJava> CREATOR = new Creator<StudentJava>() {
        @Override
        public StudentJava createFromParcel(Parcel in) {
            return new StudentJava(in);
        }

        @Override
        public StudentJava[] newArray(int size) {
            return new StudentJava[size];
        }
    };

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(npm);
        parcel.writeString(nama);
        parcel.writeDouble(ipk);
        parcel.writeString(phoneNumber);
    }
}
