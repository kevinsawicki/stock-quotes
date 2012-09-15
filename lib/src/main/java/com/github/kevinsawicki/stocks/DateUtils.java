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
import static java.util.Calendar.MONTH;
import static java.util.Calendar.WEEK_OF_YEAR;
import static java.util.Calendar.YEAR;
import static java.util.Locale.US;

import java.util.Calendar;
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
    final GregorianCalendar calendar = new GregorianCalendar(US);
    calendar.add(DAY_OF_YEAR, -1);
    return calendar.getTime();
  }

  /**
   * Add the given number of days to the given date
   *
   * @param days
   * @param from
   * @return date
   */
  public static Date addDays(final int days, final Calendar from) {
    return addDays(days, from.getTimeInMillis());
  }

  /**
   * Add the given number of days to the given date
   *
   * @param days
   * @param from
   * @return date
   */
  public static Date addDays(final int days, final Date from) {
    return addDays(days, from.getTime());
  }

  /**
   * Add the given number of days to the given date
   *
   * @param days
   * @param from
   * @return date
   */
  public static Date addDays(final int days, final long from) {
    final GregorianCalendar date = new GregorianCalendar(US);
    date.setTimeInMillis(from);
    date.add(DAY_OF_YEAR, days);
    return date.getTime();
  }

  /**
   * Add the given number of months to the given date
   *
   * @param months
   * @param from
   * @return date
   */
  public static Date addMonths(final int months, final Calendar from) {
    return addMonths(months, from.getTimeInMillis());
  }

  /**
   * Add the given number of months to the given date
   *
   * @param months
   * @param from
   * @return date
   */
  public static Date addMonths(final int months, final Date from) {
    return addMonths(months, from.getTime());
  }

  /**
   * Add the given number of months to the given date
   *
   * @param months
   * @param from
   * @return date
   */
  public static Date addMonths(final int months, final long from) {
    final GregorianCalendar date = new GregorianCalendar(US);
    date.setTimeInMillis(from);
    date.add(MONTH, months);
    return date.getTime();
  }

  /**
   * Add the given number of years to the given date
   *
   * @param years
   * @param from
   * @return date
   */
  public static Date addYears(final int years, final Calendar from) {
    return addYears(years, from.getTimeInMillis());
  }

  /**
   * Add the given number of years to the given date
   *
   * @param years
   * @param from
   * @return date
   */
  public static Date addYears(final int years, final Date from) {
    return addYears(years, from.getTime());
  }

  /**
   * Add the given number of years to the given date
   *
   * @param years
   * @param from
   * @return date
   */
  public static Date addYears(final int years, final long from) {
    final GregorianCalendar date = new GregorianCalendar(US);
    date.setTimeInMillis(from);
    date.add(YEAR, years);
    return date.getTime();
  }

  /**
   * Add the given number of weeks to the given date
   *
   * @param weeks
   * @param from
   * @return date
   */
  public static Date addWeeks(final int weeks, final Calendar from) {
    return addWeeks(weeks, from.getTimeInMillis());
  }

  /**
   * Add the given number of weeks to the given date
   *
   * @param weeks
   * @param from
   * @return date
   */
  public static Date addWeeks(final int weeks, final Date from) {
    return addWeeks(weeks, from.getTime());
  }

  /**
   * Add the given number of weeks to the given date
   *
   * @param weeks
   * @param from
   * @return date
   */
  public static Date addWeeks(final int weeks, final long from) {
    final GregorianCalendar date = new GregorianCalendar(US);
    date.setTimeInMillis(from);
    date.add(WEEK_OF_YEAR, weeks);
    return date.getTime();
  }

  /**
   * Get the date of the first day of the current year
   *
   * @return date
   */
  public static Date yearStart() {
    final GregorianCalendar calendar = new GregorianCalendar(US);
    calendar.set(DAY_OF_YEAR, 1);
    return calendar.getTime();
  }

  /**
   * Get the date of the last day of the current year
   *
   * @return date
   */
  public static Date yearEnd() {
    final GregorianCalendar calendar = new GregorianCalendar(US);
    calendar.add(YEAR, 1);
    calendar.set(DAY_OF_YEAR, 1);
    calendar.add(DAY_OF_YEAR, -1);
    return calendar.getTime();
  }
}
