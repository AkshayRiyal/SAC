package com.ttnd.reap.service;
import com.ttnd.reap.hibernate.model.*;

public interface ILoginService{    
       public boolean checkLogin(String userName, String userPassword);
}