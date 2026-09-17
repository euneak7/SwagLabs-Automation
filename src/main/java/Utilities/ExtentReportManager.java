
    package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

    public class ExtentReportManager {


        public static ExtentReports extent;

        public static void startReport() {

            ExtentSparkReporter spark =
                    new ExtentSparkReporter("test-output/ExtentReport.html");

            extent = new ExtentReports();
            extent.attachReporter(spark);
        }

        public static void flushReport() {

            extent.flush();
        }
    }

