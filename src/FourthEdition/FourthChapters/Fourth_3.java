package FourthEdition.FourthChapters;
import static FourthEdition.util.PrintUtil.print;

import java.util.Random;

/**
 * 第四章控制执行流程 4.3.2
 * 
 * @Description:TODO
 * @exception:
 * @author: 徐正顺
 * @time:2017年9月26日 下午3:56:52
 */
public class Fourth_3 {
	/**
	 * 练习2
	 * @Description:TODO
	 * @param args
	 * void
	 * @exception:
	 * @author: 徐正顺
	 * @time:2017年9月26日 下午3:57:45
	 */
	public static void main(String[] args) {

		int j =-1;
		for(int i=0;i<25;i++){
			Random rand = new Random(i);
			
			int x = rand.nextInt(10);
			if(j!=-1){
			if(j>x){
				print("大于");
			}else if(j<x){
				print("小于");
			}else{
				print("等于");
			}
			}
			j=x;
			
		}
	}
}
