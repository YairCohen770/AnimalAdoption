package AnimalAdoption.AuxiliaryDepartment;

import AnimalAdoption.ObjectDepartment.Token;

import java.util.Date;

public class AuxiliaryFunctions {

    public boolean isTheTimePassed(Date createdDate, Token token) {
        java.util.Date now = new java.util.Date();
        return (int) ((now.getTime() - createdDate.getTime()) / 1000) > token.expires_in;
    }


}
