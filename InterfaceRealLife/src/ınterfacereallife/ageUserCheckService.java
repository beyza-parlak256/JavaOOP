package ınterfacereallife;
public class ageUserCheckService implements IUserCheckService{

    @Override
    public boolean checkUser(User user) {
         if (user.getAge() >= 18) {
            return true;
        }
        return false;
    }

 
    
}
