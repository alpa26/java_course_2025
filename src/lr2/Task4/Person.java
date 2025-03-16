package lr2.Task4;

public class Person {
    public String Name;
    public int Age;
    public String Sex;
    public Person(String _name,int _age,String _sex ){
        Name = _name;
        Age = _age;
        Sex = _sex;
    }
    public void SetName(String _name){
        Name = _name;
    }

    public String GetName(){
        return Name;
    }

    public void SetAge(int _age){
        Age = _age;
    }

    public int GetAge(){
        return Age;
    }

    public void SetSex(String _sex){
        Sex = _sex;
    }

    public String Sex(){
        return Sex;
    }
}
