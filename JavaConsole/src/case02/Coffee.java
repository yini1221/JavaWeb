package case02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

/*
 * 可擴充: add(...)
 * 邏輯可分離: 條件與邏輯分開
 * 容易測試
 * 可以利用 lambda 開發與理解上較為值觀
 * */
public class Coffee {
	private Double milk;
	private Double coffee;
	
	// 建立一個內部類來代表一種咖啡類型的判斷規則
	static class CoffeeRule {
		// 咖啡類型名稱
		private String type;
		// 咖啡描述
		private String description;
		// 條件的判斷邏輯
		private BiPredicate<Double, Double> condition;
		
		public CoffeeRule(String type, String description, BiPredicate<Double, Double> condition) {
			this.type = type;
			this.description = description;
			this.condition = condition;
		}
		
		// 符合比對
		public boolean matches(Double milk, Double coffee) {
			return condition.test(milk, coffee);
		}
		
		public String getResult() {
			return type + ": " + description;
		}
		
	}
	
	// 可以儲存所有咖啡規則的清單
	private static final List<CoffeeRule> rules = new ArrayList<>();
	
	// 類別資料初始化區段
	static {
		// 初始化規則
		rules.add(new CoffeeRule("濃郁的拿鐵", "牛奶的比例遠高於咖啡，味道偏向牛奶。", (milk, coffee) -> milk >= 3 * coffee));
		
	}
	
}
