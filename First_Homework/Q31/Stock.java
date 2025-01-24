package First_Homework.Q31;

public class Stock {
    private String stockName;
    private int stockPrice;
    private int stockCurrent;

    public Stock(String stockName, int stockPrice, int stockCurrent) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        this.stockCurrent = stockCurrent;
    }

    public String getStockName() {
        return stockName;
    }

    public int getStockPrice() {
        return stockPrice;
    }

    public int getStockCurrent() {
        return stockCurrent;
    }

    public void setStockCurrent(int stockCurrent) {
        this.stockCurrent = stockCurrent;
    }
}