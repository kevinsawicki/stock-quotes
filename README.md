# Stock Quotes

Library for accessing historical stock prices using the Google Finance API.

## Usage

### Get the closing prices for the current year

The following example requests the prices of the stock symbol `tr` for the
current year and prints out the closing price for each day.

```java
StockQuoteRequest request = new StockQuoteRequest();
request.setSymbol("tr");
request.setStartDate(DateUtils.yearStart());
request.setEndDate(DateUtils.yearEnd());

while(request.next())
  System.out.println(request.getDate() + ": " + request.getClose());
```

