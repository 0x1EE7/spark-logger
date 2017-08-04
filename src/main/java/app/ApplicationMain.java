package app;

import app.utils.SparkUtils;
import org.apache.logging.log4j.Logger;

import static spark.Spark.get;

import org.apache.logging.log4j.LogManager;

public class ApplicationMain {

    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(ApplicationMain.class.toString());
        SparkUtils.createServerWithRequestLog(logger);

        get("/hello", (request, response) -> "world!");
    }
}