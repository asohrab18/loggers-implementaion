# loggers-repo

This repository contains files for loggers implementation in Java Maven Project.



\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_



Log Level Breakdown in Log4j:

FATAL: Severe error that leads to the termination of the application.

ERROR: Error events that might still allow the application to continue running.

WARN: Potentially harmful situations or important warnings.

INFO: Informational messages about the general operation of the application.

DEBUG: Detailed information for debugging purposes.

TRACE: Most detailed information, typically for very fine-grained debugging.



A Few Things to Keep in Mind:

FATAL is the highest level of logging severity, so you won't see anything less severe (like DEBUG or INFO) logged when this setting is used.

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_



log4j.rootCategory=INFO, CONSOLE, LOGFILE



The log4j.rootCategory configuration property in Log4j specifies the root logger's log level and appenders, which determine where and how log messages are output. 



INFO: This specifies the logging level. Log messages of this level and higher (e.g., WARN, ERROR, FATAL) will be logged.



CONSOLE: This indicates that log messages will be output to the console (usually the application's standard output).



LOGFILE: This indicates that log messages will also be output to a log file. You'll need to define the log4j.appender.LOGFILE properties separately to specify the file path, layout, and other options for the file appender.



\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_



log4j.logger.org.apache.axis2.enterprise=FATAL



It looks like you're configuring a log4j logging level for a specific package or class in an Apache Axis2 application. It sets the logging level for the "org.apache.axis2.enterprise" package to FATAL. This means that only the most severe log messages (i.e., those related to fatal errors) will be logged for this particular package. 

Similarly, we can also configure for other packages as:



log4j.logger.de.hunsicker.jalopy.io=FATAL

log4j.logger.httpclient.wire.header=FATAL

log4j.logger.org.apache.commons.httpclient=FATAL

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_



log4j.appender.CONSOLE=org.apache.log4j.ConsoleAppender



It is a configuration directive in a Log4j 1.x configuration file (log4j.properties). Here's a breakdown of what it does:

log4j.appender.CONSOLE: This defines a new appender named CONSOLE.



=org.apache.log4j.ConsoleAppender: Specifies that this appender will be of type ConsoleAppender, which outputs log messages to the console (standard output or standard error).



To make this appender functional, additional properties are usually set, like the layout and the target. Here's a complete example:



\# Define the console appender

log4j.appender.CONSOLE=org.apache.log4j.ConsoleAppender



\# Set the layout for the appender

log4j.appender.CONSOLE.layout=org.apache.log4j.PatternLayout

log4j.appender.CONSOLE.layout.ConversionPattern=%d{dd-MMM-yyyy HH:mm:ss} %-5p %c  %M - %m%n

\# log4j.appender.CONSOLE.layout.ConversionPattern=%d{ISO8601} \[%t] %-5p %c - %m%n



\# Optionally, set the target (System.out or System.err)

log4j.appender.CONSOLE.Target=System.out



\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_



\# LOGFILE is set to be a File appender using a PatternLayout.

log4j.appender.LOGFILE=org.apache.log4j.FileAppender



It is part of a Log4j configuration file (typically log4j.properties). Here's a breakdown of what it does:

log4j.appender.LOGFILE defines a new appender named LOGFILE.



=org.apache.log4j.FileAppender specifies that this appender is a FileAppender, which writes logging output to a file.



To make this appender functional, we typically need to add a few more properties:

\# Define the file to write to

log4j.appender.LOGFILE.File=C:/logs/testing\_app/logs\_info.log



\# Define the layout (format) for the log messages

log4j.appender.LOGFILE.layout=org.apache.log4j.PatternLayout

\# log4j.appender.LOGFILE.layout.ConversionPattern=%d \[%t] %-5p %c - %m%n

log4j.appender.LOGFILE.layout.ConversionPattern=%d{dd-MMM-yyyy HH:mm:ss} %-5p %c  %M - %m%n



\# (Optional) Append to the file instead of overwriting

log4j.appender.LOGFILE.Append=true



\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_



"log4j.appender.CONSOLE.layout.ConversionPattern" setting in Log4j 1.x defines how log messages are formatted when they are output to the console. The ConversionPattern uses conversion characters (prefixed with %) to represent different parts of the log message.



Here are some commonly used conversion characters and example values:

%d{pattern} means Date/time of the log event (e.g., %d{ISO8601} or %d{yyyy-MM-dd HH:mm:ss})

%p means Log level (e.g., INFO, DEBUG)

%c means Logger name (category)

%C means Fully qualified class name

%t means Thread name

%m means The actual log message

%M means Method name

%n means Platform-specific newline

%l means Location info (class, method, file, and line number) – expensive performance-wise

%L means Line number

%x means Nested diagnostic context (NDC)





Example: log4j.appender.CONSOLE.layout.ConversionPattern=%d{yyyy-MM-dd HH:mm:ss} \[%t] %-5p %c{1} (%F:%L) - %m%n



Tips:

\* %c{1} shortens the logger name to the last part (e.g., com.example.MyClass becomes MyClass).

\* Avoid using %l unless needed – it's very slow due to stack trace analysis.

\* Use %-5p to left-align the log level in a 5-character wide field.



Some more examples:



\[a] 

log4j.appender.CONSOLE.layout.ConversionPattern=%d{dd-MMM-yyyy HH:mm:ss} %p%m%n

16-May-2025 15:28:16 INFOWelcome to Logger's World!

16-May-2025 15:28:16 INFOGood Bye!



NOTE: We can see that there is no space between INFO and actual message of the log.



\[b]

log4j.appender.CONSOLE.layout.ConversionPattern=%d{dd-MMM-yyyy HH:mm:ss} %-5p%m%n

16-May-2025 15:25:35 INFO Welcome to Logger's World!

16-May-2025 15:25:35 INFO Good Bye!



NOTE: We can see that there are (5 - 4 characters of INFO) = 1 character space between INFO and actual message of the log.



\[c]

log4j.appender.CONSOLE.layout.ConversionPattern=%d{dd-MMM-yyyy HH:mm:ss} %-10p%m%n

16-May-2025 15:26:23 INFO      Welcome to Logger's World!

16-May-2025 15:26:23 INFO      Good Bye!



NOTE: We can see that there are (10 - 4 characters of INFO) = 6 characters spaces between INFO and actual message of the log.



\[d]

log4j.appender.CONSOLE.layout.ConversionPattern=%d{dd-MMM-yyyy HH:mm:ss} %-15p%m%n

16-May-2025 15:27:28 INFO           Welcome to Logger's World!

16-May-2025 15:27:28 INFO           Good Bye!



NOTE: We can see that there are (15 - 4 characters of INFO) = 11 characters spaces between INFO and actual message of the log.



\[e]

log4j.appender.CONSOLE.layout.ConversionPattern=%d{dd-MMM-yyyy HH:mm:ss} %p | class=%c | method=%M | Line=%L | thread=%t | Message=%m%n

16-May-2025 15:51:10 INFO | class=com.learning.logging.AppUtils | method=show | Line=10 | thread=main | Message=Welcome to Logger's World!

16-May-2025 15:51:10 INFO | class=com.learning.logging.AppUtils | method=show | Line=11 | thread=main | Message=Good Bye!



\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_





