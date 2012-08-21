package jp.co.dhw.review2

calss Teacher exstends User{

	public String subject;


	public teacher(String f_name,String l_name,Integer i,String _subject){
		super.id = i;
		super.firstName=f_name;
		super.lastName=l_name;
		this.subject = _subject;
	} 
	
	public String getSubject(){
		return subject;
	}
}