/*
 * Copyright (C) 2003-2007 Jost Boekemeier
 *
 * Permission is hereby granted, free of charge, to any person obtaining a
 * copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.  IN NO EVENT SHALL
 * THE COPYRIGHT HOLDER(S) OR AUTHOR(S) BE LIABLE FOR ANY CLAIM, DAMAGES OR
 * OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */

package io.soluble.pjb.bridge;

/**
 * The log interface for the PHP/Java Bridge log.
 *
 * @author jostb
 * @see io.soluble.pjb.bridge.FileLogger
 * @see io.soluble.pjb.bridge.ChainsawLogger
 * @see io.soluble.pjb.bridge.SimpleLog4jLogger
 */
public interface ILogger {

    /**
     * fatal log level
     */
    static final int FATAL = 1;
    /**
     * error log level
     */
    static final int ERROR = 2;
    /**
     * info log level
     */
    static final int INFO = 3;
    /**
     * debug log level
     */
    static final int DEBUG = 4;

    /**
     * Log a stack trace
     *
     * @param t The Throwable
     */
    void printStackTrace(Throwable t);

    /**
     * Log a message.
     *
     * @param level The log level 0: FATAL, 1:ERROR, 2: INFO, 3: DEBUG
     * @param msg   The message
     */
    void log(int level, String msg);

    /**
     * Display a warning if logLevel &gt;= 1
     *
     * @param msg The warn message
     */
    void warn(String msg);
}