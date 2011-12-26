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

import static java.util.Calendar.DAY_OF_YEAR;
import static java.util.Calendar.YEAR;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Helpers for common dates
 */
public class DateUtils {

	/**
	 * Get today's date
	 *
	 * @return date
	 */
	public static Date today() {
		return new Date();
	}

	/**
	 * Get yesterday's date
	 *
	 * @return date
	 */
	public static Date yesterday() {
		final GregorianCalendar calendar = new GregorianCalendar();
		calendar.add(DAY_OF_YEAR, -1);
		return calendar.getTime();
	}

	/**
	 * Get the date of the first day of the year
	 *
	 * @return date
	 */
	public static Date yearStart() {
		final GregorianCalendar calendar = new GregorianCalendar();
		calendar.set(DAY_OF_YEAR, 1);
		return calendar.getTime();
	}

	/**
	 * Get the date of the last day of the year
	 *
	 * @return date
	 */
	public static Date yearEnd() {
		final GregorianCalendar calendar = new GregorianCalendar();
		calendar.add(YEAR, 1);
		calendar.set(DAY_OF_YEAR, 1);
		calendar.add(DAY_OF_YEAR, -1);
		return calendar.getTime();
	}
}
