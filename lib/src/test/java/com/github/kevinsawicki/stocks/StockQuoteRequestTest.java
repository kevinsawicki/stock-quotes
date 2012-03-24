/*
 * Copyright (c) 2011 Kevin Sawicki <kevinsawicki@gmail.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to
 * deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 */
package com.github.kevinsawicki.stocks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

/**
 * Unit tests of {@link StockQuoteRequest}
 */
public class StockQuoteRequestTest {

	private static Date date(String date) {
		final DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return format.parse(date);
		} catch (ParseException e) {
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	/**
	 * Get quote for single day
	 *
	 * @throws Exception
	 */
	@Test
	public void singleDay() throws Exception {
		StockQuoteRequest request = new StockQuoteRequest();
		request.setSymbol("tr");
		Date date = date("2011-12-22");
		request.setStartDate(date).setEndDate(date);
		assertTrue(request.next());
		assertTrue(request.getOpen() > 0);
		assertTrue(request.getHigh() > 0);
		assertTrue(request.getLow() > 0);
		assertTrue(request.getClose() > 0);
		assertTrue(request.getVolume() > 0);
		assertFalse(request.next());
	}
}
