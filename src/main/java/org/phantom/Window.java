package org.phantom;

public class Window {
    private int width, height;
    private String title;

    private static Window window = null;

    private Window() {
        this.width = 1920;
        this.height = 1080;
        this.title = "phantom engine";
    }

    public static Window get() {
        if (Window.window == null) {
            Window.window = new Window();
        }

        return Window.window;
    }
}
