package jp.co.dhw.review2;

class Teacher extends User{

	public String subject;


	public Teacher(String f_name,String l_name,Integer i,String _subject){
		
		super(f_name, l_name, i);
		
		super.id = i;
		super.firstName=f_name;
		super.lastName=l_name;
		this.subject = _subject;
	} 
	
	public String getSubject(){
		return subject;
	}
}