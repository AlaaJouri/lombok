package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;
    private int id;


}*/
public record Student (
        String name,
        int id
){

    public Student(){
        this(null,0);
    }
    public void Test(){

    }
}
