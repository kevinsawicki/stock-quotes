# Stock Quotes [![Build Status](https://travis-ci.org/kevinsawicki/stock-quotes.png)](https://travis-ci.org/kevinsawicki/stock-quotes)

Library for accessing historical stock prices using the Google Finance API.

The stock-quotes library is available from [Maven Central](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22com.github.kevinsawicki%22%20AND%20a%3A%22stock-quotes%22).

```xml
<dependency>
  <groupId>com.github.kevinsawicki</groupId>
  <artifactId>stock-quotes</artifactId>
  <version>1.2</version>
</dependency>
```

## Dependencies

* [kevinsawicki/http-request](http://github.com/kevinsawicki/http-request)

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
