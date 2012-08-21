package jp.co.dhw.review2

public class User{
	public Integer id;
	public String firstName;
	public String lastName;

	public void showName(){
		System.out.println(this.firstName+":"+this.lastName);
	}

//引数によって初期化？
	public user(String f_name,String l_name,Integer i){
		id = i;
		this.firstName=f_name;
		this.lastName=l_name;
	}

	public void showId(){
		System.out.println(this.id);
	}

//4のプログラム
	public static void main(String args[]){
		User kuni = new User("国崎","宏治",1);
		User wari = new User("割鞘","洋介",2);
		User nagi = new User("奈木野","純一",3);
		User kane = new User("鐘ヶ江","耕治",4);
		User hana = new User("花田","亘一",5);
		User nogu = new User("野口","龍真",6);
		User take = new User("武田","憲隆",7);
		User ima = new User("今田","尭",8);
		User sake = new User("酒見","慎悟",9);
		User naito = new User("内藤","初美",10);

		kuni.showId;
		kuni.showName;

		wari.showId;
		wari.showName;

		nagi.showId;
		nagi.showName;

		kane.showId;
		kane.showName;

		hana.showId;
		hana.showName;

		nogu.showId;;
		nogu.showName;

		take.showId;
		take.showName;

		ima.showId;
		ima.showName;

		sake.showId;
		sake.showName;

		natio.showId;
		naito.showName;

//7のプログラム

		Student[22] student;
		student[0] = new Student("武田","憲隆",1);
		student[1] = new Student("高木","香",2);
		student[2] = new Student("徳永","裕介",3);
		student[3] = new Student("柴田","伊織",4);
		student[4] = new Student("長尾","有希子",5);
		student[5] = new Student("酒見","真悟",6);
		student[6] = new Student("竹末","憲和",7);
		student[7] = new Student("國崎","宏治",8);
		student[8] = new Student("割鞘","洋介",9);
		student[9] = new Student("榎枝","大悟",10);
		student[10] = new Student("今田","尭",11);
		student[11] = new Student("松隈","恭子",12);
		student[12] = new Student("花田","恒一",13);
		student[13] = new Student("内藤","初美",14);
		student[14] = new Student("原田","清司",15);
		student[15] = new Student("永野","修平",16);
		student[16] = new Student("奈木野","純一",17);
		student[17] = new Student("山之内","洋平",18);
		student[18] = new Student("鐘ヶ江","耕治",19);
		student[19] = new Student("野口","龍真",20);
		student[20] = new Student("山野","兼治",21);
		student[21] = new Student("皆川","洋介",22);

		for(int i;i<student.length;i++){
			student[i].showId;
			student[i].showName;
		}

		Teacher[7] teacher;
		teacher[0] = new Teacher("長澤","大輔",1,"デザイン");
		teacher[1] = new Teacher("ラディ","ジェイソン",2,"デザイン");
		teacher[2] = new Teacher("薄井","隆",3,"Webアプリ");
		teacher[3] = new Teacher("山本","浩司",4,"3DCG");
		teacher[4] = new Teacher("ハナブサ","ノブユキ",5,"デザイン");
		teacher[5] = new Teacher("コヌマ","ヨシツグ",6,"Webアプリ");
		teacher[6] = new Teacher("渡部","昇治",7,"Webアプリ");

		for(int i;i<teacher.length;i++){
			teacher[i].showId;
			teacher[i].showName;
			System.out.println("教科"+teacher[i].subject);
		}


	}
}