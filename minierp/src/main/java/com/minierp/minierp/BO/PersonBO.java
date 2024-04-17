package com.minierp.minierp.BO;

import com.minierp.minierp.model.*;
import com.minierp.minierp.DO.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PersonBO {


    public PersonDO getPersonDO() {
        return personDO;
    }

    public void setPersonDO(PersonDO personDO) {
        this.personDO = personDO;
    }

    @Autowired
    private  PersonDO personDO;


    public int addPerson(Person person ){
        int personid = personDO.createPerson(person);

        return personid;
    }
}
