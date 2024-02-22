package personalfinance;

import java.math.BigDecimal;
import java.time.Year;

public class Incomeprojection {
	
	    public Incomeprojection(BigDecimal projectedAmount, Year year, double growthRate) {
		super();
		this.projectedAmount = projectedAmount;
		this.year = year;
		this.growthRate = growthRate;
	}
		public Incomeprojection() {
			// TODO Auto-generated constructor stub
		}
		private BigDecimal projectedAmount;
	    public BigDecimal getProjectedAmount() {
			return projectedAmount;
		}
		public void setProjectedAmount(BigDecimal projectedAmount) {
			this.projectedAmount = projectedAmount;
		}
		public Year getYear() {
			return year;
		}
		
		public double getGrowthRate() {
			return growthRate;
		}
		public void setGrowthRate(double growthRate) {
			this.growthRate = growthRate;
		}
		private Year year;
	    private double growthRate;
		public void setYear1(int i) {
						
		}

}
