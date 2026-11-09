package com.flipkart.automation.utils;

import com.microsoft.playwright.Page;
import java.nio.file.Files;
import java.nio.file.Path;

public class ScreenshotUtils {

    // Capture Screenshot
    public static void capture(Page page, String fileName) {

        try {
            Path directory = Path.of("screenshots");

            Files.createDirectories(directory);

            page.screenshot(
                    new Page.ScreenshotOptions()
                            .setPath(directory.resolve(fileName))
                            .setFullPage(true)
            );

        } catch (Exception e) {
            throw new RuntimeException(
                    "Screenshot could not be saved", e
            );
        }
    }
}