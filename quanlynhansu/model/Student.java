/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhansu.model;

/**
 *
 * @author hoan6
 */
public abstract class Student extends Person{
    private String mssv;

    public Student(String mssv, String name, String age, String job) {
        super(name, age, job);
        this.mssv = mssv;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    @Override
    public String toString() {
        return "Student:" + " mssv = " + mssv + " Name: " + name+ " Age: "+age;
    }
    
    @Override
    public abstract void level();
}
