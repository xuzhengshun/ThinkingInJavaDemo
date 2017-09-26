package FourthEdition.ThirdChapters;
import static FourthEdition.util.PrintUtil.*;
/**
 * 赋值 引用覆盖
 * @Description:TODO
 * @exception:
 * @author: 徐正顺
 * @time:2017年9月26日 下午1:50:01
 */
public class Third_3_4 {

	public static void main(String[] args) {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.xzs=9;
		t2.xzs=47;
		print("1: t1.level:"+t1.xzs+", t2.level:"+t2.xzs);
		//t1=t2;
		t1.xzs=t2.xzs;
		print("2: t1.level:"+t1.xzs+", t2.level:"+t2.xzs);
		t1.xzs=27;
		print("3: t1.level:"+t1.xzs+", t2.level:"+t2.xzs);
		print(t1+"&&&&"+t2);
		print("____________________________________");
		print(2<<2);
		print(2>>2);
		
		print(2>>>2);
	}
}
class Tank{
	int level;
	float xzs ;
}