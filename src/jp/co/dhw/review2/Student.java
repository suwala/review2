package jp.co.dhw.review2;

class Student extends User{


	public Student(String f_name,String l_name,Integer i){
		super(f_name, l_name, i);
		
		super.id = i;
		super.firstName=f_name;
		super.lastName=l_name;
	}
}