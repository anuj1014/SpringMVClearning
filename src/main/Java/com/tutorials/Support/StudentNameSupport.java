package com.tutorials.Support;

import java.beans.PropertyEditorSupport;

public class StudentNameSupport extends PropertyEditorSupport {

    //creating custom Property Editor Class for student name field
    //Now we need to register this class with @initBinder and Webdatabinder
@Override
    public void setAsText(String studentname)throws IllegalArgumentException{

    if (studentname.contains("Mr.")|| studentname.contains("Mrs.") || studentname.contains("Ms.")){
       setValue(studentname);
    }else
    {
        studentname="Mr. "+studentname;
        setValue(studentname);
    }
}

}
