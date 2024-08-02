1)What is Logging?
  Logging is the process of recording events, messages, or other information from an application or system into a log file or logging system. This information can be used for monitoring, debugging, and analyzing the behavior and performance of the application. Logs can include various types of data such as errors, warnings, informational messages, and debugging information.
2)Why Logging is Important?
  Logging is important for the following reaons:

   Debugging: When something goes wrong, logs provide a detailed record of what was happening in the application at the time of the issue.
   Performance Analysis: By analyzing logs, developers can identify performance bottlenecks and optimize the application
   Monitoring: Logs help in keeping an eye on the health and performance of an application.

3)understanding Logging Levels:
   Logging levels categorize the importance and type of the log messages.
   

   1. DEBUG
     Purpose: Detailed information useful for diagnosing problems.
     Example: "User 'john_doe' clicked the 'Login' button."
             When to Use: During development and debugging. These messages are usually turned off in a production environment to avoid clutter.
2. INFO
    Purpose: General information about the application's regular operations.
    Example: "Application started successfully."
            When to Use: To keep track of the normal flow of the application. It’s useful for understanding the sequence of events.
3. WARN
    Purpose: Indication of potential problems or situations that might cause issues.
    Example: "Low disk space on the server."
            When to Use: To highlight situations that aren’t errors but could lead to problems if not addressed.
4. ERROR
   Purpose: Indication of serious issues that need to be investigated.
   Example: "Database connection failed."
            When to Use: When the application encounters an issue that prevents it from functioning correctly. These messages typically require immediate attention.
5. FATAL
   Purpose: Critical issues that cause the application to crash or become unusable.
   Example: "Unrecoverable error. Shutting down."
            When to Use: For severe errors that lead to termination of the application. This level is rarely used but crucial when it is.
