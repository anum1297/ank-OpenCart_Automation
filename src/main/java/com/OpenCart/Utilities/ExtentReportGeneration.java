package com.OpenCart.Utilities;

import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGeneration {

    // Method to create and configure the ExtentReports object
    public static ExtentReports getReportObjects() {
        
        // Define the path where the report will be generated
        String path = System.getProperty("user.dir") + "//reports//report.html";
        
        // Initialize the ExtentSparkReporter with the report file path
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        
        // Configure the report details
        reporter.config().setReportName("OpenCart Automated Test Report");
        reporter.config().setDocumentTitle("Test Results");
        reporter.config().setTheme(Theme.STANDARD);  // Set the theme of the report
        reporter.config().setEncoding("utf-8");  // Set the encoding of the report
        reporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");  // Set the timestamp format
        reporter.config().setCss(".badge-primary { background-color: #1a73e8; }");  // Customize the CSS of the report
        
        // Initialize the ExtentReports object and attach the reporter
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
        
        // Set additional system information for the report
        extent.setSystemInfo("Tester", "Aniket");
        extent.setSystemInfo("Environment", "QA");
        extent.setAnalysisStrategy(AnalysisStrategy.TEST);
        
        // Return the configured ExtentReports object
        return extent;
    }
}
