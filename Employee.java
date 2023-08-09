
package com.mycompany.myproject;

public class Employee {
    
    private String name;
    private String position;
    private Double salary;
    private int experience;
    private String educational_level;
    private Boolean full_time;
    
    
    public Employee(String name,String position,
            Double salary,int experience,String educational_level,Boolean full_time ){
    
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.experience = experience;
        this.educational_level = educational_level;
        this.full_time = full_time;
        
        
    }
    
    //
    
    Double calculateSalary(){
        
        /*(basic salary) + (basic salary * 5% * Experience)
        if the educational level is Bachelor Degree 500 and 250 for diploma otherwise 0
        The Bonus should be calculated using this formula
        Full time : (basic Salary * 3%)
        Part Time : (basic Salary * 1.5%)*/
        
        Double totalSalary;
        Double bouns;
        
        if(educational_level == "bachelor"){
        
            if(full_time==true){
                totalSalary = salary + (salary*0.05*experience) + 500 + (salary * 0.03);
            }
            
            else{
                totalSalary = salary + (salary*0.05*experience) + 500 + (salary * 0.015);
            }
        
        
        }
        
        else if(educational_level == "diploma"){
            
            if(full_time==true){
                totalSalary = salary + (salary*0.05*experience) + 250 + (salary * 0.03);
            }
            
            else{
                totalSalary = salary + (salary*0.05*experience) + 250 + (salary * 0.015);
            }
            
        }
        
        else{
            
            if(full_time==true){
                totalSalary = salary + (salary*0.05*experience) + (salary * 0.03);
            }
            
            else{
                totalSalary = salary + (salary*0.05*experience) + (salary * 0.015);
            }
            
        }
        
        return totalSalary;
    }
    
}

