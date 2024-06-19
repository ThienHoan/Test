/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlynhansu;

import quanlynhansu.model.Student;
import quanlynhansu.model.Teacher;

/**
 *
 * @author hoan6
 */
public class QuanLyNhanSu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Student st=new Student("DE180618 ","Thien", "20", "Student") {
            @Override
            public void level() {
                
            }
            
        };
        Teacher tch= new Teacher("PRO", "Trang", "20", "Teacher") {
            @Override
            public void level() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
     };
        System.out.println(tch.toString());
       System.out.println(st.toString());
    
} 
}
