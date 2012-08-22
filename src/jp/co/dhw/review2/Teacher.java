package jp.co.dhw.review2;

public class Teacher extends User{

	public String subject;


	public Teacher(String f_name,String l_name,Integer _id,String _subject){
		
		//super(引数);は親クラスの引数付きコンストラクタを呼び出している
		//今回はf_name,l_name,iをUser.user(string,string,integer)に渡す
		super(f_name, l_name, _id);
		
		/*イラナイ
		super.id = i;
		super.firstName=f_name;
		super.lastName=l_name;
		*/
		this.subject = _subject;
	} 
	
	public String getSubject(){
		return subject;
	}
}