package experiment4;

public class Village {
	static int waterAmount;  //ģ��ˮ����ˮ��
	int peopleNumber;  //��ׯ������
	String name;  //��ׯ������
	Village(String s){
		name = s;
	}
	static void setWaterAmount(int m){
		if(m>0)
			waterAmount = m;
	}
	void drinkWater(int n){
		if(waterAmount-n>=0){
			waterAmount = waterAmount-n;
			System.out.println(name+"����"+n+"��ˮ");
		}else
			waterAmount = 0;
	}
	static int lookWaterAount(){
		return waterAmount;
	}
	void setPeopleNumber(int n){
		peopleNumber = n;
	}
	int getPeopleNumber(){
		return peopleNumber;
	}
}