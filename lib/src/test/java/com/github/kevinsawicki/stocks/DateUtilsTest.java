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

import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.DAY_OF_YEAR;
import static java.util.Calendar.MONTH;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;

/**
 * Unit tests of {@link DateUtils}
 */
public class DateUtilsTest {

	/**
	 * Verify year start helper
	 */
	@Test
	public void yearStart() {
		Date date = DateUtils.yearStart();
		assertNotNull(date);
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		assertEquals(1, calendar.get(DAY_OF_YEAR));
	}

	/**
	 * Verify year start helper
	 */
	@Test
	public void yearEnd() {
		Date date = DateUtils.yearEnd();
		assertNotNull(date);
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		assertEquals(11, calendar.get(MONTH));
		assertEquals(31, calendar.get(DAY_OF_MONTH));
	}
}
