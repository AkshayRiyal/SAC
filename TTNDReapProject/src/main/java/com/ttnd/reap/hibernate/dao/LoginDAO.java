package com.ttnd.reap.hibernate.dao;
import com.ttnd.reap.hibernate.model.*;

public interface LoginDAO{    
       public boolean checkLogin(String userName, String userPassword);
}