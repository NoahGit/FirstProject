public class Demo2 {
  private String name;
  private int age;
  private char sex;
  
  public Demo2(String name, int age, char sex) {
	// TODO Auto-generated constructor stub
	  this.name = name;
	  this.age = age;
	  this.setSex(sex);
}
public void info(){
	  System.out.println("我的错"+this.name);
  }
  public int addAge(int a){
	  return this.age+a;
  }
  
  public static void main(String[] args) {
	Demo2 demo2 = new Demo2("我的错错错",18,'女');
	demo2.info();
}
public char getSex() {
	return sex;
}
public void setSex(char sex) {
	this.sex = sex;
}
}
