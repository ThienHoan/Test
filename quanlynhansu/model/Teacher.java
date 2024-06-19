/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhansu.model;

/**
 *
 * @author hoan6
 */
public abstract class Teacher extends Person{
    private String major;

    public Teacher(String major, String name, String age, String job) {
        super(name, age, job);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Teacher: " + " Name: " + name + " Major: "+major+ " Age: "+age;
    }

    @Override
    public abstract void level();
    
    
}
