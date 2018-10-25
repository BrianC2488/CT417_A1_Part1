/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brian.coughlan.ct417_a1_part1;

/**
 *
 * @author Brian
 */
import java.util.ArrayList;
import org.joda.time.LocalDate;

public class course_program 
{
    private String CourseName;
    private ArrayList moduleList;
    private LocalDate startDate; 
    private LocalDate endDate;
    
       public course_program(String courseName, ArrayList moduleList, LocalDate start, LocalDate end){
        this.CourseName = courseName;
        this.moduleList = moduleList;
        this.startDate = start;
        this.endDate = end;
    }
    
   
       
   public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }
    
    public ArrayList getModuleList() {
        return moduleList;
    }

    public void setModuleList(ArrayList moduleList) {
        this.moduleList = moduleList;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    } 
   public void printStudents(){
        ArrayList<student> CourseStudents = new ArrayList<student>();
        
        ArrayList<module> modules = new ArrayList<module>();
        modules = this.getModuleList();
        for (int i=0 ; i<modules.size() ; i++){
            module m = modules.get(i);
            ArrayList<student> ModuleStudents = new ArrayList<student>();
            ModuleStudents = m.getStudentList();
            for (int j=0 ; j<ModuleStudents.size();j++){
                student s = ModuleStudents.get(j);
                if (s.getCourse().equals(this.getCourseName()) && !(CourseStudents.contains(s))){
                    CourseStudents.add(s);
                    System.out.println(s.getName() + "\t Course: " + s.getCourse());
                    System.out.print("\t Modules: ");
                    for(int k=0; k<modules.size();k++){
                        System.out.print(modules.get(k).getName() + " -- ");
                    }
                    System.out.println();
                }
            }
        }
   }

}
