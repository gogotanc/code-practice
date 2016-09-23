
/**
 * 一美元 用 50、25、10、5、1美分兑换零钱，有多少种方法。
 * 答案是292种
 */
public class Main {

	public static void main(String[] args) {
		int result = cal(100);
		System.out.println(result);
	}

	public static int cal(int sum) {
		return cc(sum, 5);
	}

	public static int cc(int sum, int type) {

		if (0==sum) {
			return 1;
		} else if (0>sum || 0==type) {
			return 0;
		} else {
			return cc(sum, type-1) + cc(sum-bb(type), type);
		}
	}

	public static int bb(int type) {
		switch (type) {
			case 1:
				return 1;
			case 2:
				return 5;
			case 3:
				return 10;
			case 4:
				return 25;
			case 5:
				return 50;
		}
		return 0;
	}
}