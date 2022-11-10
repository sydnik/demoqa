package pages;

import framework.elements.Container;
import framework.elements.Label;
import org.openqa.selenium.By;

public class ResizablePage {
    private final Container box = new Container(By.id("resizableBoxWithRestriction"),"box");
    public String getSizeBoxWithRestriction(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return box.getAttribute("style");
    }
}
