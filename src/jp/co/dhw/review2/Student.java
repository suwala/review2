package jp.co.dhw.review2;

public class Student extends User{


	public Student(String f_name,String l_name,Integer _id){
		super(f_name, l_name, _id);
		
		/*イラナイ
		super.id = i;
		super.firstName=f_name;
		super.lastName=l_name;
		*/
	}
}