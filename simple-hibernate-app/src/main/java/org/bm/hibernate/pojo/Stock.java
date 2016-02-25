package org.bm.hibernate.pojo;

public class Stock {
	private static final long serialVersionUID = 1L;

	private Integer stockId;
	private String stockCode;
	private String stockName;

	public Stock() {
	}

	public Stock(final String stockCode, final String stockName) {
		this.stockCode = stockCode;
		this.stockName = stockName;
	}

	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(final Integer stockId) {
		this.stockId = stockId;
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(final String stockCode) {
		this.stockCode = stockCode;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(final String stockName) {
		this.stockName = stockName;
	}
}
