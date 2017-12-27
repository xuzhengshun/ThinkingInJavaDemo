package FourthEdition.FifthhCapters;
import static FourthEdition.util.PrintUtil.*;
/**
 * 第五章 5.5.3 垃圾回收的终结条件
 * 
 * @Description:TODO
 * @author: xzs
 * @time:2017年9月26日 下午9:35:06
 */
public class Five_5_3 {

	public static void main(String[] args) {
		Book novel = new Book(true);
		novel.checkIn();
		new Book(true);
		System.gc();
	}
}

class Book {
	boolean checkedOut = false;

	Book(boolean checkOut) {
		checkedOut = checkOut;
	}

	void checkIn(){
		 checkedOut = false;
	}
	protected void finalize(){
		if(checkedOut){
			print("Error: checked out");
		}
	}
}
