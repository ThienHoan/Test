/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhansu.model;

/**
 *
 * @author hoan6
 */
public abstract class Engineer extends Person{
    private String about;

    public Engineer(String about, String name, String age, String job) {
        super(name, age, job);
        this.about = about;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public String toString() {
        return "Engineer{" + "about=" + about + '}';
    }
    
    
}
