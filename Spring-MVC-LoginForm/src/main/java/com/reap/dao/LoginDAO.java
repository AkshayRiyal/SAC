package com.reap.dao;
import com.reap.model.*;

public interface LoginDAO{    
       public boolean checkLogin(String userName, String userPassword);
}